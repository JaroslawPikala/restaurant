package pl.coderslab.tables;

import pl.coderslab.reservation.Reservation;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
public class Tables {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 3, max = 15)
    private String name;


    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "table")
    private Set<Reservation> reservations;

    @Transient
    private List<Reservation> nextReservaions;

    @Transient
    private Reservation currentReservation;

    public Tables() {
    }

    public Tables(@NotBlank @Size(min = 3, max = 15) String name, Integer phoneNumber, Date date, Set<Reservation> reservations, List<Reservation> nextReservaions, Reservation currentReservation) {
        this.name = name;
        this.reservations = reservations;
        this.nextReservaions = nextReservaions;
        this.currentReservation = currentReservation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<Reservation> getNextReservaions() {
        return reservations.stream().filter(item->item.getStartDate().after(new Date())).collect(Collectors.toList());
    }

    public Reservation getCurrentReservation() {
        return reservations.stream().filter(item-> item.getStartDate().after(new Date()) && item.getStopDate().before(new Date())).findFirst().orElse(null);
    }
}

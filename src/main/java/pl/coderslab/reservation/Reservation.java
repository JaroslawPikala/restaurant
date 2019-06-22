package pl.coderslab.reservation;

import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import pl.coderslab.tables.Tables;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalTime;
import java.util.Date;


@Entity
public class Reservation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Boolean getReservated() {
        return isReservated;
    }

    public void setReservated(Boolean reservated) {
        isReservated = reservated;
    }

    @Type(type = "numeric_boolean")
    private Boolean isReservated;

    @NotBlank
    @Size(min = 3, max = 15)
    private String name;

    @NumberFormat
    private String phoneNumber;

    @ManyToOne
    private Tables table;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date stopDate;

    @NotNull
    private LocalTime startTime;

    @NotNull
    private LocalTime endTime;

    public Date getStartDate() {
        return startDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStopDate() {
        return stopDate;
    }

    public void setStopDate(Date stopDate) {
        this.stopDate = stopDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Tables getTable() {
        return table;
    }

    public void setTable(Tables table) {
        this.table = table;
    }

    public Reservation() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String textMessage(){
        return String.format("Zarezerwowano stolik: %s, dnia %s o godzinie: %s. Serdecznie zapraszamy i życzymy smacznego! \uD83D\uDE42", this.name,
                this.startDate, this.startTime);
    }
}

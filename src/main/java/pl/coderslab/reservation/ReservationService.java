package pl.coderslab.reservation;


import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.smsapi_java_client_example.SmsApiService;

import java.util.List;

@Service
@Transactional
public class ReservationService {

    private ReservationRepository reservationRepository;

    private SmsApiService smsApiService;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository, SmsApiService smsApiService) {
        this.reservationRepository = reservationRepository;
        this.smsApiService = smsApiService;
    }

    public void saveReservation(Reservation reservation) {
        reservationRepository.save(reservation);
        smsApiService.send(reservation.getPhoneNumber(), reservation.textMessage());
    }

    public Reservation read(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }


    public void update(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    public void delete(Long id) {
        reservationRepository.deleteReservationRelation(id);
        reservationRepository.deleteById(id);
    }

    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    public Reservation reservationWithTables(Long id) {
        Reservation reservation = read(id);
        Hibernate.initialize(reservation.getTable());
        return reservation;
    }


}

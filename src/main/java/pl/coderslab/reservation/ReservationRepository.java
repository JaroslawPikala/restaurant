package pl.coderslab.reservation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

List<Reservation> findByTableIdAndAndStartDate(Long tableId, LocalDate date);


    @Modifying
    @Query(value = "update Reservation set table_id = null where id = ?1", nativeQuery = true)
    void deleteReservationRelation(Long reservationId);
}



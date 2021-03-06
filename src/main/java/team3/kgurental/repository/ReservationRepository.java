package team3.kgurental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import team3.kgurental.model.entity.Reservation;
import team3.kgurental.model.entity.User;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {
    @Query(value = "select r from Reservation r where r.user = :user")
    List<Reservation> reservationFind(@Param("user") User user);

}


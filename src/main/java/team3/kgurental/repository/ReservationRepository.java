package team3.kgurental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import team3.kgurental.model.entity.Reservation;
import team3.kgurental.model.entity.User;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {
    @Query(value = "select r from Reservation r where r.user = :user")
    Reservation reservationFind(User user);

}


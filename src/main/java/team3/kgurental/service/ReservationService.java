package team3.kgurental.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team3.kgurental.model.entity.Reservation;
import team3.kgurental.model.entity.User;
import team3.kgurental.repository.ReservationRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationRepository reservationRepository;

    //사용자 대여 등록
    public Long reservation(Reservation reservation){
        reservationRepository.save(reservation);
        return reservation.getId();
    }

    //사용자 대여 리스트
    public List<Reservation> reservationList(){return reservationRepository.findAll();}


    //사용자 대여 조회
    public List<Reservation> reservationFindByUser(User user){
        return reservationRepository.reservationFind(user);
    }

    //사용자 대여 취소
    public void reservationDelete(Reservation reservation){
        reservationRepository.delete(reservation);
    }

    //사용자 대여 수정은 컨트롤러에서 구현

}

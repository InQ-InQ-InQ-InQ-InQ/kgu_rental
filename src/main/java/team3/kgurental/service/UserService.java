package team3.kgurental.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team3.kgurental.model.entity.User;
import team3.kgurental.repository.UserRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    //전체보기
    public List<User> findUsers() {
        return userRepository.findAll();

    }
    //회원가입
    public String join(User user){
        userRepository.save(user);
        return user.getUserId();
    }
}

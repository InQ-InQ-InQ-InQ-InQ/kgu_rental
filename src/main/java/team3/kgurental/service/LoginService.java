package team3.kgurental.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import team3.kgurental.model.entity.User;
import team3.kgurental.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserRepository userRepository;



    public User login(String loginId, String password) {
        List<User> byLoginId = userRepository.findByLoginId(loginId);
        for (User user : byLoginId) {
            String StudentId = user.getUserId();
            String password1 = user.getPassword();
            if (StudentId.equals(loginId))
            {
                if (password1.equals(password))
                {
                    return user;  //아이디 비번 일치시 해당학생 리턴
                }
            }

        }
        return null;    //없으면 널 리턴
    }

}

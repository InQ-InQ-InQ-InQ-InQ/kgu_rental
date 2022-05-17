package team3.kgurental.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import team3.kgurental.model.entity.User;
import team3.kgurental.service.LoginService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class LoginController {

    private final LoginService loginService;

    public User user;




    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("loginForm",new LoginForm());
        return "login";

    }



    @PostMapping("/login")
    public String create(Model model, LoginForm loginForm, BindingResult result, HttpServletRequest request) {

        if (result.hasErrors()) {      //에러캐치
            return "login";
        }

        User loginUser = loginService.login(loginForm.getId(), loginForm.getPassword());


        if (loginUser == null) {            //등록된 회원이 없을때
            result.reject("loginFail", "아이디 또는 비밀번호가 맞지 않습니다.");
            return "loginError";
        }

        HttpSession session =request.getSession();
        session.setAttribute(SessionConstants.LOGIN_USER,loginUser);

        if (loginUser.getUserId().equals("admin")){       //관리자 로그인

            return "redirect:/adminPage";

        }


        return "redirect:/";
    }

}

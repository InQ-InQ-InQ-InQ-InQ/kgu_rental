package team3.kgurental.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import team3.kgurental.model.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
public class HomeController {




    @RequestMapping("/")
    public String home(HttpServletRequest request, Model model){
        HttpSession session =request.getSession(false);

        if(session==null) {
            return "index";
        }

        User loginUser=(User)session.getAttribute(SessionConstants.LOGIN_USER);

        if(loginUser==null){
            return "index";
        }

        model.addAttribute("user",loginUser);

        return "index";
    }

    @RequestMapping("/mypage")
    public String myPage(){
        return "mypage";
    }



}

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
public class AdminController {
//관리자페이지
    @RequestMapping("/")
    public String home(HttpServletRequest request, Model model){
        HttpSession session =request.getSession(false);

        if(session==null) {
            return "adminPage";//만들어야함.adminPage/Item/등록+수정+삭제, adminPage/allItemManagers, adminPage/allReservations.
        }

        User loginUser=(User)session.getAttribute(SessionConstants.LOGIN_USER);

        if(loginUser==null){
            return "adminPage";
        }

        model.addAttribute("admin",loginUser);

        return "adminPage";
    }



}

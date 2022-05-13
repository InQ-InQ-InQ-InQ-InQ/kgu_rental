package team3.kgurental.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import team3.kgurental.model.entity.Item;
import team3.kgurental.model.entity.User;
import team3.kgurental.service.ItemService;

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

    private final ItemService itemService;

    @GetMapping("/adminPage/Item")
    public String itemDeleteGET(Model model){
        model.addAttribute("itemDeleteForm", new ItemDeleteForm());
        return "DeleteForm";
    }

    @PostMapping("/adminPage/Item/itemDelete")
    public String itemDeletePOST (HttpServletRequest request,ItemDeleteForm itemDeleteForm){
        Item item = new Item();
        itemService.itemDelete(item.getId());
        return "redirect:/admin";
    }


}

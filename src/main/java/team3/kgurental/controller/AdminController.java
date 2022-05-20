package team3.kgurental.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import team3.kgurental.model.entity.Item;
import team3.kgurental.model.entity.Reservation;
import team3.kgurental.model.entity.User;
import team3.kgurental.service.ItemService;
import team3.kgurental.service.ReservationService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class AdminController {

//관리자페이지

    @RequestMapping("/adminPage")
    public String home(HttpServletRequest request){
        HttpSession session =request.getSession(false);

        return "adminPage";
    }

    private final ItemService itemService;

    @GetMapping("/adminPage")
    public String items(Model model){
        List<Item> items = itemService.allItemView();
        model.addAttribute("items",items);
        return "/adminPage";
    }


    @PostMapping("/adminPage/{itemId}/itemDelete")
    public String itemDelete (@PathVariable("itemId") Long itemId){
        itemService.itemDelete(itemId);
        return "redirect:/adminPage";
    }



    private final ReservationService reservationService;

    //대여 전체조회
    @GetMapping("/adminPage/reservationList")
    public String reservationList(Model model){
        List<Reservation> reservations = reservationService.reservationList();
        model.addAttribute("reservations",reservations);
        return "reservationList";
    }




}

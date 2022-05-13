package team3.kgurental.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import team3.kgurental.model.entity.Item;
import team3.kgurental.model.entity.Reservation;
import team3.kgurental.model.entity.User;
import team3.kgurental.service.ItemService;
import team3.kgurental.service.ReservationService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserReservationController {

    private final ItemService itemService;
    private final ReservationService reservationService;

    //사용자 대여
    @GetMapping("/selectDate")
    public String selectDateForm(Model model){
        model.addAttribute("selectDateForm",new SelectDateForm());
        return "selectDate";
    }

    @PostMapping("/selectDate")
    public String selectDate(Model model,SelectDateForm selectDateForm){

        String date = selectDateForm.date;
        List<Item> items=new ArrayList<>();
        List<Item> itemList=itemService.allItemView();
        for(Item item:itemList){
            if(item.getItemCount()>=1){
                items.add(item);//아이템 개수가 한개 이상인 것들만 사용자에게 보여주기 위한 리스트에 담는다.
            }
        }

        model.addAttribute("date", date );
        model.addAttribute("items",items);

        return "reservationForm";
    }

    @PostMapping("/reservation")
    public String reservation(HttpServletRequest request, @RequestParam("itemId") Long itemId, @RequestParam("date") String date){

        HttpSession session =request.getSession();
        User loginUser = (User)session.getAttribute(SessionConstants.LOGIN_USER);
        List<Item> items=itemService.allItemView();
        Item reservationItem=null;
        for(Item findItem:items){
            if(findItem.getId()==itemId){

                reservationItem=findItem;
                findItem.setItemCount(findItem.getItemCount()-1);//예약했으므로 수량 하나 줄임

                break;
            }
        }

        Reservation reservation=new Reservation();
        reservation.setReservationDate(date+"18시 까지");
        reservation.setUser(loginUser);
        reservation.setItem(reservationItem);

        reservationService.reservation(reservation);




        return "redirect:/";
    }

}

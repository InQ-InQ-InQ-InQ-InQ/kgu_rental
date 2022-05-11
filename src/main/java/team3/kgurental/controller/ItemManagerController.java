package team3.kgurental.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import team3.kgurental.model.entity.Item;
import team3.kgurental.model.entity.User;
import team3.kgurental.service.ItemManagerService;
import team3.kgurental.service.ItemService;
import team3.kgurental.service.UserService;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ItemManagerController {
    //대여기능컨트롤러

    private final ItemManagerService itemManagerService;
    private final UserService userService;
    private final ItemService itemService;

    @GetMapping("/rental")
    public String createForm(Model model){
        List<User> users = userService.findUsers();
        List<Item> items = itemService.allItemView();

        model.addAttribute("users",users);
        model.addAttribute("items",items);

        return "rental/rentalForm";

    }

    /*
    @PostMapping("/rental")
    public String itemManager(@RequestParam("userId") long userId,
                              @RequestParam("itemId") long itemId,
                              @RequestParam("itemManagerId") BigInteger itemManagerId,
                              @RequestParam("rentalDate") LocalDate rentalDate,
                              @RequestParam("returnDate") LocalDate returnDate){
        //ItemManagerService.itemManager(userId, itemId, itemManagerId, rentalDate, returnDate);
    }
    */

}

package team3.kgurental.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import team3.kgurental.model.entity.Item;
import team3.kgurental.service.ItemService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class ItemRegisterController {
    private final ItemService itemService;


    @GetMapping("/register")
    public String itemRegister(Model model){
    model.addAttribute("itemRegisterForm", new ItemRegisterForm());
    return "registerForm";
    }

    @PostMapping("/register")
    public String itemCreate(HttpServletRequest request,ItemRegisterForm itemRegisterForm){

        Item item = new Item();
        item.setItemName(itemRegisterForm.getItemName());
        item.setItemCount(itemRegisterForm.getItemCount());
        itemService.saveItem(item);


        return "adminPage";
    }
}

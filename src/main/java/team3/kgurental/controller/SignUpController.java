package team3.kgurental.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import team3.kgurental.model.entity.User;
import team3.kgurental.service.UserService;

@Controller
@RequiredArgsConstructor
public class SignUpController {

    private final UserService userService;

    @RequestMapping("/signup")
    public String signHome(){return "index";}

    @RequestMapping("/users/new")
    public String createForm(Model model){
        model.addAttribute("userForm",new UserForm());

        return "register";
    }

    @PostMapping("/users/new")
    public String create(UserForm userForm){
        User user = new User();
        user.setUserId(userForm.getUserId());
        user.setName(userForm.getName());
        user.setPassword(userForm.getPassword());
        user.setUserPhoneNumber(userForm.getUserPhoneNumber());


        userService.join(user);

        return "redirect:/signup";
    }
}

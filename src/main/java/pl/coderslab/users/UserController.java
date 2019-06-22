package pl.coderslab.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;


    @GetMapping("/add")
    public String addUser(Model model){
        model.addAttribute("user", new User());
        return "users";
    }

    @PostMapping("/add")
    public String addUser(@ModelAttribute @Valid User user, BindingResult result){
        if(result.hasErrors()){
            return "users";
        }
        userService.saveUser(user);
        return "redirect:list";
    }
}

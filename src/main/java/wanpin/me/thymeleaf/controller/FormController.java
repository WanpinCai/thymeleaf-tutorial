package wanpin.me.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import wanpin.me.thymeleaf.model.UserFrom;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {
    // handler method to handle user registration page request
    @GetMapping("register")
    public String userRegistrationPage(Model model){
        // empty UserForm model object to store form data
        UserFrom userFrom = new UserFrom();
        model.addAttribute("userForm",userFrom);

        List<String> listProfession = Arrays.asList("Developer","Tester","Architect");
        model.addAttribute("listProfession",listProfession);
        return "register-form";
    }

    // handler method to handle user registration form submission request
    @PostMapping ("register/save")
    public String submitForm(Model model, @ModelAttribute("userForm") UserFrom userFrom){
        model.addAttribute("userForm",userFrom);
        return "register-success";
    }
}

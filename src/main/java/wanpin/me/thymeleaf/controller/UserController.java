package wanpin.me.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import wanpin.me.thymeleaf.model.User;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    //handler mothod to handle variable-expression request
    @GetMapping("variable-expression")
    public String variableExpression(Model model){
        User user = new User("wan","wan@gmail.com","Admin","female");
        model.addAttribute("user",user);
        return "variable-expression";
    }

    // handler method to handle selection expression
    // http://localhost:8080/selection-expression
    @GetMapping("selection-expression")
    public String selectionExpression(Model model){
        User user = new User("Wanpin","wanpin@gmailcom","Admin","female");
        model.addAttribute("user",user);
        return "selection-expression";
    }

    // handler method to handle expressions request
    // http://localhost:8080/message-expression
    @GetMapping("message-expression")
    public String messageExpression(){
        return "message-expression";
    }

    // handler method to handle link expressions
    @GetMapping("link-expression")
    public String linkExpression(Model model){
        model.addAttribute("id",1);
        return "link-expression";

    }

    // handler method to handle fragment expression
    @GetMapping("fragment-expression")
    public String fragmentExpression(){
        return "fragment-expression";
    }

    @GetMapping("/users")
    public String users(Model model){
        User admin = new User("Admin","admin@gmail.com","ADMIN","Female");
        User wan = new User("Wan","wan@gmail.com","USER","Male");
        User wanpin = new User("Wanpin","wanpin@gmail.com","USER","Female");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(wan);
        users.add(wanpin);
        model.addAttribute("users",users);
        return "users";
    }

    @GetMapping("/if-unless")
    public String ifUnless(Model model){
        User admin = new User("Admin","admin@gmail.com","ADMIN","Female");
        User wan = new User("Wan","wan@gmail.com","USER","Male");
        User wanpin = new User("Wanpin","wanpin@gmail.com","USER","Female");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(wan);
        users.add(wanpin);
        model.addAttribute("users",users);
        return "if-unless";
    }

    @GetMapping("switch-case")
    public String switchCase(Model model){
        User user = new User(
                "Wanpin",
                "wanpin@gmail.com",
                "ADMIN",
                "Female"
        );
        model.addAttribute("user",user);
        return "switch-case";
    }


}

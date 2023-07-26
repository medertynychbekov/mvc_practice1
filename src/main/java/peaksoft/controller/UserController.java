package peaksoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import peaksoft.model.User;
import peaksoft.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("find_all")
    public String findAll(Model model) {
        model.addAttribute("test", userService.findAll());

        List<User> users = userService.findAll();

        for (int i = 0; i < users.size(); i++) {
            users.get(i).getId();
        }

        for (User user : users) {
            user.getId();
        }
        return "users";
    }
}

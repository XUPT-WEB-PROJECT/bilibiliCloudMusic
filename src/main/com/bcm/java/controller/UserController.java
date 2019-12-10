package controller;


import bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

import javax.servlet.http.HttpSession;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/login")
    public Object login(HttpSession session, String userName, String pwd) {
        User user = userService.login(userName, pwd);
        System.out.println(userName);
        System.out.println(pwd);
        if (user != null) return "pass";
        return "failed";
    }

}

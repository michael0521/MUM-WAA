package mum.edu.cs.controller;

import mum.edu.cs.domain.User;
import mum.edu.cs.serviceimpl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by su on 3/6/16.
 * Login controller used to handle the request about the login
 */

@Controller
public class LoginController {
    @Autowired
    private AdminServiceImpl adminService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
        user.setAuthorities("ROLE_ADMIN");
        user.setEnabled(true);
        adminService.saveUser(user);
        return "login";
    }


    @RequestMapping(value = "welcome")
    public String welcome(){
        return "welcome";
    }
}

package mum.edu.cs.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import mum.edu.cs.domain.User;
import mum.edu.cs.serviceimpl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.security.Principal;

/**
 * Created by su on 3/6/16.
 * Login controller used to handle the request about the login
 */

@SessionAttributes("user")
@Controller
public class LoginController {
    @Autowired
    private AdminServiceImpl adminService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){

        User tmp = adminService.getUserByUsername("admin123456");
        if(tmp == null){
            User user = new User();
            user.setName("admin");
            user.setUsername("admin123456");
            user.setPassword("admin123456");
            user.setAuthorities("ROLE_ADMIN");
            user.setEnabled(true);
            adminService.saveUser(user);
        }


        return "login";
    }


    @RequestMapping(value = "welcome")
    public String welcome(Model model,Principal principal){
        if(principal != null && principal.getName() != null){
            User user = adminService.getUserByUsername(principal.getName());
            model.addAttribute("user",user);
        }

        return "welcome";
    }
}

package mum.edu.cs.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import mum.edu.cs.domain.User;
import mum.edu.cs.serviceimpl.AdminServiceImpl;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
            PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            User user = new User();
            user.setName("admin");
            user.setUsername("admin123456");
            user.setPassword(passwordEncoder.encode("admin123456"));
            user.setAuthorities("ROLE_ADMIN");
            user.setEnabled(true);
            adminService.saveUser(user);
            User stu = new User();
            stu.setName("student");
            stu.setUsername("student");
            stu.setPassword(passwordEncoder.encode("student"));
            stu.setAuthorities("ROLE_STU");
            stu.setEnabled(true);
            adminService.saveUser(stu);

            User pro = new User();
            pro.setName("student");
            pro.setUsername("professor");
            pro.setPassword(passwordEncoder.encode("professor"));
            pro.setAuthorities("ROLE_PRO");
            pro.setEnabled(true);
            adminService.saveUser(pro);
        }


        return "login";
    }


    @RequestMapping(value = {"/welcome","/",""})
    public String welcome(Model model,Principal principal){
        if(principal != null && principal.getName() != null){
            User user = adminService.getUserByUsername(principal.getName());
            model.addAttribute("user",user);
        }

        return "welcome";
    }

    @RequestMapping(value = "/doLogout")
    public String logout(SessionStatus status, HttpServletRequest request){
        request.getSession().invalidate();
        status.setComplete();
        return "redirect:/welcome";
    }
}

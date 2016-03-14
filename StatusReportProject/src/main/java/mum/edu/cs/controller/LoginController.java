package mum.edu.cs.controller;

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

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }


    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String auth(Model model){

        return "";
    }
}

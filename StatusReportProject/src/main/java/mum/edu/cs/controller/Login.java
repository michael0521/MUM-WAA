package mum.edu.cs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by su on 3/15/16.
 */

@Controller
public class Login {

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }


}
package mum.edu.cs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by su on 3/6/16.
 */

@Controller
public class Admin {

    @RequestMapping(value = "/admin")
    public String index(){
        return "admin/index";
    }
}

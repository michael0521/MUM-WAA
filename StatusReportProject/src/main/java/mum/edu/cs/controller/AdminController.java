package mum.edu.cs.controller;

import com.sun.javafx.sg.prism.NGShape;
import mum.edu.cs.domain.User;
import mum.edu.cs.service.RoleService;
import mum.edu.cs.serviceimpl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.naming.Binding;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.security.Principal;
import java.util.List;
import java.util.Map;

/**
 * Created by su on 3/6/16.
 *
 * Admin controller used to handle the request about the admin
 *
 */

@Controller

@RequestMapping("/admin")
public class AdminController {

    private String JspPath = "/admin/";

    @Autowired
    private AdminServiceImpl adminService;

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = {"/",""})
    public String index(Model model){
        List<User> users = adminService.getAll();
        model.addAttribute("users",users);
        return JspPath +  "index";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteStudent( Long uid, HttpServletRequest request){
        adminService.deleteUser(uid);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addStudentForm(@ModelAttribute User user, Model model ){
        Map<String,String> roleMap = roleService.getAllRoleMap();
        model.addAttribute("roleMap",roleMap);
        return JspPath + "userAddForm";
    }


    @RequestMapping(value = "/edit/{uid}", method = RequestMethod.GET)
    public String editUserFrom(@PathVariable("uid") long uid, Model model){
        Map<String,String> roleMap = roleService.getAllRoleMap();
        model.addAttribute("roleMap",roleMap);
        User user  = adminService.getUserById(uid);
        model.addAttribute("user",user);
        return JspPath + "userAddForm";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStudent(@Valid User user, BindingResult result, Model model){
        if(result.hasErrors()){
            Map<String,String> roleMap = roleService.getAllRoleMap();
            model.addAttribute("roleMap",roleMap);
            return JspPath + "userAddForm";
        }
        adminService.saveUser(user);
        return "redirect:/admin";
    }

}

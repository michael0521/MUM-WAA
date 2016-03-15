package mum.edu.cs.controller;

import mum.edu.cs.domain.Student;
import mum.edu.cs.domain.User;
import mum.edu.cs.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by su on 3/6/16.
 *
 * Admin controller used to handle the request about the admin
 *
 */

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;


    @RequestMapping(value = {"/",""})
    public String index(Model model){
        List<Student> students = adminService.getAllStudent();
        model.addAttribute("students",students);
        return "admin/index";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteStudent( Long uid, HttpServletRequest request){
        adminService.deleteUser(uid);
    }

}

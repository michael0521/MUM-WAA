package mum.edu.cs.controller;

import org.springframework.stereotype.Controller;

import mum.edu.cs.service.TeacherService;

@Controller(value="/teacher")
public class TeacherController {
	
	private TeacherService teacherService;
	
}

package mum.edu.cs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mum.edu.cs.service.TeacherService;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@RequestMapping("/lectures")
	public String listLectures(){
		
		return "teacher/lectures";
	}
	
	@RequestMapping("/reports")
	public String listReportsOfLecture(){
		
		return "teacher/reports";
	}
	
	@RequestMapping("/grade")
	public String getGradeForm(){
		
		return "teacher/gradeReport";
	}
}

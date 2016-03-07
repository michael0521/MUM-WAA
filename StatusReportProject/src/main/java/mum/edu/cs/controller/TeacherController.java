package mum.edu.cs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mum.edu.cs.service.TeacherService;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
	
	private static final String jspPath = "teacher/"; 
	
	@Autowired
	private TeacherService teacherService;
	
	@RequestMapping("/lectures")
	public String listLectures(Model model){
		List<String> lectures = teacherService.getAllLectureTitles();
		System.out.println(lectures.size());
		model.addAttribute("lectures", lectures);
		return jspPath + "lectures";
	}
	
	@RequestMapping("/reports")
	public String listReportsOfLecture(){
		
		return jspPath + "reports";
	}
	
	@RequestMapping("/grade")
	public String getGradeForm(){
		
		return jspPath + "gradeReport";
	}
}

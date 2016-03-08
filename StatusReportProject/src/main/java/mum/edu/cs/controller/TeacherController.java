package mum.edu.cs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mum.edu.cs.domain.Student;
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
		
		model.addAttribute("lectures", lectures);
		return jspPath + "lectures";
	}
	
	@RequestMapping("/reports")
	public String listReportsOfLecture(@RequestParam("lectureId") int lectureId, Model model){
		List<Student> students = teacherService.getAllStudentsByLecture(lectureId);
		System.out.println(students.size());
		model.addAttribute("students",  students);
		return jspPath + "reports";
	}
	
	@RequestMapping("/grade")
	public String getGradeForm(){
		
		return jspPath + "gradeReport";
	}
}

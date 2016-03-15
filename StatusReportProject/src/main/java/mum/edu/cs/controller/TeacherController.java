package mum.edu.cs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import mum.edu.cs.domain.Report;
import mum.edu.cs.domain.Student;
import mum.edu.cs.service.TeacherService;

@Controller
@RequestMapping("/teacher")
@SessionAttributes("gradedReport")
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
	
	@RequestMapping("/lecture/{lectureId}/reports")
	public String listReportsOfLecture(@PathVariable("lectureId") int lectureId, Model model){
		List<Student> students = teacherService.getAllStudentsByLecture(lectureId);
		System.out.println(students.size());
		model.addAttribute("students",  students);
		return jspPath + "reports";
	}
	
	@RequestMapping(value = "/lecture/{lectureId}/{studentId}/grade", method = RequestMethod.GET)
	public String getGradeForm(@PathVariable("lectureId") int lectureId, @PathVariable("studentId") int studentId, Model model){
		
		Report report = teacherService.getReportByStudentAndLecture(lectureId, studentId);
		model.addAttribute("report", report);
		return jspPath + "gradeReport";
	}
	
	@RequestMapping(value = "/lecture/{lectureId}/{studentId}/grade", method = RequestMethod.POST)
	public String processGradeForm(@PathVariable("lectureId") int lectureId, @PathVariable("studentId") int studentId, 
			@ModelAttribute("report") Report reportAfterGraded, HttpServletRequest request, Model model){
		
		System.out.println(reportAfterGraded);
		Report report = teacherService.saveReport(lectureId, studentId, reportAfterGraded);
		model.addAttribute("gradedReport", report);
		//return jspPath + "afterGrade";
		return "redirect:" + "/teacher/lecture/" + lectureId + "/" + studentId + "/result";
	}
	
	@RequestMapping(value = "/lecture/{lectureId}/{studentId}/result", method = RequestMethod.GET)
	public String getGrade(@ModelAttribute("gradedReport") Report report, 
			@PathVariable("lectureId") int lectureId, @PathVariable("studentId") int studentId, Model model){
		model.addAttribute("lectureId", lectureId);
		return jspPath + "afterGrade";
	}
	
}

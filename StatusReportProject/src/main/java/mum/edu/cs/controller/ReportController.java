package mum.edu.cs.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mum.edu.cs.domain.Report;
import mum.edu.cs.domain.TaskInfo;
import mum.edu.cs.service.ReportService;
import mum.edu.cs.service.TeacherService;


@Controller
@RequestMapping("/reports")
public class ReportController extends BaseController{

	private static final String jspPath = "reports/";
	
	private static List<TaskInfo> initInfos = new ArrayList<>();
	
	@Autowired
	ReportService ps;
	
	@Autowired
	TeacherService teacherService;
	
	static {
//		initInfos.add(new TaskInfo());
//		initInfos.add(new TaskInfo());
//		initInfos.add(new TaskInfo());
		
		initInfos.add(new TaskInfo("Review Slides", "50 mins","cccc"));
		initInfos.add(new TaskInfo("Do the first lab", "60 mins","cccc"));
		initInfos.add(new TaskInfo("Do the second lab", "100 mins","cccc"));
	}
	
//	public @ModelAttribute("collegeListCmd")
//    CollegeListCmd setupForm() {
//        return new CollegeListCmd();
//    }
	
	private void saveData(){
		Report r = new Report();
		r.setStudentId(100);
		r.setLectureId(100);
		r.setTasks(initInfos);
		r.setSci("xxx");
		r.setNotes("xxxx");
		r.setSign("xxx");
		r.setDate("1980-08-01");
		
		r = ps.saveReport(r);
	}
	
	private void fetchData(){
		Report r = ps.getReportByLectureAndStu(100, 100);
		System.out.println("xxx " + r);
	}
	
	@RequestMapping(value = "/addReport", method = RequestMethod.GET)
	public String addReport(@ModelAttribute("newReport") Report report, Model model){
		report.setTasks(initInfos);  
		
//		saveData();
//		
//		fetchData();
		return fullPath("reportForm");
	}
	
	@RequestMapping(value="/saveReport", method = RequestMethod.POST)
	public String saveReport(@Valid @ModelAttribute("newReport")  Report report, BindingResult bindingResult ,Model model
			,RedirectAttributes ra){
		ps.saveReport(report);
		
		List<String> lectures = teacherService.getAllLectureTitles();
		
		ra.addFlashAttribute("lectures", lectures);
		
		return "redirect:/teacher/lectures";
	}
	
	
	private String fullPath(String fileName){
		return jspPath + fileName;
	}
}

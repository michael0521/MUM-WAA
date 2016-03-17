package mum.edu.cs.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mum.edu.cs.domain.Report;
import mum.edu.cs.domain.TaskInfo;
import mum.edu.cs.domain.User;
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
	
	String role;
	
	int lecId;
	int uid;
	
	int stuId = 0;
	
	static {
//		initInfos.add(new TaskInfo());
//		initInfos.add(new TaskInfo());
//		initInfos.add(new TaskInfo());
		
		initInfos.add(new TaskInfo());
		initInfos.add(new TaskInfo());
		initInfos.add(new TaskInfo());
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
	
	@RequestMapping(value = "/addReport/{lectureId}", method = RequestMethod.GET)
	public String addReport(@ModelAttribute("newReport") Report report, Model model, @PathVariable int lectureId, HttpSession sesson ){
		report.setTasks(initInfos);  
		User u = (User) sesson.getAttribute("user");
		uid = Integer.valueOf(u.getUsername());
		lecId = lectureId;
		Report existR = ps.getReportByLectureAndStu(lectureId, uid);
		if(existR != null){
			model.addAttribute("newReport", existR);
		}
		
		model.addAttribute("role", User.getAuthRole(sesson));
		
		return fullPath("reportForm");
	}
	
	@RequestMapping(value = "/addReport/{lectureId}/{studentId}", method = RequestMethod.GET)
	public String addReport( Model model, @PathVariable int lectureId
			, @PathVariable int studentId, RedirectAttributes ra,  HttpSession sesson ){
//		report.setTasks(initInfos);  
		
		role = User.getAuthRole(sesson);
		stuId = studentId;
		lecId = lectureId;
		Report existR = ps.getReportByLectureAndStu(lectureId, studentId);
		if(existR != null){
			model.addAttribute("newReport", existR);	
		}
		
//		lecId = lectureId;
		System.out.println("lecId " + lectureId);
		
		if(role.equals("ROLE_STU")){
			List<String> lectures = teacherService.getAllLectureTitles();
			
			ra.addFlashAttribute("lectures", lectures);
			
			return "redirect:/teacher/lectures";	
		}
		
		model.addAttribute("role", role);
		
		return fullPath("reportForm");
	}
	
	@RequestMapping(value="/saveReport", method = RequestMethod.POST)
	public String saveReport(@Valid @ModelAttribute("newReport")  Report report, BindingResult bindingResult ,Model model
			,RedirectAttributes ra, HttpSession sesson){
		
		User u = (User) sesson.getAttribute("user");
		report.setLectureId(lecId);
		int sId = User.getAuthRole(sesson).equals("ROLE_STU")?Integer.valueOf(u.getUsername()):stuId;
		report.setStudentId(sId);
		
		System.out.println("saved report " + report);
		
		if(User.getAuthRole(sesson).equals("ROLE_PRO")){
			Report orR = ps.getReportByLectureAndStu(lecId, sId);
			if(orR != null){
				orR.setComment(report.getComment());
				orR.setGrade(report.getGrade());
				report = orR;
			}
		}
		
		ps.saveReport(report);
		
		List<String> lectures = teacherService.getAllLectureTitles();
		
		ra.addFlashAttribute("lectures", lectures);
		
		return "redirect:/teacher/lectures";
	}
	
	
	private String fullPath(String fileName){
		return jspPath + fileName;
	}
}

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

import mum.edu.cs.domain.Report;
import mum.edu.cs.domain.TaskInfo;
import mum.edu.cs.service.ReportService;


@Controller
public class ReportController extends BaseController{

	private static final String jspPath = "reports/";
	
	private static List<TaskInfo> initInfos = new ArrayList<>();
	
	@Autowired
	ReportService ps;
	
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
	
	@RequestMapping(value = "/addReport", method = RequestMethod.GET)
	public String addReport(@ModelAttribute("newReport") Report report, Model model){
		report.setTasks(initInfos);  
		
		return fullPath("reportForm");
	}
	
	@RequestMapping(value="/saveReport", method = RequestMethod.POST)
	public String saveReport(@Valid @ModelAttribute("newReport")  Report report, BindingResult bindingResult ,Model model){
		System.out.println(report);
		return fullPath("reportForm");
	}
	
	
	private String fullPath(String fileName){
		return jspPath + fileName;
	}
}

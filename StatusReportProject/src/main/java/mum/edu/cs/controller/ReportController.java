package mum.edu.cs.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.cs.domain.Report;

@Controller
public class ReportController extends BaseController{

	private static final String jspPath = "reports/";
	
	@RequestMapping(value = "/addReport", method = RequestMethod.GET)
	public String addReport(@ModelAttribute("newReport") Report report, Model model){
//		System.out.println("xxx");
		return jspPath + "reportForm";
	}
	
	@RequestMapping(value="/saveReport", method = RequestMethod.POST)
	public String saveReport(@Valid @ModelAttribute("newReport") Report report, BindingResult bindingResult ,Model model){
//		System.out.println("saveRe " + report);
		return jspPath + "reportForm";
	}
}

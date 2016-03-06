package mum.edu.cs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReportController extends BaseController{

	private static final String jspPath = "reports/"; 
	@RequestMapping(value = "/addReport", method = RequestMethod.GET)
	public String addReport(){
		return jspPath + "reportForm";
	}
}

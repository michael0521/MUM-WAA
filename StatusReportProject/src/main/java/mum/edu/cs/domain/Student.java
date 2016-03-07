package mum.edu.cs.domain;

import java.util.List;

public class Student {
	
	private int studentId;
	private String name;
	private String password;
	//private List<Report> reports;
	private Report report;
	
	public Student() {	
		
	}

	
	
	public Student(int studentId, String name, String password, Report report) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.password = password;
		this.report = report;
	}



	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
//	public List<Report> getReports() {
//		return reports;
//	}
//	public void setReports(List<Report> reports) {
//		this.reports = reports;
//	}

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}
	
	
}

package mum.edu.cs.domain;

import java.util.List;

public class Student {
	
	private int studentId;

	//private List<Report> reports;
	private Report report;
	
	public Student() {	
		
	}

	
	
	public Student(int studentId, String name, String password, Report report) {
		super();
		this.studentId = studentId;
		this.report = report;
	}



	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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

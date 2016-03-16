package mum.edu.cs.domain;

import javax.persistence.Entity;

@Entity
public class Student extends User {
	
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;

	//private List<Report> reports;
	private Report report;

	public Student() {
		//super();
	}

	
	
	public Student(int studentId, String name, String password, Report report) {
		super();
		this.studentId = studentId;
		this.account = String.valueOf(studentId);
		this.name = name;
		this.password = password;
		this.report = report;
		this.authorities = "ROLE_STUDENT";
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

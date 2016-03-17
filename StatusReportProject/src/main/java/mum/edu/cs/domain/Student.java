package mum.edu.cs.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
// public class Student extends User {
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int studentId;
	
	private int lectureId;

	private String password;

	private String name;

	// @OneToOne
	// @JoinColumn(name="report_id")
	@Transient
	private Report report;

	public Student() {
		// super();
	}

	public Student(int studentId, String name, String password, Report report) {
		super(); 
		this.studentId = studentId; 
		
		//this.username = String.valueOf(studentId); 
		this.name = name; this.password = password;
	    this.report = report; 
	    //this.authorities = "ROLE_STUDENT"; 
	}

	public Student(int studentId, int lectureId, String name, String password) {
		super();
		this.studentId = studentId;
		this.lectureId = lectureId;
		this.name = name;
		this.password = password;
	}

	public int getLectureId() {
		return lectureId;
	}

	public void setLectureId(int lectureId) {
		this.lectureId = lectureId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

}

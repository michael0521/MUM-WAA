package mum.edu.cs.domain;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class Report implements Serializable {
	
	private static final long serialVersionUID = 1520961851058396784L;
	
	private float grade;
	private String comment;
	private String time;
	private Student student;
	
	private String task;
	
	private String status;
	
	@NotEmpty(message="notes.empty")
	private String notes;
	
	@NotEmpty(message="sci.empty")
	private String sci;
	private String sign;
	private String date;
	
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	public String getComment() {
		return comment;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getSci() {
		return sci;
	}
	public void setSci(String sci) {
		this.sci = sci;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Report [grade=" + grade + ", comment=" + comment + ", time=" + time + ", task=" + task + ", status="
				+ status + ", notes=" + notes + ", sci=" + sci + ", sign=" + sign + ", date=" + date + "]";
	}
	
}

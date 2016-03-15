package mum.edu.cs.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Report implements Serializable {

	private static final long serialVersionUID = 1520961851058396784L;

	public Report() {
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@OneToMany
	List<TaskInfo> tasks;

	public List<TaskInfo> getTasks() {
		return tasks;
	}

	public void setTasks(List<TaskInfo> tasks) {
		this.tasks = tasks;
	}

	private float grade;
	private String comment;

//	private Student student;

	@NotEmpty(message = "notes.empty")
	private String notes;

	@NotEmpty(message = "sci.empty")
	private String sci;

	@NotEmpty(message = "sign.empty")
	private String sign;

	@NotEmpty(message = "date.empty")
	private String date;

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	public String getComment() {
		return comment;
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

//	public Student getStudent() {
//		return student;
//	}
//
//	public void setStudent(Student student) {
//		this.student = student;
//	}

	@Override
	public String toString() {
		return "Report [grade=" + grade + ", comment=" + comment + ", tasks=" + tasks + ", notes=" + notes + ", sci="
				+ sci + ", sign=" + sign + ", date=" + date + "]";
	}

}

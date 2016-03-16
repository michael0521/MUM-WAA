package mum.edu.cs.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity
public class Report implements Serializable {

	private static final long serialVersionUID = 1520961851058396784L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="RP_ID")
	int id;

	@OneToMany
	@JoinColumn(name="TK_ID", referencedColumnName="RP_ID")
	List<TaskInfo> tasks;
//	@JoinTable
//	  (
//	      name="REPORT_TASK",
//	      joinColumns={ @JoinColumn(name="RP_ID", referencedColumnName="RP_ID") },
//	      inverseJoinColumns={ @JoinColumn(name="TK_ID", referencedColumnName="TK_ID", unique=true) }
//	  )
	

	@NotNull(message = "{grade.empty}")
	@DecimalMax(value = "100.00", message = "{grade.max}")
	@DecimalMin(value = "60.00", message = "{grade.min}")
	private BigDecimal grade;
	@NotEmpty(message = "{comment.empty}")
	private String comment;

//	@OneToOne
//	@JoinColumn(name="TK_ID")
//	private Student student;

	@NotEmpty(message = "notes.empty")
	private String notes;

	@NotEmpty(message = "sci.empty")
	private String sci;

	@NotEmpty(message = "sign.empty")
	private String sign;

	@NotEmpty(message = "date.empty")
	private String date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<TaskInfo> getTasks() {
		return tasks;
	}

	public void setTasks(List<TaskInfo> tasks) {
		this.tasks = tasks;
	}

	public BigDecimal getGrade() {
		return grade;
	}

	public void setGrade(BigDecimal grade) {
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

package mum.edu.cs.domain;

import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Lecture {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	
	private String title;
	//private Map<Integer, Student> students;
	
	//@OneToMany(mappedBy="studentId", cascade = CascadeType.PERSIST)
	//@JoinColumn(name="studentId")
	@Transient
	private List<Student> students;
	


	public Lecture() {
		super();
	}


	public Lecture(String title) {
		super();
		this.title = title;
	}
	
	
	//private Map<Integer, Student> students;
	
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}


	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
//	public Map<Integer, Student> getStudents() {
//		return students;
//	}
//	
//	public void setStudents(Map<Integer, Student> students) {
//		this.students = students;
//	}
	
	

}

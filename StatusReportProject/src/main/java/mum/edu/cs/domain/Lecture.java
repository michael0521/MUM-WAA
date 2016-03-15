package mum.edu.cs.domain;

import java.util.List;
import java.util.Map;


public class Lecture {
	
	private String title;
	private Map<Integer, Student> students;
	
	
	public Lecture(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Map<Integer, Student> getStudents() {
		return students;
	}
	
	public void setStudents(Map<Integer, Student> students) {
		this.students = students;
	}
	
	

}

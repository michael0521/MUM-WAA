package mum.edu.cs.domain;

import java.util.List;
import java.util.Map;

public class Lecture {
	
	private String title;
	private Map<String, Student> students;
	
	
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
	
	public Map<String, Student> getStudents() {
		return students;
	}
	
	public void setStudents(Map<String, Student> students) {
		this.students = students;
	}
	
	

}

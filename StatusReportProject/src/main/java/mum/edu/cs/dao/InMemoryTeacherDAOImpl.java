package mum.edu.cs.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import mum.edu.cs.domain.Lecture;
import mum.edu.cs.domain.Report;
import mum.edu.cs.domain.Student;

@Repository
public class InMemoryTeacherDAOImpl implements TeacherDAO{

	@Override
	public List<Lecture> getAllLectures() {
		List<Lecture> lectures = new ArrayList<>();
		
		Lecture lecture1 = new Lecture("Spring MVC Introduction");
		lecture1.setStudents(getAllStudents());
		Lecture lecture2 = new Lecture("Spring MVC Servlet");
		lecture2.setStudents(getAllStudents());
		Lecture lecture3 = new Lecture("Spring MVC JSP/JSTL");
		lecture3.setStudents(getAllStudents());
		
		lectures.add(lecture1);
		lectures.add(lecture2);
		lectures.add(lecture3);
		
		return lectures;
	}

	@Override
	public Map<Integer, Student> getStudentsByLecture(int lectureId) {
		List<Lecture> lectures = getAllLectures();
		Lecture lecture = lectures.get(lectureId-1);
		return lecture.getStudents();
	}

	@Override
	public Report getReportByStudentAndLecture(int lectureId, int studentId) {
		Map<Integer, Student> students = getStudentsByLecture(lectureId);
		Student student = students.get(studentId);
		Report report = student.getReport();
		return report;
	}
	
	private Map<Integer, Student> getAllStudents(){
		Map<Integer, Student> students = new HashMap<>();
		
		Report report1 = new Report();
		report1.setTask("Task AAA");
		report1.setTime("30 min");
		report1.setStatus("Done");
		report1.setNotes("This is a note A");
		report1.setSci("This is a SCI point A");
		report1.setSign("Xiaoming Yang");
		report1.setDate(LocalDate.now().toString());
		
		Report report2 = new Report();
		report2.setTask("Task BBB");
		report2.setTime("30 min");
		report2.setStatus("Done");
		report2.setNotes("This is a note B");
		report2.setSci("This is a SCI point B");
		report2.setSign("Shaoyang Su");
		report2.setDate(LocalDate.now().toString());
		
		Report report3 = new Report();
		report3.setTask("Task CCC");
		report3.setTime("30 min");
		report3.setStatus("Done");
		report3.setNotes("This is a note C");
		report3.setSci("This is a SCI point C");
		report3.setSign("Qi Cui");
		report3.setDate(LocalDate.now().toString());
		
		students.put(984001, new Student(984001, "Michael", "12345", report1));
		students.put(984002, new Student(984002, "Eric", "12345", report2));
		students.put(984003, new Student(984003, "Robert", "12345", report3));
		
		return students;
	}

}

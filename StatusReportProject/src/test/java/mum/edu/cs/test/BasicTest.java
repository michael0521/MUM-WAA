package mum.edu.cs.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mum.edu.cs.domain.Lecture;
import mum.edu.cs.domain.Report;
import mum.edu.cs.domain.Student;
import mum.edu.cs.domain.TaskInfo;
import mum.edu.cs.domain.User;
import mum.edu.cs.repository.LectureRepository;
import mum.edu.cs.repository.ReportRepository;
import mum.edu.cs.repository.StudentRepository;
import mum.edu.cs.repository.TaskRepository;
import mum.edu.cs.serviceimpl.AdminServiceImpl;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/config/applicationContext.xml","file:src/main/webapp/WEB-INF/config/springmvc-config.xml"})
public class BasicTest {
	
	@Autowired
	LectureRepository lectureRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	ReportRepository reportRepository;
	
	@Autowired
	TaskRepository taskRepository;

	
	@Test
	public void testData(){
		
		Lecture lecture1 = new Lecture("Spring MVC Introduction");
		Lecture lecture2 = new Lecture("Spring MVC Servlet");
		Lecture lecture3 = new Lecture("Spring MVC JSP/JSTL");
		
		lectureRepository.save(lecture1);
		lectureRepository.save(lecture2);
		lectureRepository.save(lecture3);
		
		
		Student student1 = new Student(984001, 1, "Xiaoming Yang", "12345");
		Student student2 = new Student(984003, 1, "Qi Cui", "12345");
		Student student3 = new Student(984002, 1, "Shaoyang Su", "12345");
		
		Student student4 = new Student(984001, 2, "Xiaoming Yang", "12345");
		Student student5 = new Student(984003, 2, "Qi Cui", "12345");
		Student student6 = new Student(984002, 2, "Shaoyang Su", "12345");
		
		Student student7 = new Student(984001, 3, "Xiaoming Yang", "12345");
		Student student8 = new Student(984003, 3, "Qi Cui", "12345");
		Student student9 = new Student(984002, 3, "Shaoyang Su", "12345");
		
		studentRepository.save(student1);
		studentRepository.save(student2);
		studentRepository.save(student3);
		studentRepository.save(student4);
		studentRepository.save(student5);
		studentRepository.save(student6);
		studentRepository.save(student7);
		studentRepository.save(student8);
		studentRepository.save(student9);
		
		
		Report report11 = new Report();	
		report11.setLectureId(1);
		report11.setStudentId(984001);
		report11.setNotes("This is a note A");
		report11.setSci("This is a SCI point A");
		report11.setSign("Xiaoming Yang");
		report11.setDate(LocalDate.now().toString());
		
		Report report12 = new Report();
		report12.setLectureId(2);
		report12.setStudentId(984002);
		report12.setNotes("This is a note B");
		report12.setSci("This is a SCI point B");
		report12.setSign("Shaoyang Su");
		report12.setDate(LocalDate.now().toString());
		
		Report report13 = new Report();
		report13.setLectureId(3);
		report13.setStudentId(984003);
		report13.setNotes("This is a note C");
		report13.setSci("This is a SCI point C");
		report13.setSign("Qi Cui");
		report13.setDate(LocalDate.now().toString());
		
		Report report21 = new Report();
		report21.setLectureId(2);
		report21.setStudentId(984002);
		report21.setNotes("This is a note B");
		report21.setSci("This is a SCI point B");
		report21.setSign("Shaoyang Su");
		report21.setDate(LocalDate.now().toString());
		
		Report report22 = new Report();
		report22.setLectureId(3);
		report22.setStudentId(984003);
		report22.setNotes("This is a note C");
		report22.setSci("This is a SCI point C");
		report22.setSign("Qi Cui");
		report22.setDate(LocalDate.now().toString());
		
		Report report31 = new Report();
		report31.setLectureId(3);
		report31.setStudentId(984003);
		report31.setNotes("This is a note C");
		report31.setSci("This is a SCI point C");
		report31.setSign("Qi Cui");
		report31.setDate(LocalDate.now().toString());
		
		Report report32 = new Report();
		report32.setLectureId(2);
		report32.setStudentId(984002);
		report32.setNotes("This is a note B");
		report32.setSci("This is a SCI point B");
		report32.setSign("Shaoyang Su");
		report32.setDate(LocalDate.now().toString());

		
		reportRepository.save(report11);
		reportRepository.save(report12);
		reportRepository.save(report13);
		reportRepository.save(report21);
		reportRepository.save(report22);
		reportRepository.save(report31);
		reportRepository.save(report32);
		
		
		TaskInfo task1 = new TaskInfo();
		task1.setTask("Task AAA");
		task1.setTime("30 min");
		task1.setStatus("Done");
		task1.setReportId(1);
		
		TaskInfo task2 = new TaskInfo();
		task2.setTask("Task BBB");
		task2.setTime("30 min");
		task2.setStatus("Done");
		task2.setReportId(2);
		
		TaskInfo task3 = new TaskInfo();
		task3.setTask("Task CCC");
		task3.setTime("30 min");
		task3.setStatus("Done");
		task3.setReportId(3);
		
		TaskInfo task4 = new TaskInfo();
		task4.setTask("Task CCC");
		task4.setTime("30 min");
		task4.setStatus("Done");
		task4.setReportId(4);
		
		TaskInfo task5 = new TaskInfo();
		task5.setTask("Task DDD");
		task5.setTime("30 min");
		task5.setStatus("Done");
		task5.setReportId(5);
		
		TaskInfo task6 = new TaskInfo();
		task6.setTask("Task EEE");
		task6.setTime("30 min");
		task6.setStatus("Done");
		task6.setReportId(6);
		
		TaskInfo task7 = new TaskInfo();
		task7.setTask("Task FFF");
		task7.setTime("30 min");
		task7.setStatus("Done");
		task7.setReportId(7);
		
		
		taskRepository.save(task1);
		taskRepository.save(task2);
		taskRepository.save(task3);
		taskRepository.save(task4);
		taskRepository.save(task5);
		taskRepository.save(task6);
		taskRepository.save(task7);
		
	}
	
	@Test
	public void testService(){
		System.out.println(lectureRepository.findAll());
	}
	

}

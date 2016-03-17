package mum.edu.cs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.cs.dao.TeacherDAO;
import mum.edu.cs.domain.Lecture;
import mum.edu.cs.domain.Report;
import mum.edu.cs.domain.Student;

public interface TeacherService {
	
	List<Lecture> getAllLectures();
	
	List<Student> getStudentsByLecture(int lectureId);

	Report getReportByStudentAndLecture(int lectureId, int studentId);
	
	Report saveReportByStudentAndLecture(int lectureId, int studentId, Report report);

	Report saveReport(int lectureId, int studentId, Report reportAfterGraded);

	List<Student> getAllStudentsByLecture(int lectureId);

	List<String> getAllLectureTitles();
	
	
	
	
	/*@Autowired
	private TeacherDAO teacherDAO;
	
	public List<String> getAllLectureTitles(){
		List<Lecture> lectures = teacherDAO.getAllLectures();
		List<String> lectureTitles = new ArrayList<>();
		lectures.forEach(lecture -> lectureTitles.add(lecture.getTitle()) );
		return lectureTitles;
	};

	
	public List<Student> getAllStudentsByLecture(int lectureId){
		Map<Integer, Student> students = teacherDAO.getStudentsByLecture(lectureId);
		List<Student> students2 = new ArrayList<>();
		students.forEach((k, v) -> students2.add(v));
		return students2;
	}
	
	public Report getReportByStudentAndLecture(int lectureId, int studentId){
		Report report = teacherDAO.getReportByStudentAndLecture(lectureId, studentId);
		return report;
	}
	
	public Report saveReport(int lectureId, int studentId, Report report){
		Report gradedReport = teacherDAO.saveReportByStudentAndLecture(lectureId, studentId, report);
		return gradedReport;
	}


	public TeacherDAO getTeacherDAO() {
		return teacherDAO;
	}


	public void setTeacherDAO(TeacherDAO teacherDAO) {
		this.teacherDAO = teacherDAO;
	}*/
	
	
}

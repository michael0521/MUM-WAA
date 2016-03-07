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

@Service
public class TeacherService {
	
	//@Autowired
	private TeacherDAO teacherDAO;
	
	public List<String> getAllLectureTitles(){
		List<Lecture> lectures = teacherDAO.getAllLectures();
		List<String> lectureTitles = new ArrayList<>();
		lectures.forEach(lecture -> lectureTitles.add(lecture.getTitle()) );
		return lectureTitles;
	};

	
	public List<String> getAllStudentsByLecture(String lectureId){
		Map<String, Student> students = teacherDAO.getStudentsByLecture(Integer.valueOf(lectureId));
		List<String> studentIds = new ArrayList<>();
		students.forEach((k, v) -> studentIds.add(String.valueOf(v.getStudentId())));
		return studentIds;
	}
	
	public Report getReportByStudentAndLecture(String lectureId, String studentId){
		Report report = teacherDAO.getReportByStudentAndLecture(Integer.valueOf(lectureId), studentId);
		return report;
	}


	public TeacherDAO getTeacherDAO() {
		return teacherDAO;
	}


	public void setTeacherDAO(TeacherDAO teacherDAO) {
		this.teacherDAO = teacherDAO;
	}
	
	
}

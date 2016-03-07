package mum.edu.cs.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import mum.edu.cs.domain.Lecture;
import mum.edu.cs.domain.Report;
import mum.edu.cs.domain.Student;

@Repository
public class TeacherDAOImpl implements TeacherDAO{

	@Override
	public List<Lecture> getAllLectures() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Student> getStudentsByLecture(int lectureId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Report getReportByStudentAndLecture(int lectureId, String studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

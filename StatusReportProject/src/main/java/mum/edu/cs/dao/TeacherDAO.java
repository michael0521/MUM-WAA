package mum.edu.cs.dao;

import java.util.List;
import java.util.Map;

import mum.edu.cs.domain.Lecture;
import mum.edu.cs.domain.Report;
import mum.edu.cs.domain.Student;

public interface TeacherDAO {
	
	List<Lecture> getAllLectures();
	
	Map<Integer, Student> getStudentsByLecture(int lectureId);

	Report getReportByStudentAndLecture(int lectureId, int studentId);
	
	Report saveReportByStudentAndLecture(int lectureId, int studentId, Report report);
}

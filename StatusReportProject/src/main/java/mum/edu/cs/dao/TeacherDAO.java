package mum.edu.cs.dao;

import java.util.List;
import java.util.Map;

import mum.edu.cs.domain.Lecture;
import mum.edu.cs.domain.Report;
import mum.edu.cs.domain.Student;

public interface TeacherDAO {
	
	abstract List<Lecture> getAllLectures();
	
	abstract Map<Integer, Student> getStudentsByLecture(int lectureId);

	abstract Report getReportByStudentAndLecture(int lectureId, int studentId);

}

package mum.edu.cs.serviceimpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.cs.domain.Lecture;
import mum.edu.cs.domain.Report;
import mum.edu.cs.domain.Student;
import mum.edu.cs.repository.LectureRepository;
import mum.edu.cs.repository.ReportRepository;
import mum.edu.cs.repository.StudentRepository;
import mum.edu.cs.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	LectureRepository lectureRepository;

	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	ReportRepository reportRepository;

	@Override
	public List<Lecture> getAllLectures() {

		List<Lecture> lectures = (List<Lecture>) lectureRepository.findAll();

		return lectures;
	}

	@Override
	public List<Student> getStudentsByLecture(int lectureId) {
		/*List<Lecture> lectures = (List<Lecture>) lectureRepository.findAll();
		Lecture lecture = lectures.get(lectureId - 1);
		return lecture.getStudents();*/
		List<Student> students = (List<Student>) studentRepository.getStudentsByLectureId(lectureId);
		System.out.println(students.size());
		return students;
	}

	@Override
	public Report getReportByStudentAndLecture(int lectureId, int studentId) {
		/*List<Student> students = getStudentsByLecture(lectureId);
		Student student = students.get(studentId);
		Report report = student.getReport();
		return report;*/
		
		Report report = reportRepository.getReportByLectureAndStu(lectureId, studentId);
		return report;
	}

	private Student getStudentByLectureAndStudentId(int lectureId, int studentId) {
		/*List<Lecture> lectures = (List<Lecture>) lectureRepository.findAll();
		Lecture lecture = lectures.get(lectureId - 1);
		return lecture.getStudents().get(studentId);*/
		Student student = studentRepository.getStudentByLectureIdAndStudentId(lectureId, studentId);
		return student;
	}

	/*private List<Student> getAllStudents() {
		List<Student> students = (List<Student>) studentRepository.findAll();
		return students;
	}*/

	public List<String> getAllLectureTitles() {
		List<Lecture> lectures = getAllLectures();
		List<String> lectureTitles = new ArrayList<>();
		lectures.forEach(lecture -> lectureTitles.add(lecture.getTitle()));
		return lectureTitles;
	};

	public List<Student> getAllStudentsByLecture(int lectureId) {
		List<Student> students = getStudentsByLecture(lectureId);
		return students;
	}

	public Report saveReportByStudentAndLecture(int lectureId, int studentId, Report gradedReport) {
		Student student = getStudentByLectureAndStudentId(lectureId, studentId);
		student.setReport(gradedReport);
		return student.getReport();
	}

	public Report saveReport(int lectureId, int studentId, Report report) {
		Report gradedReport = saveReportByStudentAndLecture(lectureId, studentId, report);
		return gradedReport;
	}

}

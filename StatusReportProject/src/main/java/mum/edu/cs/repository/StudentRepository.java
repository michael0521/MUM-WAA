package mum.edu.cs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import mum.edu.cs.domain.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	
	@Query("select s from Student s where s.lectureId = :lectureId")
	List<Student> getStudentsByLectureId(@Param("lectureId") int lectureId);
	
	@Query("select s from Student s where s.lectureId = :lectureId and s.studentId = :studentId")
	Student getStudentByLectureIdAndStudentId(@Param("lectureId") int lectureId, @Param("studentId") int studentId);
	//Student findByStudentId(int studentId);
}

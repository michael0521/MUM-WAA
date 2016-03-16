package mum.edu.cs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mum.edu.cs.domain.Report;

@Repository
public interface ReportRepository extends CrudRepository<Report, Integer>{

	@Query("select r from Report r where r.lectureId = :lectureId and r.studentId = :studentId")
	Report getReportByLectureAndStu(@Param("lectureId") int ltId, @Param("studentId") int stuId);
	
	
}

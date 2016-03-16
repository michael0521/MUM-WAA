package mum.edu.cs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mum.edu.cs.domain.Report;
import mum.edu.cs.domain.TaskInfo;

@Repository
public interface TaskRepository extends CrudRepository<TaskInfo	, Integer>{

	@Query("select r from TaskInfo r where r.reportId = :reportId")
	List<TaskInfo> getReportByLectureAndStu(@Param("reportId") int rd);
	
}

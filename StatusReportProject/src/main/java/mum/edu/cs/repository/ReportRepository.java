package mum.edu.cs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mum.edu.cs.domain.Report;

@Repository
public interface ReportRepository extends CrudRepository<Report, Integer>{

	
}

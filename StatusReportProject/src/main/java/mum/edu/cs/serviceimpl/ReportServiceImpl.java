package mum.edu.cs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs.domain.Report;
import mum.edu.cs.repository.ReportRepository;
import mum.edu.cs.service.ReportService;


@Service
@Transactional
public class ReportServiceImpl implements ReportService{
	@Autowired
	ReportRepository repo;
	
	public List<Report> getAllReports(){
		return (List<Report>)repo.findAll();
	}
	
	

}

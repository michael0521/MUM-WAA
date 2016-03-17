package mum.edu.cs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs.domain.Report;
import mum.edu.cs.domain.TaskInfo;
import mum.edu.cs.repository.ReportRepository;
import mum.edu.cs.repository.TaskRepository;
import mum.edu.cs.service.ReportService;


@Service
@Transactional
public class ReportServiceImpl implements ReportService{
	@Autowired
	ReportRepository repo;
	
	@Autowired
	TaskRepository tkRepo;
	
	public List<Report> getAllReports(){
		return (List<Report>)repo.findAll();
	}
	
	public Report getReportByLectureAndStu(int lectureId, int stuId){
		
		Report r =  repo.getReportByLectureAndStu(lectureId, stuId);
		if(r != null){
			 r.setTasks(tkRepo.getTasksByReportId(r.getId()));;
		}
		
		return r;
	}

	public Report saveReport(Report r){
		Report saved =  repo.save(r);
		
		if(r.getTasks() != null){
			for(TaskInfo k : r.getTasks()){
				k.setReportId(saved.getId());
			}
			
			tkRepo.save(r.getTasks());
		}
		
		return saved;
	}
	
}

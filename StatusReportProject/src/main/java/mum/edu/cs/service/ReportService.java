package mum.edu.cs.service;

import java.util.List;

import mum.edu.cs.domain.Report;

public interface ReportService {
	List<Report> getAllReports();
	
	Report getReportByLectureAndStu(int lectureId, int stuId);
	
	public Report saveReport(Report r);
}

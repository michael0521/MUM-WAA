package mum.edu.cs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mum.edu.cs.domain.Report;

public interface ReportService {
	List<Report> getAllReports();
}

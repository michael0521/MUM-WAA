<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>This report is graded!</title>
</head>
<body>
${gradedReport.sign}'s grade is:</p>
${gradedReport.grade}</p>
${gradedReport.comment}</p>


<a href="${pageContext.request.contextPath}/teacher/lecture/${lectureId}/reports">All Lecture${lectureId} Reports</a>
</body>
</html>
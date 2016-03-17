<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>All Reports Submitted By Students</title>
</head>
<body>
<h2>Student List</h2>
<br/>
<table border = '1'>
<c:forEach var="student" items = "${students}" varStatus="lectureIndex">
		<%-- <tr><td>  ${student.studentId} <a href="${student.studentId}/grade">${student.name}</a></td></tr> --%>
		<tr><td>  ${student.studentId} <a href="${pageContext.request.contextPath}/addReport">${student.name}</a></td></tr>
</c:forEach>
</table>
</body>
</html>

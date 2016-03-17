<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>All Lectures</title>
</head>
<body>
	<h2>Lectures List</h2>
	<br />
	<table border='1'>
		<c:forEach var="lecture" items="${lectures}" varStatus="lectureIndex">
			<tr>
				<td>Lecture ${lectureIndex.index + 1}
				<c:if test="${role == 'stu'}">
					<a
					href="${pageContext.request.contextPath}/reports/addReport">${lecture}</a>
				</c:if> 
				<c:if test="${role == 'teacher'}">
				<a
					href="lecture/${lectureIndex.index + 1}/reports">${lecture}</a>
					</c:if>
				</td>
			</tr>


		</c:forEach>
	</table>

</body>
</html>

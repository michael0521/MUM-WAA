<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Grade Report</title>
</head>
<body>
<form:form modelAttribute="report"  action= "${saveReport}"  method="post">
		<table>
			<tr>
				<th>Tasks</th>
				<th>Time</th>
				<th>Status</th>
			</tr>
			<tr>
				<td><form:input path="task"/></td>
				<td><form:input path="time" /></td>
				<td><form:input path="status" /></td>
			</tr>
		</table>

		<br />
		
		<p>Notes:</p>
		<div style="text-align: center;">
 				<form:errors path="notes" cssStyle="color : red;" /> 
		</div>
		<form:textarea rows="20" cols="100" path="notes" />

		<br />
		<p>SCI/CBE Point:</p>
		<div style="text-align: center;">
 				<form:errors path="sci" cssStyle="color : red;" /> 
		</div>
		<form:textarea rows="20" cols="100" path="sci" />
		
		<br/>
		<p>Signed: <form:input width="50" type="text" path="sign" /></p>
		<p>Date:&nbsp;&nbsp;&nbsp; <form:input width="100px" type="date" path="date"/></p>
		
		<br/>
		<p>grade: <form:input width="50" type="text" path="grade" /></p>
		<p>comment:</p> 
				  <form:textarea rows="20" cols="100" type="text" path="comment"/>
		
		<input type="submit" style="margin-left:70%"/>
		<br/>
		
		</form:form>
</body>
</html>

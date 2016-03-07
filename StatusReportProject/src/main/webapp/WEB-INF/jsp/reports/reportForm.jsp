<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Status Report</title>

<style type="text/css">
div {
	margin-left: 20%;
	margin-right: 20%;
	margin-top: 100px;
	margin-bottom: 100px;
	border: 1px;
}

p {
	font-weight: bold;
}

table, td, th {
	border: 1px solid black;
}

td input {
	width: 98%;
}

table {
	width: 100%;
}

th {
	font-weight: bold;
	height: 50px;
}
</style>

</head>
<body>

	<div>
	
	<spring:url var = "saveReport" value="/saveReport" />
	
	<form:form modelAttribute="newReport"  action= "${saveReport}"  method="post">
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
		
		<input type="submit" style="margin-left:70%"/>
		
		</form:form>
	</div>
</body>
</html>
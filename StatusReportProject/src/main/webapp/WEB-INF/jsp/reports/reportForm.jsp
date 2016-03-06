<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<table>
			<tr>
				<th>Tasks</th>
				<th>Time</th>
				<th>Status</th>
			</tr>
			<tr>
				<td><input type="text" /></td>
				<td><input type="text" /></td>
				<td><input type="text" /></td>
			</tr>
		</table>

		<br />
		<p>Notes:</p>

		<textarea rows="20" cols="100" name="notes" >
		</textarea>

		<br />
		<p>SCI/CBE Point:</p>

		<textarea rows="20" cols="100" name="sci">
		</textarea>
		
		<br/>
		<p>Signed: <input width="50" type="text" name="sign" /></p>
		<p>Date:&nbsp;&nbsp;&nbsp; <input width="100px" type="date" /></p>
		
		<br/>
		
		<input type="submit" style="margin-left:70%"/>
		
	</div>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: su
  Date: 3/15/16
  Time: 8:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<form:form action="/save" method="post" modelAttribute="student">
  <form:hidden path="id" ></form:hidden>
  <label for="useId">UseId:</label>
  <form:input path="id" disabled="true"></form:input>

  <br>
  <br>
  <label for="studentId" > StudentId: </label>
  <form:input path="studentId"></form:input>
  <br>
  <br>

  <label for="name">Name:</label>
  <form:input path="name"></form:input>

  <br>
  <br>
  <input type="submit" value="submit">

</form:form>


</body>
</html>

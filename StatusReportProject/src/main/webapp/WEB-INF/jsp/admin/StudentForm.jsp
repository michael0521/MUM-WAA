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
  <label for="useId"></label>
  <form:label path="id"></form:label>
  <form:hidden path="id" ></form:hidden>
  <br>
  <br>



</form:form>


</body>
</html>

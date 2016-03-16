<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: su
  Date: 3/16/16
  Time: 10:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>

<span> Welcome </span>
<br>
<br>

<security:authorize access="hasRole('ROLE_ADMIN')">
    <a href="<spring:url value='/admin' />" class="">User Manager</a>
</security:authorize>


<security:authorize access="hasRole('ROLE_PRO')">
    <a href="<spring:url value='/teacher/lectures' />" class="">Grade Report</a>
</security:authorize>



<security:authorize access="isAnonymous()">
    <a href="<spring:url value='/login' />" class=""> Login</a>
</security:authorize>


</body>
</html>

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
    <title><spring:message code="message.welcome.title"/> </title>
</head>
<body>

<span> <spring:message code="message.welcome.title" /> <security:authorize access="isAuthenticated()">
     <security:authentication property="principal.username" />
</security:authorize> </span>
<br>
<br>

<security:authorize access="hasRole('ROLE_ADMIN')">
    <a href="<spring:url value='/admin' />" class=""><spring:message code="message.welcome.userManager" /> </a>
</security:authorize>


<security:authorize access="hasRole('ROLE_PRO')">
    <a href="<spring:url value='/teacher/lectures' />" class=""> <spring:message code="message.welcome.gradeReport" /> </a>
</security:authorize>



<security:authorize access="isAnonymous()">
    <a href="<spring:url value='/login' />" class=""> <spring:message code="message.login" /> </a>
</security:authorize>

<security:authorize access="!isAnonymous()">
    <br>
    <a href="/doLogout"> <input type="button" value="<spring:message code="message.logout" /> " > </a>
</security:authorize>

<br>
<br>
<span> <a href="/welcome?language=zh_CN">中文</a> </span> | <span> <a href="/welcome?language=en_US"> English </a> </span>


</body>
</html>


<%--
  Created by IntelliJ IDEA.
  User: su
  Date: 3/6/16
  Time: 2:36 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="icon" href="<spring:url value='/favicon.ico' />">
  <link rel="stylesheet" type="text/css" href="/resources/main.css">
  <title><spring:message code="message.login" /> </title>

</head>
<body>
<div class="login container">


  <div class="panel">
    <form action="postLogin" method="post">
      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
      <div class="input mt-10 mb-10">
        <span><spring:message code="message.login.account" />  &nbsp</span>
        <input  name="username" />
      </div>

      <div class="input mt-10 mb-10">
        <span><spring:message code="message.login.pwd" /> </span>
        <input name="password" type="password"/>
      </div>

      <input type="submit" value="<spring:message code="message.submit" /> ">
    </form>
  </div>
</div>
</body>
</html>

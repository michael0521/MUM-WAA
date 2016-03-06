
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
  <link rel="stylesheet" type="text/css" href="/resources/main.css">
  <title><spring:message code="message.login" /> </title>

</head>
<body>
<div class="login container">


  <div class="panel">
    <form>
      <div class="input mt-10 mb-10">
        <span><spring:message code="message.login.account" />  &nbsp</span>
        <input  value="test" />
      </div>

      <div class="input mt-10 mb-10">
        <span><spring:message code="message.login.pwd" /> </span>
        <input value="test"/>
      </div>

      <input type="submit" value="<spring:message code="message.submit" /> ">
    </form>
  </div>
</div>
</body>
</html>

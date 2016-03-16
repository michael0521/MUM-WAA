<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: su
  Date: 3/6/16
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><spring:message code="message.admin.index.title" /> </title>
    <script src="/resources/js/jquery-1.10.1.min.js"></script>
    <script src="/resources/js/page.admin.index.js"></script>
</head>
<body>


<span><spring:message code="message.admin.index.title" /></span><br>
<input type="button" id="add_student" value="add" />

<table style="width:100%" id="table">

    <tr>
        <td><spring:message code="message.admin.index.name" /> </td>
        <td><spring:message code="message.admin.index.role" /> </td>
        <td><spring:message code="message.admin.index.action" /> </td>
    </tr>

    <c:forEach var="item" items="${users}">
        <tr>
            <td>${item.name}</td>
            <td>${item.authorities}</td>
            <td>
                <input id="delete" uid="${item.getId()}" type="button" value="<spring:message code="message.admin.index.delete" /> "/>
                <input id="edit" uid="${item.getId()}" type="button" value="<spring:message code="message.admin.index.action" /> " />
            </td>
        </tr>
    </c:forEach>

</table>

<input id="csrf" type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

</body>
</html>

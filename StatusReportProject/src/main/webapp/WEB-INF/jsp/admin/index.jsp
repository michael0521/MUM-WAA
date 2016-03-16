<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title></title>
    <script src="/resources/js/jquery-1.10.1.min.js"></script>
    <script src="/resources/js/page.admin.index.js"></script>
</head>
<body>


<span>Users</span><br>
<input type="button" id="add_student" value="add" />

<table style="width:100%" id="table">

    <tr>
        <td>Name</td>
        <td>Role</td>
        <td>Action</td>
    </tr>

    <c:forEach var="item" items="${users}">
        <tr>
            <td>${item.name}</td>
            <td>${item.authorities}</td>
            <td>
                <input id="delete" uid="${item.getId()}" type="button" value="delete"/>
                <input id="edit" uid="${item.getId()}" type="button" value="edit" />
            </td>
        </tr>
    </c:forEach>

</table>

<input id="csrf" type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

</body>
</html>

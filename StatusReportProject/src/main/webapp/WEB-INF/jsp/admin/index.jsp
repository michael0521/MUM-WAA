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


<span>student</span><br>

<table style="width:100%" id="table">
    <tr>
        <td>StudentId</td>
        <td>Action</td>
    </tr>


    <c:forEach var="item" items="${students}">
        <tr>
            <td>${item.studentId}</td>
            <td><input id="delete" uid="${item.getId()}" type="button" value="delete"/></td>
        </tr>
    </c:forEach>

</table>


</body>
</html>

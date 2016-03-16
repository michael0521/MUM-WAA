<%--
  Created by IntelliJ IDEA.
  User: su
  Date: 3/15/16
  Time: 8:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>


<form:form action="/admin/save" method="post" modelAttribute="user">

    <form:errors path="*" cssStyle=" color: red"></form:errors>
    <br>

    <%--<form:hidden path="id"></form:hidden>--%>
    <label for="useId">UseId:</label>
    <form:input path="id" disabled="true"></form:input>

    <br>
    <br>
    <label for="username">Username:</label>
    <form:input path="username"></form:input>

    <br>
    <br>
    <label for="password">Password</label>
    <form:input path="password" type="password"></form:input>

    <br>
    <br>
    <label for="name">Name:</label>
    <form:input path="name"></form:input>

    <br>
    <br>
    <label for="authorities">Role</label>
    <form:select path="authorities">
        <form:options items="${roleMap}"></form:options>
    </form:select>


    <br>
    <br>
    <input type="submit" value="submit">

</form:form>


</body>
</html>

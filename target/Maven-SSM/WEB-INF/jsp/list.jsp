<%--
  Created by IntelliJ IDEA.
  User: 陈嘉名
  Date: 2020/9/23
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
<html>
<head>
    <title>用户列表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<div  class="container" style="margin-top: 200px; ">
<h3 align="center">用户列表</h3>
<table class="table table-bordered table-hover">
    <thead>
    <tr>
        <th>id</th>
        <th>用户名</th>
        <th>密码</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="user">
    <tr class="success">
        <td>${user.id}</td>
        <td>${user.userName}</td>
        <td>${user.password}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</div>
</body>
</html>

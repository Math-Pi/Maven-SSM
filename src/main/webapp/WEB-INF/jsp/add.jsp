<%--
  Created by IntelliJ IDEA.
  User: 陈嘉名
  Date: 2020/9/23
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=utf-8"  pageEncoding="utf-8" language="java" %>
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
<html>
<head>
    <title>增加员工</title>
</head>
<body>
<div class="container">
    <h2>增加员工</h2>
    <form action="${pageContext.request.contextPath}/insertEmployee" method="post">
        <div class="form-group">
            <label for="name">姓名:</label>
            <input type="text" class="form-control" name="name" id="name" placeholder="Enter Name">
        </div>
        <div class="form-group">
            <label for="age">年龄:</label>
            <input type="number" class="form-control" name="age" id="age" placeholder="Enter Age">
        </div>
        <div class="radio">
            <label for="address">性别:</label>
            <label><input type="radio" name="sex" value="男">男</label>
            <label><input type="radio" name="sex"value="女">女</label>
        </div>
        <div class="form-group">
            <label for="address">地址:</label>
            <input type="text" class="form-control" name="address" id="address" placeholder="Enter Address">
        </div>
        <div class="form-group">
            <label for="phone">电话:</label>
            <input type="text" class="form-control" name="phone" id="phone" placeholder="Enter Phone">
        </div>
        <div class="form-group">
            <label for="password">密码:</label>
            <input type="password" class="form-control" name="password" id="password" placeholder="Enter Password">
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

</body>
</html>

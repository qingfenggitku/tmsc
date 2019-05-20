<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/3/26
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/statics/css/login.css"/>
</head>
<body>
<div id="login">
    <h1>Login</h1>
    <form action="${pageContext.request.contextPath}/welcome/login" method="post">
        <input type="text" required="required" placeholder="用户名" name="userName"></input>
        <input type="password" required="required" placeholder="密码" name="pwd"></input>
        <button class="but" type="submit">登录</button>
    </form>
    <a href="${pageContext.request.contextPath}/welcome/sms">忘记密码</a>
    <a href="${pageContext.request.contextPath}/welcome/regeistManagers">注册新用户</a>
</div>
</body>
</html>

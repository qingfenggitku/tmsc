<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/4/17
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新用户信息</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/welcome/updateuser" method="post">
    id:<input type="text" name="id" value="${user.id}" readonly="readonly"><br>
    用户名：<input type="text" name="userName" value="${user.userName}"><br>
    邮箱：<input type="text" name="email" value="${user.email}"><br>
    姓名：<input type="text" name="name" value="${user.name}"><br>
    联系方式：<input type="text" name="phoneNumber" value="${user.phoneNumber}"><br>
    密码：<input type="text" name="pwd" value="${user.pwd}"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>

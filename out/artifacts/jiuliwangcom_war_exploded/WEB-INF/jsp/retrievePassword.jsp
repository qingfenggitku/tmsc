<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/4/16
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改密码</title>
    <style type="text/css" >
        *{
            margin: 0;
            padding: 0;
        }
        .body{
            margin:150px auto;
            max-width: 600px;
            overflow: hidden;
            position: relative;
            height: 400px;
            width: 100%;
        }
        form{
            margin:100px auto;
            max-width: 400px;
            overflow: hidden;
            position: relative;
            height: 200px;
            width: 100%;
        }
        form div{
            margin:20px auto;
            max-width: 400px;
            overflow: hidden;
            position: relative;
            height: 40px;
            width: 100%;
        }
        .center{
            margin:0px auto;
            max-width: 300px;
            overflow: hidden;
            position: relative;
            height: 40px;
            width: 100%;
            background-color: gainsboro;
        }
        .submit{
            margin-left: 120px;
            width: 100px;
            height: 40px;
            overflow: hidden;
            position: relative;
        }
    </style>
</head>
<body>
<div class="body">

    <form action="${pageContext.request.contextPath}/welcome/retrievePassword" method="post">
        <h2 style="align-content: center;margin-left: 120px">修改密码</h2>
        <div>

            <input type="password" name="pwd" id="pwd" placeholder="输入新密码" class="center">
        </div>
        <div>
            <input type="password" name="pwdTwo" id="pwdTwo" placeholder="确认密码" class="center">
        </div>
        <div>
            <input type="submit" value="确定" class="submit">
        </div>
        <input type="text" name = "phone" value="${phone}" hidden="hidden">
    </form>
</div>
</body>
</html>

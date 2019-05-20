<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/4/16
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>短信验证</title>
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
        #button{
            width: 80px;
            height: 40px;
            overflow: hidden;
            position: relative;
        }
    </style>
</head>
<body>
<div class="body">

    <form action="${pageContext.request.contextPath}/welcome/code" method="post">
        <h2 style="align-content: center;margin-left: 120px">短信验证</h2>
        <div>

            <input type="text" name="phone" id="phone" placeholder="电话" class="center">
        </div>
        <div>
            <input type="text" name="verificationCode" id="verificationCode" placeholder="验证码" class="center">
            <input type="button" click="#" value="发送验证码" id="button">
        </div>
        <div>
            <input type="submit" value="确定" class="submit">
        </div>
    </form>
</div>
</body>
</html>

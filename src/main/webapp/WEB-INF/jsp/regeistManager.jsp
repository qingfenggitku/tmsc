<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/3/28
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet"  href="${pageContext.request.contextPath}/statics/css/regesitManager.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/regeistManager.js"></script>
</head>
<body>
<div class="divAll">
    <div id="titles">新用户注册</div>
    <div id="contents">
        <h3 style="text-align: center">基本信息</h3>
        <hr width="95%" color="#f2f2f2"/>
        <form action="${pageContext.request.contextPath}/welcome/addMerchandise" onSubmit="return checkForm()" method="post">
            <div class="form-itemGroup">
                <label for="userName">用户名&nbsp;：</label>
                <input type="text" id="userName" name = "userName" class="userName" onBlur="checkUserName()" oninput="checkUserName()">
                <span class="default" id="nameErr">请输入至少2位的用户名</span>
            </div>
            <div class="form-itemGroup">
                <label for="pwd">密&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
                <input type="password" id="pwd" name="pwd" class="userName" onBlur="checkPassword()" oninput="checkPassword()">
                <span class="default" id="passwordErr">请输入4到8位的密码</span>
            </div>
            <div class="form-itemGroup">
                <label for="userConfirmPasword">确认密码：</label>
                <input type="password" id="userConfirmPasword" class="userName" onBlur="ConfirmPassword()" oninput="ConfirmPassword()">
                <span class="default" id="conPasswordErr">请再输入一遍密码</span>
            </div>
            <div class="form-itemGroup">
                <label for="phoneNumber">手机号码：</label>
                <input type="text" id="phoneNumber" name="phoneNumber" class="userName" onBlur="checkPhone()" oninput="checkPhone()">
                <span class="default" id="phoneErr">请输入11位手机号码</span>
            </div>
            <div class="form-itemGroup">
                <label for="eamil">邮&nbsp;&nbsp;&nbsp;&nbsp;箱：</label>
                <input type="email" id="eamil" name="eamil" class="userName" onBlur="checkEmail()" oninput="checkEmail()">
                <span class="default" id="eamilErr">请输入邮箱</span>
            </div>
            <div>
                <button type="submit" class="divBtn">注册</button>
            </div>
        </form>
    </div>
    <div>
        <span id="message">${message}</span>
    </div>
</div>
</body>
</html>

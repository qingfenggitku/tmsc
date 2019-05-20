<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/4/19
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-2.1.4.min.js"></script>
</head>
<body>
<table border="1 red" style="margin:0 auto;align-content: center ">
    <tr>
        <td>用户名</td>
        <td>联系方式</td>
        <td>邮箱</td>
        <td>注册日期</td>
        <td>权限</td>
        <td>真实姓名</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="adiministator" varStatus="vs">
        <tr<c:if test="${vs.index%2==0}"> bgcolor="#dcdcdc" </c:if>>
            <td>${adiministator.userName}</td>
            <td>${adiministator.phoneNumber}</td>
            <td>${adiministator.email}</td>
            <td>
                <fmt:formatDate value="${adiministator.date}" type="date" pattern="yyyy-MM-dd HH:mm"/>
            </td>
            <td>${adiministator.permission}</td>
            <td>${adiministator.name}</td>
            <td>
                <a href="${pageContext.request.contextPath}/welcome/deleteuser?id=${adiministator.id}" class="a_post">删除</a>
                <a href="${pageContext.request.contextPath}/welcome/checkuser?id=${adiministator.id}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

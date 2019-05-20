<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/4/2
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车</title>
</head>
<body>
<h1>购物车</h1>
<table border="1" style="text-align: center">
    <tr>
        <td hidden="hidden">id：</td>
        <td>商品名：</td>
        <td>照片：</td>
        <td>描述：</td>
        <td>价格：</td>
        <td>类别：</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${pageInfo.list}" var="user" varStatus="vs">
        <tr <c:if test="${vs.index%2==0}">bgcolor="#dcdcdc"</c:if>>
            <td hidden = "hidden">${user.merchandise.id}</td>
            <td>${user.merchandise.merchandiseName}</td>
            <td><img src="${pageContext.request.contextPath}/statics/img/${user.merchandise.photo}" width="200px" height="50px"></td>
            <td>${user.merchandise.details}</td>
            <td>${user.merchandise.price}</td>
            <td>${user.merchandise.category}</td>
            <td>
                <a href="http://localhost:8080/order/turnOrder?merchandiseId=${user.merchandise.id}">结算</a>
            </td>
        </tr>
    </c:forEach>


</table>

</body>
</html>

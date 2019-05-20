<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/4/19
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询订单</title>
</head>
<body>
<table border="1 red" style="margin:0 auto;text-align: center ">
    <tr>
        <td>订单号</td>
        <td>商品id</td>
        <td>商品名</td>
        <td>用户</td>
        <td>收件人</td>
        <td>收货地址</td>
        <td>收货人联系方式</td>
        <td>支付方式</td>
        <td>快递</td>
        <td>创建时间</td>
        <td>操作</td>
    </tr>
    <tr>
        <td>${shoporder.orderId}</td>
        <td>${shoporder.merchandiseId}</td>
        <td>${shoporder.merchandise.merchandiseName}</td>
        <td>${shoporder.administrator.userName}</td>
        <td>${shoporder.recipientName}</td>
        <td>${shoporder.recipientAddress}</td>
        <td>${shoporder.recipientPhone}</td>
        <td>${shoporder.payMethod}</td>
        <td>${shoporder.deliveryMethod}</td>
        <td>
            <fmt:formatDate value="${shoporder.createDate}" type="date" pattern="yyyy-MM-dd HH:mm"/>
        </td>


        <td>
            <a href="${pageContext.request.contextPath}/order/deleteorder?orderId=${shoporder.orderId}" >删除</a>
            <a href="${pageContext.request.contextPath}/order/turnupdateorder?orderId=${shoporder.orderId}">修改</a>
        </td>
    </tr>
</table>
</body>
</html>

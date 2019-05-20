<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/4/19
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改订单</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/order/updateorder" method="post">
    订单号:<input type="text" name="id" value="${shoporder.orderId}" readonly="readonly"><br>
    商品名：<input type="text" name="userName" value="${shoporder.merchandise.merchandiseName}" readonly="readonly"><br>
    收件人：<input type="text" name="email" value="${shoporder.recipientName}" ><br>
    收货地址：<input type="text" name="name" value="${shoporder.recipientAddress}"><br>
    收货人联系方式:<input type="text" name="id" value="${shoporder.recipientPhone}" ><br>
    支付方式：<input type="text" name="userName" value="${shoporder.payMethod}" readonly="readonly"><br>
    快递：<input type="text" name="email" value="${shoporder.deliveryMethod}" readonly="readonly"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>

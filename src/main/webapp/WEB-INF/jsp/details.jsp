<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/4/4
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>商品详情页</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/statics/css/details.css">
    <script rel="stylesheet" type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/details.js"></script>
</head>
<body>
<iframe src ="${pageContext.request.contextPath}" width="100%" height="200px" frameborder="0" scrolling="no"></iframe>
<hr>
<div class="divBody">
    <div class="divPhoto">
     <p>
         ${usr}
     </p>
    </div>
    <div class="divShop">
        <div class="divPrice" >
            <div><h2>价格：￥ 100</h2></div>
        </div>
        <div class="divNum">
            <a id="minusOne" href="javaScript:"><img src="#" alt="减一"></a>
            <input type="text" id="num" name="num" value="0">
            <a id="plusOne" href="javaScript:"><img src="#" alt="加一"></a>
            <input type="button" id="shopCart" value="加入购物车">
        </div>
        <div></div>
    </div>
</div>
</body>
</html>

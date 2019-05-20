<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2018/4/21
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>久利王网络科技有限公司</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/statics/css/jiuliwang.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-cookie.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jiuliwang.js"></script>
</head>
<body>
<nav>
    <p>
    <form id="box" action="${pageContext.request.contextPath}/tmsh/research" method="post">
        <input class="inputSearch" type="text" name="condition">
        <input id="search" type="submit" value="搜索">
    </form>
    <div class="login">
        <a><span style="width: 100px;font-size: small">你好！${loginuser.userName}</span></a>
    </div>
    <span id="userId" hidden="hidden">${loginuser.id}</span>
    <div class="register" >
        <a href="${pageContext.request.contextPath}/shopcart/showshop?pageSize=1&pageNum=30&customerId=${loginuser.id}">购物车</a>
    </div>
    </p>
    <div>
        <ol>秒杀</ol>
    </div>
    <div>
        <ol>拼团</ol>
    </div>
    <div>
        <ol>新款</ol>
    </div>
    <div style="width: 80px">
        <ol>日用百货</ol>
    </div>
    <div style="width: 80px">
        <ol>日用百货</ol>
    </div>
    <div style="width: 80px">
        <ol>日用百货</ol>
    </div><div style="width: 80px">
    <ol>日用百货</ol>
</div>
    <div style="width: 80px">
        <ol>日用百货</ol>
    </div>
    <div style="width: 80px">
        <ol>日用百货</ol>
    </div>
    <div style="width: 80px">
        <a href="${pageContext.request.contextPath}/merchandise/list?pageSize=5&pageNum=0"><ol>日用百货</ol></a>
    </div>
</nav>
<div class="divBody">
    <div>
        <div>
            <img src="img/t_shit.jpg" title="这样是一款T恤" alt="ddd" width="240px" height="200px">
            <p style="text-align: center">
                <span>T恤</span></br>
                <span>￥45.00</span>
            </p>
        </div>
        <div>
            <img src="img/t_shit.jpg" width=240px" height="200px">
            <p style="text-align: center">
                <span>T恤</span></br>
                <span>￥45.00</span>
            </p>
        </div>
        <div>
            <img src="img/t_shit.jpg" width=240px" height="200px">
            <p style="text-align: center">
                <span>T恤</span></br>
                <span>￥45.00</span>
            </p>
        </div>
        <div>
            <img src="img/t_shit.jpg" width=240px" height="200px">
            <p style="text-align: center">
                <a href="javascript:doPost('http://localhost:8080/shopcart/detail','{merchandiseId:1}')">
                    <span>T恤</span>
                </a></br>
                <span>￥45.00</span>
            </p>
        </div>
    </div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
</div>
<div class="divBottom">
    底部
</div>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/4/15
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>管理员界面</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/administrator.css" type="text/css">
</head>
<body>
<div>
    <h2 style="text-align: center">管理员</h2>
</div>
<div style="margin: 0px auto;background: gainsboro">
    <form id="box" action="${pageContext.request.contextPath}/merchandise/research" method="post"style="margin-left: 50%">
        <select name="kind">
            <option value="1">商品</option>
            <option value="2">成员</option>
            <option value="3">订单</option>
        </select>
        <input  type="text" name="condition">

        <input id="search" type="submit" value="搜索">
    </form>
    <table cellpadding="20px" cellspacing="0">
        <tr>
            <td>
                <a href="${pageContext.request.contextPath}/merchandise/adlist">查看商品</a>
            </td>
            <td>上货</td>
            <td>
                <a href="${pageContext.request.contextPath}/merchandise/turnAddMerchandis">上货</a>
            </td>
            <td>
                <a href="${pageContext.request.contextPath}/welcome/list">查看成员</a>
            </td>
            <td>
                <a href="${pageContext.request.contextPath}/welcome/permission">添加管理员</a>
            </td>
            <td>
                <a href="${pageContext.request.contextPath}/welcome/permission">删除管理员</a>
            </td>
        </tr>
        <tr>
            <td>查看</td>
            <td>上货</td>
            <td>修改</td>
            <td>查看</td>
            <td>添加</td>
            <td>查看</td>
        </tr>
    </table>
</div>
</body>
</html>

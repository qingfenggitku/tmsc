<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/3/29
  Time: 15:56
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
            <td>添加</td>
            <td>查看</td>
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

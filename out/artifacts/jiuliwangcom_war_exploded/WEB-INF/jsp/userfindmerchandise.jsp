<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/4/18
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-cookie.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/userfindmerchandise.js"></script>
</head>
<body>
<c:forEach items="${list}" var="merchandis" varStatus="vs">
    <tr<c:if test="${vs.index%2==0}"> bgcolor="gray" </c:if>>
        <div><img src="${pageContext.request.contextPath}/statics/img/${merchandis.photo}" alt="图片"> </div>
        <div>商品名称：${merchandis.merchandiseName}</div>
        <div>价格：${merchandis.price}</div>
        <div>类别：${merchandis.category}</div>
        <input type="button" onclick="shopcart(${merchandis.id})" value="加入购物车">
    </tr>
</c:forEach>
</table>
</body>
</html>

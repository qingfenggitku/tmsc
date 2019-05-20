<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/4/12
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>日用百货</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-cookie.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/userfindmerchandise.js"></script>
</head>
<body>
<table border="1 red" style="margin:0 auto;align-content: center ">
    <c:forEach items="${pageInfo.list}" var="merchandis" varStatus="vs">
        <tr<c:if test="${vs.index%2==0}"> bgcolor="gray" </c:if>>
            <div><img src="${pageContext.request.contextPath}/statics/img/${merchandis.photo}" alt="图片"> </div>
            <div>商品名称：${merchandis.merchandiseName}</div>
            <div>价格：${merchandis.price}</div>
            <div>${merchandis.details}</div>
            <a href="#">购买</a>
            <input type="button" onclick="shopcart(${merchandis.id})" value="加入购物车">
        </tr>
    </c:forEach>
</table>

<a href="${pageContext.request.contextPath}/merchandise/list?pageNum=1&pageSize=20">首页</a>
<a href="${pageContext.request.contextPath}/merchandise/list?pageNum=${pageInfo.pageNum-1}&pageSize=20">上一页</a>
<a href="${pageContext.request.contextPath}/merchandise/list?pageNum=${pageInfo.pageNum+1}&pageSize=20">下一页</a>
<a href="${pageContext.request.contextPath}/merchandise/list?pageNum=pages&pageSize=20">末页</a>
<span>第${pageInfo.pageNum}页/共${pageInfo.pages}页</span>
</body><form action="${pageContext.request.contextPath}/merchandise/list" style="display: inline-block">
    <input type="text" name="pageNum" style=" width: 40px;text-align: center;">
    <input type="submit"  value="跳转">
</form>
</body>
</html>

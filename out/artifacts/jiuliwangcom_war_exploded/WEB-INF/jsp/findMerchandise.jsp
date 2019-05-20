<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/4/17
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-2.1.4.min.js"></script>
</head>
<body>
<table border="1 red" style="margin:0 auto;align-content: center ">
    <c:forEach items="${list}" var="merchandis" varStatus="vs">
        <tr<c:if test="${vs.index%2==0}"> bgcolor="gray" </c:if>>
            <div><img src="${pageContext.request.contextPath}/statics/img/${merchandis.photo}" alt="图片"> </div>
            <div>商品id：${merchandis.id}</div>
            <div>商品名称：${merchandis.merchandiseName}</div>
            <div>价格：${merchandis.price}</div>
            <div>类别：${merchandis.category}</div>
            <div>现存数量：${merchandis.number}</div>
            <div>销量：${merchandis.salesVolume}</div>
            <%--格式化时间--%>
            <div>
                上架时间：<fmt:formatDate value="${merchandis.addedTime}" type="date" pattern="yyyy-MM-dd HH:mm"/>

            </div>
            <a href="${pageContext.request.contextPath}/merchandise/check?id=${merchandis.id}">修改</a>
            <a href="${pageContext.request.contextPath}/merchandise/delete?id=${merchandis.id}">删除</a>
        </tr>
    </c:forEach>
</table>

</body>
</html>

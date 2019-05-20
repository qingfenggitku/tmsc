<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/4/22
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1 red" style="margin:0 auto;align-content: center ">
    <c:forEach items="${pageInfo.list}" var="merchandis" varStatus="vs">
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
        </tr>
        <a href="${pageContext.request.contextPath}/merchandise/check?id=${merchandis.id}">修改</a>
        <a href="${pageContext.request.contextPath}/merchandise/delete?id=${merchandis.id}">删除</a>
    </c:forEach>
</table>

<a href="${pageContext.request.contextPath}/merchandise/adlist?pageNum=1&pageSize=20">首页</a>
<a href="${pageContext.request.contextPath}/merchandise/adlist?pageNum=${pageInfo.prePage}&pageSize=20">上一页</a>
<a href="${pageContext.request.contextPath}/merchandise/adlist?pageNum=${pageInfo.nextPage}&pageSize=20">下一页</a>
<a href="${pageContext.request.contextPath}/merchandise/adlist?pageNum=${pageInfo.pages}&pageSize=20">末页</a>
<span>共第${pageInfo.pageNum}页/共${pageInfo.pages}页</span>
</body><form action="${pageContext.request.contextPath}/merchandise/adlist" style="display: inline-block">
    <input type="text" name="pageNum" style=" width: 40px;text-align: center;">
    <input type="submit"  value="跳转">
</form>
</html>

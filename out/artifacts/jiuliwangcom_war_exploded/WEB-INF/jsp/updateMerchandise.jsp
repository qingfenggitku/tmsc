<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/4/17
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新商品</title>
</head>
<body>
 <form action="${pageContext.request.contextPath}/merchandise/update" method="post">
     <input type="text" name="id" value="${merchandise.id}" readonly="readonly">
     <input type="text" name="merchandiseName" value="${merchandise.merchandiseName}">
     <input type="text" name="price" value="${merchandise.price}">
     <input type="text" name="number" value="${merchandise.number}">
     <input type="text" name="details" value="${merchandise.details}">
     <input type="text" name="category" value="${merchandise.category}">
     <input type="text" name="photo" value="${merchandise.photo}">
     <input type="submit" value="提交">
 </form>
</body>
</html>

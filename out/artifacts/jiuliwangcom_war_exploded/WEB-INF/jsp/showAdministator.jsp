<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/4/16
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>成员表</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-2.1.4.min.js"></script>
</head>
<body>
<table border="1 red" style="margin:0 auto;align-content: center ">
       <tr>
            <td>用户名</td>
            <td>联系方式</td>
            <td>邮箱</td>
            <td>注册日期</td>
            <td>权限</td>
            <td>真实姓名</td>
            <td>操作</td>
       </tr>
    <c:forEach items="${pageInfo.list}" var="adiministator" varStatus="vs">
        <tr<c:if test="${vs.index%2==0}"> bgcolor="#dcdcdc" </c:if>>
            <td>${adiministator.userName}</td>
            <td>${adiministator.phoneNumber}</td>
            <td>${adiministator.email}</td>
            <td>
                <fmt:formatDate value="${adiministator.date}" type="date" pattern="yyyy-MM-dd HH:mm"/>
            </td>
            <td>${adiministator.permission}</td>
            <td>${adiministator.name}</td>
            <td>
                <a href="${pageContext.request.contextPath}/welcome/deleteuser?id=${adiministator.id}" class="a_post">删除</a>
                <a href="${pageContext.request.contextPath}/welcome/checkuser?id=${adiministator.id}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
<span hidden="hidden">${status}</span>
<div style="margin-left: 500px">
<a href="${pageContext.request.contextPath}/welcome/list?pageNum=1&pageSize=20">首页</a>
<a href="${pageContext.request.contextPath}/welcome/list?pageNum=${pageInfo.prePage}&pageSize=20">上一页</a>
<a href="${pageContext.request.contextPath}/welcome/list?pageNum=${pageInfo.nextPage}&pageSize=20">下一页</a>
<a href="${pageContext.request.contextPath}/welcome/list?pageNum=${pageInfo.pages}&pageSize=20">末页</a>
    <span>第${pageInfo.pageNum}页/共${pageInfo.pages}页</span>
<form action="${pageContext.request.contextPath}/welcome/list" style="display: inline-block">
    <input type="text" name="pageNum" style=" width: 40px;text-align: center;">
    <input type="submit"  value="跳转">
</form>
<script type="text/javascript">
       /* $(".a_post").on("click",function(event){
            event.preventDefault();  // 使a自带的方法失效，即无法向addStudent.action发出请求

            $.post("url",
                {date:date},
                function (date) {

                },
                "json"
            );

        });*/

     /*  $(function () {
           window.location.href="\${pageContext.request.contextPath}/welcome/list";
       })
       var status = $("span").text();
       if (status = "success") {
           /!*window.location.href="\${pageContext.request.contextPath}/welcome/list";*!/
           alert("删除成功！")
       }
       if (status = "fail") {
          /!* window.location.href="\${pageContext.request.contextPath}/welcome/list";*!/
           alert("删除失败！")
       }*/

</script>
</div>
</body>
</html>

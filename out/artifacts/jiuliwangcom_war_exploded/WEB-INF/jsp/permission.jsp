<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/4/17
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-2.1.4.min.js"></script>
<html>
<head>
    <title>权限</title>
</head>
<body>
<form>
    用户名：<input type="text" name="userName" id="userName"><br>
    <input type="button" value="添加管理员" id="add">
    <input type="button" value="删除管理员" id="delete">
</form>
<script type="text/javascript">
    $(function () {
        $("#add").click(function () {
            var userName = $("#userName").val();
            console.log(userName)
            $.post("http://localhost:8080/welcome/addManager",
                {userName:userName},
                function (date) {
                    if (date.message = "success") {
                        alert("添加成功！")
                    }else {
                        alert("添加失败！")
                    }
                },
                "json");
        });
        $("#delete").click(function () {
            var userName = $("#userName").val();
            $.post("http://localhost:8080/welcome/deleteManager",
                {userName:userName},
                function (date) {
                    if (date.message = "success") {
                        alert("删除成功！")
                    }else {
                        alert("删除失败！")
                    }
                },
                "json");
        });
    });
</script>
</body>
</html>

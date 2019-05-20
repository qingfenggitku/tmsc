<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/3/27
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>商品录入</title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/statics/css/commodityRecord.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/commodityRecord.js"></script>
</head>
<body>
<form action="${pageContext.request.contextPath}/merchandise/addMerchangdis" method="post" onsubmit="record()">
    <div class="wrapper">
        <div class="itemInfo">
            <table cellspacing="0" cellpadding="0" border="0" class="normTbe tabInfo">
                <thead>
                <tr>
                    <th><em>*</em> 商品名称：</th>
                    <th><em>*</em> 详情：</th>
                    <th><em>*</em> 价格：</th>
                    <th>分类：</th>
                    <th>数量：</th>
                    <th>销量：</th>
                    <th>图片：</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody class="tbody1">
                <tr>
                    <td><input type="text" name="merchandiseName" id="merchandiseName"/></td>
                    <td><input type="text" name="details" id="details"/></td>
                    <td><input type="text" name="price" id="price"/></td>
                    <td><input type="text" name="category" id="category"/></td>
                    <td><input type="text" name="number" id="number"/></td>
                    <td><input type="text" name="salesVolume" id="salesVolume"/></td>
                    <td><input type="text" name="photo" id="photo"/></td>
                    <td>
                        <input type="reset" value="重置">
                    </td>
                    </tr>
                </tbody>
            </table>
            <div class="copybtn">
                <input type="button" id="AddTr" value="新增"/>
                <input type="submit" value="提交">
            </div>
        </div>

    </div><!-- itemInfo -->

    </div>
      ${message}
    </div>
</form>
</body>
</html>

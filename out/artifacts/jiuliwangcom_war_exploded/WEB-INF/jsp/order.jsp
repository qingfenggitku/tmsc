<%--
  Created by IntelliJ IDEA.
  User: 81232
  Date: 2019/4/2
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-cookie.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/order.js"></script>
</head>
<body>
<form>
    <ol>
        <li>
            <a name="top">收货信息</a>
        </li>
        <div>
            <ul style="list-style-type: none">
                <li>
                    收货人姓名  ：<input type="text" name="recipientName" id="recipientName" required="required"> 必须填写
                </li>
                <li>
                    收货地址    ：<input type="text" name="recipientAddress" id="recipientAddress" required="required">必须填写
                </li>
                <li>
                    邮政编码    ：<input type="text" name="postalCode" id="postalCode">
                </li>
                <li>
                    收货人联系方式：<input type="text" name="recipientPhone" id="recipientPhone" required="required"> 必须填写
                </li>
                <li>
                    收货人电话   ：<input type="text" name="telephone" id="telephone">
                </li>
            </ul>
        </div>
        <li>
            支付方式
            <hr>
            <div id="payMethod">
                <input type="radio"  name="payMethod" checked="checked" value="支付宝">支付宝</input>
                <input type="radio"  name="payMethod" value="微信">微信</input>
            </div>
        </li>
        <li>
            配送方式
            <hr>
            <div id="deliveryMethod">
                <input type="radio" name="deliveryMethod" checked="checked" value="顺丰快递">顺丰快递</input>
                <input type="radio" name="deliveryMethod" value="中通快递">中通快递</input>
            </div>
        </li>
        <li>
            商品清单
            <div>
                <table>
                    <tr>
                        <td style="display: none">商品id</td>
                        <td>商品名称</td>
                        <td>商品展示</td>
                        <td>商品价格</td>
                        <td>商品简介</td>
                    </tr>
                    <tr>
                        <td id="merchandiseId" style="display: none">${merchandise.id}</td>
                        <td>${merchandise.merchandiseName}</td>
                        <td><img src="${pageContext.request.contextPath}/statics/img/${merchandise.photo}">${merchandise.photo}</td>
                        <td>${merchandise.price}</td>
                        <td>${merchandise.details}</td>
                    </tr>
                </table>
            </div>
        </li>
        <li>
            结算信息
            <table>
            <h1>共计：${merchandise.price}￥</h1>
            </table>
        </li>
    </ol>
    <div>
        <a href="#top" style="text-decoration: none;width: 80px;height: 30px;
        background: gainsboro;text-align: center ; margin: 20px">
            返回修改
        </a>
        <input type="button" id="btn" value="确认提交">
    </div>
</form>
<script type="text/javascript">
</script>
</body>
</html>

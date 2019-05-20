$(function () {
    $("#btn").click(function () {
        var recipientName = $("#recipientName").val();
        var recipientAddress = $("#recipientAddress").val();
        var recipientPhone = $("#recipientPhone").val();
        var telephone = $("#telephone").val();
        var payMethod = $("#payMethod input:radio:checked").val();
        var deliveryMethod = $("#deliveryMethod input:radio:checked").val();
        var merchandiseId = $("#merchandiseId").text();
        var customerId = $.cookie("userId");
        console.log(deliveryMethod);
        /*window.location.href="http://localhost:8080/welcome/logins";*/
        $.post("http://localhost:8080/order/addOrder",
            { recipientName: recipientName,
                recipientAddress: recipientAddress,
                recipientPhone: recipientPhone,
                telephone: telephone,
                payMethod:payMethod,
                deliveryMethod:deliveryMethod,
                merchandiseId:merchandiseId,
                customerId: customerId},
            function (data) {
                /*window.location.href="http://localhost:8080/welcome/logins";*/
                if (data.message = "ok") {
                    var orderId = data.orderId;
                    window.location.href="http://localhost:8080/alipay/goAplipay?orderId="+orderId;
                }
                if (data.message = "error") {
                    alert("结算失败请检查信息！")
                }
            },
            "json");
    });
});
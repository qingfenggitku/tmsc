/*details直接加载*/
$(function () {
    var num = parseInt($("#num").val()) ;

    $("#plusOne").click(function () {
        $("#num").val(++num)
    });
    $("#minusOne").click(function () {
        if (num <= 0) {
            alert("已到下线，不能再减了！");
        } else {
            $("#num").val(--num)
        }
    });
    $("#shopCart").click(function () {

       /* var merchandiseId = $("#merchandiseId").text();*/
        var merchandiseId = 1;
            /*window.location.href="http://localhost:8080/welcome/logins";*/
      $.post("http://localhost:8080/shopcart/addshop",
            {merchandiseId:merchandiseId},
            function (data) {
                if (data == "success") {
                    alert("添加成功！");
                } else {
                    alert("添加失败！")
                }
            },
            "json");
    });
});

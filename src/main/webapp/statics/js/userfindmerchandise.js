function shopcart(id) {
    var customerId = $.cookie("userId");
    console.log(customerId);
    console.log(id);
    $.post(
        "http://localhost:8080/shopcart/addshop",
        {merchandiseId:id,customerId:customerId},
        function (date) {
            console.log(date)
            if ( date = "1") {
                alert("添加成功");
            }else {
                alert("添加失败！")
            }
        }
    )
}

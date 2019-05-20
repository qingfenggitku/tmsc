function shopcart(id) {

    console.log(customerId)

}
/*$(".a_post").on("click",function(event){
    var customerId = $.cookie("userId");
    event.preventDefault();//使a自带的方法失效，即无法调整到href中的URL(http://www.baidu.com)
    $.post(
        "http://localhost:8080/order/turnOrder",
        {merchandiseId:id,customerId:customerId},
        function (date) {
            console.log(date)
            if ( date = 1) {
                alert("添加成功");
            }else {
                alert("添加失败！")
            }
        },"json"
    )
});*/

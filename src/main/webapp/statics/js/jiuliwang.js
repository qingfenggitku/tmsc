/*$(function () {
    $("#tshit").click(function () {
       /!* //使a自带的方法失效
        event.preventDefault();
        var merchandiseId = 1;
        console.log(merchandiseId);
       /!* window.location.href="http://localhost:8080/shopcart/detail";*!/
        $.post("http://localhost:8080/shopcart/detail",
            {merchandiseId: merchandiseId},
            function (data) {

            }, "json");*!/
    });
});*/
function doPost(url, p) {  // to:提交动作（action）,p:参数
    var myForm = document.createElement("form");
    myForm.method = "post";
    myForm.action = url;
    for (var i in p){
        var myInput = document.createElement("input");
        myInput.setAttribute("name", i);  // 为input对象设置name
        myInput.setAttribute("value", p[i]);  // 为input对象设置value
        myForm.appendChild(myInput);
    }
    document.body.appendChild(myForm);
    myForm.submit();
    document.body.removeChild(myForm);  // 提交后移除创建的form
}
$(function () {
    var userid = $("span:hidden").text();
    $.cookie("userId", userid,{ path: '/', expires: 10 });
});
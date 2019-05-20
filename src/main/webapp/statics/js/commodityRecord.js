/*$(function(){
// 新增表单
    var show_count = 20;
    var count = 1;
    $("#AddTr").click(function () {

        var length = $(".tabInfo .tbody1>tr").length;
        //alert(length);
        if (length < show_count)
        {
            $(".normTbe .tbody1 tr").clone().appendTo(".tabInfo .tbody1");
        }
    });

});*/

/*$(function () {
    /!*function Merchandis() {
        this.merchandiseName = $("#merchandiseName").val();
        this.details = $("#details");
        this.price = $("#price");
        this.category = $("#category"); //商品类别
        this.number = $("#number");  //商品数量
        this.addedTime = new Date(); //商品上架时间
        this.salesVolume = $("#salesVolume"); //销量
    }
    var merchandis = new Merchandis();*!/
    //商品录入
    var merchandiseName = $("#merchandiseName").val();
    var details = $("#details").val();
    var price = $("#price").val();
    var category = $("#category").val();
    var number = $("#number").val();
    var salesVolume = $("#salesVolume").val();
    $("#AddMer").click(function () {
        $.post("${pageContext.request.contextPath}/merchandise/addMerchangdis",
            {merchandiseName:"merchandiseName",details:"details",price:"price",category:"category",
                number:"number",salesVolume:"salesVolume"
            },
            function (data) {
                alert(data.message);
            },"json");
    });
});*/
function deltr(opp) {
    var length = $(".tabInfo .tbody1>tr").length;
    //alert(length);
    if (length <= 1) {
        alert("至少保留一行");
    } else {
        $(opp).parent().parent().remove();//移除当前行

    }
}
function record() {
    var merchandiseName = $("#merchandiseName");
    if (bookName.val().length == 0) {
        alert("商品名不能为空");
        return false;
    }
    var details = $("#details");
    if (details.val().length == 0) {
        alert("作者不能为空");
        return false;
    }
    var price = $("#price").val();
    var ival = parseInt(price);
    if (price.length==0) {
        alert("价格不能为空！")
        return false;
    }else if (isNaN(ival)) {
        alert("价格必须是数字");
        return false;
    }

    var category = $("#category");
    if (details.val().length == 0) {
        category("类别");
        return false;
    }
    var number = $("#number").val();
    var ival = parseInt(number);
    if (number.length==0) {
        alert("数量不能为空！")
        return false;
    }else if (isNaN(ival)) {
        alert("数量必须是数字");
        return false;
    }
    var salesVolume = $("#salesVolume");
    if (salesVolume.val().length == 0) {
        alert("销量名不能为空");
        return false;
    }else if (isNaN(ival)) {
        alert("销量必须是数字");
        return false;
    }
    return true;
}





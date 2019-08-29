$(function () {
    userInfoShow();

    function userInfoShow() {
        $("#name").html("");
        $("#sex").html("");
        $("#phone").html("");
        $("#idCard").html("");
        var userId = sessionStorage.getItem("userId");
        var myjson = {id:userId};
        console.log(userId);
        $.ajax({
            url: "/userInfo",   // 请求路径  url-pattern  基于当前工程的绝对路径
            type: "post",            // 请求的方式，不区分大小写
            async: true,             // 是否异步，true是默认值，false为同步请求
            cache: false,            // 关闭缓存，目的是为了避免部分浏览器缓存加载出错(IE)
            datatype: "json",        // 返回类型，text文本、html页面、json数据
            contentType: "application/json;charset=utf-8",
            data: JSON.stringify(myjson),
            success: function (data) {
                console.log("成功:" + JSON.stringify(data));
                console.log("成功:" + JSON.stringify(data.code));
                if(data.code == 200){
                    var name = data.name;
                    var sex = data.sex;
                    var phone = data.phone;
                    var idCard = data.idCard;

                    $("#name").html(name);
                    $("#sex").html(sex);
                    $("#phone").html(phone);
                    $("#idCard").html(idCard);
                }
            },
            error: function (data) {
                console.log("错误:" + JSON.stringify(data));
            }
        });
    }
});

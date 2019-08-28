

    $("#queren").click(function() {

        var userId = sessionStorage.getItem("userId");
        // var username = $("input[name='username']").val().trim();
        var pw = $("input[name='oldpassword']").val().trim();
        var pw1 = $("input[name='newpassword']").val().trim();
        var myjson = {oldpassword:pw,newpassword:pw1,userId:userId};
        $.ajax({
            url: "/ismima",   // 请求路径  url-pattern  基于当前工程的绝对路径
            type: "post",            // 请求的方式，不区分大小写
            async: true,             // 是否异步，true是默认值，false为同步请求
            cache: false,            // 关闭缓存，目的是为了避免部分浏览器缓存加载出错(IE)
            datatype: "json",        // 返回类型，text文本、html页面、json数据
            contentType: "application/json;charset=utf-8",
            data: JSON.stringify(myjson),
            success: function (data) {
                if(data.code == 200){
                    alert(data.msg);
                    window.location="index.html";<!--js页面跳转-->
                }else {
                    alert(data.msg);
                }
            },
            error: function (data) {
                alert(data.msg);
                console.log("错误:" + JSON.stringify(data));
            }
        });
    });


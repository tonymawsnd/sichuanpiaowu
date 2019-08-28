$(function () {
    //这里还没有传入userId,用一个模拟数据代替
    let userid = "f47ce6a3de0c4b52ac7c41a0ff936b39";

    //所有订单
    function allDingDan() {
        $("#allDingDan").click(function () {
            $.ajax({
                url: "/selectMyAllDinDanByUserId",   // 请求路径  url-pattern  基于当前工程的绝对路径
                type: "post",            // 请求的方式，不区分大小写
                async: true,             // 是否异步，true是默认值，false为同步请求
                cache: false,            // 关闭缓存，目的是为了避免部分浏览器缓存加载出错(IE)
                datatype: "json",        // 返回类型，text文本、html页面、json数据
                contentType: "application/json;charset=utf-8",
                data: JSON.stringify({userid:userid}),
                success: function (data) {
                    $("#showDingDan").html("");
                    outHTML = "";
                    for (var x in data) {
                        var payState = "" ;
                        console.log(data[x].zhifuzhuangtai);
                        if(1 == data[x].zhifuzhuangtai){
                            payState = "已支付"
                        }
                        else{
                            payState = "未支付"
                        }
                        outHTML = "<tr>\n" +
                            "                    <td>"+ data[x].name +"</td>\n" +
                            "                    <td>"+ data[x].userphone +"</td>\n" +
                            "                    <td>" + data[x].checi.checi + "</td>\n" +
                            "                    <td>" + data[x].checi.fazhan + "</td>\n" +
                            "                    <td>" + data[x].checi.daozhan + "</td>\n" +
                            "                    <td>" + data[x].checi.fashi + "</td>\n" +
                            "                    <td>" + data[x].checi.daoshi + "</td>\n" +
                            "                    <td>" + data[x].checi.jiage + "</td>\n" +
                            "                    <td>" + payState + "</td>\n" +
                            "                </tr>";
                        $("#showDingDan").append(outHTML);
                    }


                },
                error: function (data) {
                    console.log("错误:" + JSON.stringify(data));
                }
            });
        })

    }

    //未支付订单查询
    function NoPayDingDan() {

        $("#NoPayDingDan").click(function () {
            $.ajax({
                url: "/selectMyDinDanByPayState",   // 请求路径  url-pattern  基于当前工程的绝对路径
                type: "post",            // 请求的方式，不区分大小写
                async: true,             // 是否异步，true是默认值，false为同步请求
                cache: false,            // 关闭缓存，目的是为了避免部分浏览器缓存加载出错(IE)
                datatype: "json",        // 返回类型，text文本、html页面、json数据
                contentType: "application/json;charset=utf-8",
                data: JSON.stringify({userid:userid,paystate:"0"}),
                success: function (data) {
                    console.log(data);
                    $("#showDingDan").html("");
                    outHTML = "";
                    for (var x in data) {
                        var payState = "" ;
                        if(1 == data[x].zhifuzhuangtai){
                            payState = "已支付"
                        }
                        else{
                            payState = "未支付"
                        }
                        outHTML = "<tr>\n" +
                            "                    <td>"+ data[x].name +"</td>\n" +
                            "                    <td>"+ data[x].userphone +"</td>\n" +
                            "                    <td>" + data[x].checi.checi + "</td>\n" +
                            "                    <td>" + data[x].checi.fazhan + "</td>\n" +
                            "                    <td>" + data[x].checi.daozhan + "</td>\n" +
                            "                    <td>" + data[x].checi.fashi + "</td>\n" +
                            "                    <td>" + data[x].checi.daoshi + "</td>\n" +
                            "                    <td>" + data[x].checi.jiage + "</td>\n" +
                            "                    <td>" + payState + "</td>\n" +
                            "                </tr>";
                        $("#showDingDan").append(outHTML);
                    }
                },
                error: function (data) {
                    console.log("错误:" + JSON.stringify(data));
                }
            });
        })

    }

    function PayDingDan() {
        $("#PayDingDan").click(function () {
            $.ajax({
                url: "/selectMyDinDanByPayState",   // 请求路径  url-pattern  基于当前工程的绝对路径
                type: "post",            // 请求的方式，不区分大小写
                async: true,             // 是否异步，true是默认值，false为同步请求
                cache: false,            // 关闭缓存，目的是为了避免部分浏览器缓存加载出错(IE)
                datatype: "json",        // 返回类型，text文本、html页面、json数据
                contentType: "application/json;charset=utf-8",
                data: JSON.stringify({userid:userid,paystate:"1"}),
                success: function (data) {
                    console.log(data);
                    $("#showDingDan").html("");
                    outHTML = "";
                    for (var x in data) {
                        var payState = "" ;
                        if(1 == data[x].zhifuzhuangtai){
                            payState = "已支付"
                        }
                        else{
                            payState = "未支付"
                        }
                        outHTML = "<tr>\n" +
                            "                    <td>"+ data[x].name +"</td>\n" +
                            "                    <td>"+ data[x].userphone +"</td>\n" +
                            "                    <td>" + data[x].checi.checi + "</td>\n" +
                            "                    <td>" + data[x].checi.fazhan + "</td>\n" +
                            "                    <td>" + data[x].checi.daozhan + "</td>\n" +
                            "                    <td>" + data[x].checi.fashi + "</td>\n" +
                            "                    <td>" + data[x].checi.daoshi + "</td>\n" +
                            "                    <td>" + data[x].checi.jiage + "</td>\n" +
                            "                    <td>" + payState + "</td>\n" +
                            "                </tr>";
                        $("#showDingDan").append(outHTML);
                    }
                },
                error: function (data) {
                    console.log("错误:" + JSON.stringify(data));
                }
            });
        })
    }


    allDingDan();
    NoPayDingDan();
    PayDingDan();


});
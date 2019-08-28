//查询火车时刻表
$("#query").click(function () {
    var origin = $("#origin").val();
    var destination = $("#destination").val();
    var dates = $("#dates").val();

    var myjson = {
        userid: "aaa222@163.com",
        seckey: "293fde91f94bf14256ec6c92d5f4661b",
        startStation: origin,
        arriveStation: destination,
        date: dates
    };

    $(function () {
        $.ajax({
            url: "/cp",
            type: "POST",
            async: true,
            cache: false,
            datatype: "json",
            contentType: "application/json;charset=UTF-8",
            data: JSON.stringify(myjson),
            success: function (data) {
                $("#chepiao").empty();

                var json = JSON.parse(data[0]);
                var myjsonArray = json.data;
                // for (i in s) {
                //     $("#chepiao").append("<tr><td>" + s[i].trainCode + "</td><td>" + s[i].trainGrade + "</td><td>" + s[i].startStation + "</td><td>" + s[i].arriveStation + "</td><td>"
                //         + s[i]['startTime'] + "</td><td>" + s[i]['endTime'] + "</td><td>" + s[i].takeTime + "</td><td>" + s[i]['hard-seat-prc'] + "</td><td><a href=\"/yuding.html\" class=\"btn btn-success\">预定</a></td></tr>");
                // }

                for (x in myjsonArray) {
                    // console.log(JSON.stringify(myjsonArray[index]));
                    var mytr = "<tr id=index0" + x + ">";
                    mytr += "<td>" + myjsonArray[x].trainCode + "</td>";
                    mytr += "<td>" + myjsonArray[x].startStation + "</td>";
                    mytr += "<td>" + myjsonArray[x].startTime + "</td>";
                    mytr += "<td>" + myjsonArray[x].arriveStation + "</td>";
                    mytr += "<td>" + myjsonArray[x].endTime + "</td>";
                    mytr += "<td>" + myjsonArray[x].takeTime + "</td>";
                    mytr += "<td>" + myjsonArray[x].trainGrade + "</td>";
                    mytr += "<td>" + myjsonArray[x].day_diff + "</td>";
                    if (myjsonArray[x].trainCode[0] === "D" || myjsonArray[x].trainCode[0] === "G" || myjsonArray[x].trainCode[0] === "C") {
                        mytr += "<td><div>一等座:" + myjsonArray[x]['one-seat-prc'] + "</div>";
                        mytr += "<div>二等座:" + myjsonArray[x]['two-seat-prc'] + "</div></td>";
                    } else {
                        mytr += "<td><div>硬卧:" + myjsonArray[x]['hard-sleeper-prc'] + "</div>";
                        mytr += "<div>硬座:" + myjsonArray[x]['hard-seat-prc'] + "</div></td>";
                    }
                    mytr += "<td><a href=\"/yuding.html?trainCode=" + myjsonArray[x].trainCode + "&startStation=" + myjsonArray[x].startStation + "&arriveStation=" + myjsonArray[x].arriveStation + "&startTime=" + dates +"/"+ myjsonArray[x].startTime + "\" class=\"btn btn-success\">预定</a></td>";
                    mytr += "</tr>";
                    // 每一次查询的时候，把前面的记录清空，但是需要保留第一行的文字内容
                    // console.log(mytr);
                    $("#chepiao").append(mytr);


                }
            },
            error: function (data) {
                alert("出错" + data);
            }
        });
    });
})





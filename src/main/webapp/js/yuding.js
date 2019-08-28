f();



//获取url中的参数
function getUrlParam(name) {
    var reg = new RegExp('(^|&)' + name + '=([^&]*)(&|$)', 'i');
    var r = window.location.search.substr(1).match(reg);
    if (r != null) {
        return unescape(r[2]);
    }
    return null;
}

function f() {
    var trainCode = getUrlParam("trainCode");
    var startStation = getUrlParam("startStation");
    var arriveStation = getUrlParam("arriveStation");
    var startTime = getUrlParam("startTime");
    if(trainCode != null && startStation != null && arriveStation != null && startTime != null){
        $("#checi").val(trainCode);
        $("#qidian").val(startStation);
        $("#zhongdian").val(arriveStation);
        $("#chufashijian").val(startTime);
        $("#checi").attr({ readonly: 'true' });
        $("#qidian").attr({ readonly: 'true' });
        $("#zhongdian").attr({ readonly: 'true' });
        $("#chufashijian").attr({ readonly: 'true' });
}

}
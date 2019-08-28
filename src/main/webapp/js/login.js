$(document).ready(function(){
   
   var pos = $(".loginbox .head a").eq(1).position();
   var width = $(".loginbox .head a").eq(1).width();
    
   $(".loginbox .bottomline").css({'left':pos.left+'px','width':width+'px'});
   $(".loginbox .ct .item").eq(1).show();

  
   $(".loginbox .head a").click(function(){
   	   var index = $(this).index();
   	  
   	   $(".loginbox .ct .item").hide();
   
   	   $(".loginbox .ct .item").eq(index).show();
   	
   	   pos = $(this).position();
       width = $(this).width();       
       $(".loginbox .bottomline").animate({'left':pos.left+'px','width':width+'px'},300);
       
       $(this).addClass('sel').siblings().removeClass("sel");
   });
 
   $(".delusername").click(function(){
   		$("input[name='username']").val('');
   });

 
   $(".outbox").click(function(){
   	   $(this).find(".checkbox").toggleClass('sel');
   });

   //登陆
   $(".submitBtn").click(function(){
   	   var username = $("input[name='username']").val().trim();
   	   var password = $("input[name='password']").val().trim();

   	   var myjson = {username:username, password:password};
      /* var patrn_0 = /^[1-9][0-9]{5,12}$/;//验证手机号或qq号*/
	   var patrn_0 = /^1[34578]\d{9}$/;//验证手机号
     /*  var patrn_1= /^[1-9][0-9]{4,}@qq\.com$/;//验证邮箱  */ 
   

   	   if(username.length<1)
   	   {
   	   	   $(".logintip").html('请输入手机号');
		   alert("请输入手机号");
   	   	   return;
   	   }
   	   if(!patrn_0.test(username)/* && !patrn_1.test(username)*/)
   	   {
          $(".logintip").html('手机号格式不正确');
		   alert("手机号格式不正确");
   	   	   return;
   	   } 
        if(password.length<8)
        {
        	$(".logintip").html('请正确输入密码');
			 alert("请输入正确密码");
   	   	   return;
        }
		if(event.keyCode==13){
			
			return;
			
			}
		else{
			
			// alert("登录成功");
			// window.location="index.html";<!--js页面跳转-->

			$.ajax({
				url: "/islogin",   // 请求路径  url-pattern  基于当前工程的绝对路径
				type: "post",            // 请求的方式，不区分大小写
				async: true,             // 是否异步，true是默认值，false为同步请求
				cache: false,            // 关闭缓存，目的是为了避免部分浏览器缓存加载出错(IE)
				datatype: "json",        // 返回类型，text文本、html页面、json数据
				contentType: "application/json;charset=utf-8",
				data: JSON.stringify(myjson),
				success: function (data) {
					console.log(data);
					console.log(data.userId);
					if(data.code == 200){
						alert(data.msg);
						sessionStorage.setItem("userId",data.userId);
						window.location="index.html";<!--js页面跳转-->
					}else {
						alert(data.msg);
					}
				},
				error: function (data) {
					alert(data.msg)
					console.log("错误:" + JSON.stringify(data));
				}
			});

			
			}

   });

   //清空
   $(".loginbox .inputbox input").focus(function(){
   	   $(".logintip").html('');
   });

});





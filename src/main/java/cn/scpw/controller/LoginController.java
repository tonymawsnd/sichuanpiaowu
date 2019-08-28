package cn.scpw.controller;

import cn.scpw.pojo.User;
import cn.scpw.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Map;

/**
 * @Author LJR
 * @Date 2019/8/27 12:13
 */
@Controller
public class LoginController {

    @Autowired
    LoginService loginService;


    @RequestMapping(value = "/islogin", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map isLogin(@RequestBody(required = false) User user){

        return loginService.isLogin(user);
    }
}

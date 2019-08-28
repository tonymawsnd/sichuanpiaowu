package cn.scpw.controller;

import cn.scpw.pojo.User;
import cn.scpw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
@Controller
public class UserInfoController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/userInfo", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map UserInfo(@RequestBody(required = false) User user){
        return userService.userInfo(user);
    }
}

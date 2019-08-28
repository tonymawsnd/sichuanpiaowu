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

/**
 * @Author XHH
 * @Date 2019/8/28 10:01
 * 这是注册的Controller，用于前段对接，并调用注册Service的isReg方法
 */
@Controller
public class RegController {

    @Autowired
    UserService userService;


    @RequestMapping(value = "/isReg", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map isReg(@RequestBody(required = false) User user){

        return userService.isReg(user);
    }
}
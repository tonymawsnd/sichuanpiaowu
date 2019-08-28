package cn.scpw.controller;

import cn.scpw.pojo.Checi;
import cn.scpw.pojo.User;
import cn.scpw.service.UserService;
import cn.scpw.service.ZhiFuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author XHH
 * @Date 2019/8/28 14.22
 * 这是票务支付的Controller
 */
@Controller
public class ZhiFuController {
    @Autowired
    ZhiFuService zhiFuService;

    @RequestMapping(value = "/isZhiFu", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map isZhiFu(@RequestBody(required = false) Map<String,String> map){
        return  zhiFuService.isZhiFu(map);
    }

}

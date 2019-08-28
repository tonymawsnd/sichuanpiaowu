package cn.scpw.controller;

import cn.scpw.pojo.User;
import cn.scpw.service.XiuGaiMiMaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: sky
 * Date: 2019/8/28
 * Description:
 */
@Controller
public class XiuGaiMiMaController {
    @Autowired
    XiuGaiMiMaService xiuGaiMiMaService;

    @RequestMapping(value = "/ismima", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map isMiMa(@RequestBody(required = false) Map<String, String> map){

        return xiuGaiMiMaService.xiuGaiMiMa(map);
    }
}

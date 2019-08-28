package cn.scpw.controller;

import cn.scpw.pojo.Dingdan;
import cn.scpw.service.DingDanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Author: lyh
 * Version: V1.0
 * Package: cn.scpw.controller
 * Date:  2019/8/28
 * Description:
 */
@Controller
public class DingDanController {

    @Autowired
    DingDanService dingDanService;

    /**
     * 通过用户自己的ID去查询自己所以的订单包括自己的历史订单，订单里面也包括了车次等信息
     * @return 用户订单所有信息集合
     */
    @RequestMapping(value = "/selectMyAllDinDan",method = RequestMethod.GET)
    @ResponseBody
    public List<Dingdan> getMyAllDinDan() {
        List<Dingdan> list = dingDanService.selectAllMyDingDanByUserId("f47ce6a3de0c4b52ac7c41a0ff936b39");
        return list;
    }


}

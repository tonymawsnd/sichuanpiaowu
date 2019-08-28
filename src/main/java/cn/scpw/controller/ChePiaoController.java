package cn.scpw.controller;

import cn.scpw.service.ChepiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Author LJR
 * @Date 2019/8/28 10:21
 */
@Controller
public class ChePiaoController {
    @Autowired
    ChepiaoService chepiaoService;

    /**
     * 查询车票
     * @param map   前端传来的JSON 自动封装成map
     * @return      返回车票100的JSON数据
     */
    @RequestMapping(value = "/cp", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List chePiaoQuery(@RequestBody Map map){

        return chepiaoService.chePiaoQuery(map);
    }

}

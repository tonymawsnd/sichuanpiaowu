package cn.scpw.service;

import cn.scpw.pojo.*;
import cn.scpw.util.AliPayFiled;
import cn.scpw.util.AliPayUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author XHH
 * @Date 2019/8/28 14:25
 * 支付Service
 */

@Service
public class ZhiFuService {

        @Autowired
        DingdanMapper dingdanMapper;

        /**
         * 取出前段传递的车次价格等参数，调用AliPayUtil完成支付
         * @param map 发起订单的人的userid封装对象
         * @return
         */
        @Transactional(rollbackFor = Exception.class)
        public Map isZhiFu(Map<String,String> map){

            //根据sessionStorage调取买票人的id
            //select查询车票的信息和状态
            //完成支付

            System.out.println(map.get("dinDanid"));
            //解包前段给的map，得到订单的id，并用订单id的到订单对象
            Dingdan dingDan = dingdanMapper.selectDinDanByDinDanId(map.get("dinDanid"));

            //用订单对象去调用AliPay,进行支付过程
            AliPayUtil aliPayUtil = new AliPayUtil();
            String form = aliPayUtil.aliPay(
                    "http://localhost:8080/paysuccess.html",
                    AliPayFiled.FAST_INSTANT_TRADE_PAY,
                    dingDan.getId(),
                    "1",
                    dingDan.getCheci().getCheci(),
                    "火车票");

            Map<String, String> returnMap = new HashMap<>();


            //根据form情况返回map，如果支付成功，把form一并返回给前段
            if (form != null){

                User user = new User();

                returnMap.put("form","form");
                returnMap.put("code", "200");
                returnMap.put("msg", "支付成功");
                returnMap.put("html",form);
                return returnMap;

            }else {

                returnMap.put("code", "500");
                returnMap.put("msg", "支付失败");
                return returnMap;

            }
        }

}

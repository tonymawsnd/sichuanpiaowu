package cn.scpw.service;

import cn.scpw.pojo.CheciMapper;
import cn.scpw.pojo.Dingdan;
import cn.scpw.pojo.DingdanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Author: lyh
 * Version: V1.0
 * Package: cn.scpw.service
 * Date:  2019/8/28
 * Description: 订单业务类
 */
@Service
public class DingDanService {


    @Autowired
    DingdanMapper dingdanMapper;
    @Autowired
    CheciMapper checiMapper;

    /**
     * 用户查询自己所有订单信息业务
     * @param userId 用户ID
     * @return 用户订单集合信息
     */
    public List<Dingdan> selectAllMyDingDanByUserId(String userId) {
        return dingdanMapper.selectAllMyDingDanByUserId(userId);
    }

    /**
     * 用户通过车次类型去进行订单查询业务 与自身ID 去查询订单
     * @param leixing 车次类型
     * @param userId 用户ID
     * @return 用户订单对象集合
     */
    public List<Dingdan> selectAllMyDingDanByCheCiLeiXing(String leixing,String userId) {
        return dingdanMapper.selectAllMyDingDanByCheCiLeiXing(leixing,userId);
    }

    /**
     * 用户查询根据是否支付来查询订单
     * @param userId 用户ID
     * @param payState 订单支付状态 0 表示未支付 1 表示支付
     * @return 用户订单合计
     */
    public List<Dingdan> selectDingDanByUserIdAndPayState(String userId, String payState) {
        return dingdanMapper.selectDingDanByUserIdAndPayState(userId, payState);
    }

    /**
     * 插入用户预定的车次信息
     * @param map   前端的JSON
     * @param CheCiId   车次的ID
     */
    public void insertCheCi(Map<String, String> map, String CheCiId) {
        checiMapper.insert(CheCiId, map.get("checi"), map.get("leixing"), map.get("fazhan"), map.get("daozhan")
                , map.get("fashi"), map.get("daoshi"), Long.parseLong(map.get("jiage")));


    }
    /**
     * 插入用户预定的订单信息
     * @param map   前端的JSON
     * @param CheCiId 车次的ID
     */
    public void insertDingDan(Map<String, String> map, String CheCiId) {
        String s = ""+System.currentTimeMillis();

//        System.out.println(map.get("name"));
//        System.out.println(map.get("shenfenzheng"));
//        System.out.println(map.get("userphone"));
//        System.out.println(map.get("userId"));
//        System.out.println(map.get("beizhu"));
//        System.out.println(s);

        dingdanMapper.insert(s, map.get("name"), map.get("shenfenzheng"), map.get("userphone"), CheCiId
                , map.get("userId"), map.get("beizhu"));

    }

    /**
     * 通过订单ID去修改订单的支付状态
     * @param id 订单ID
     */
    public void updateDingDanPayState(String id) {
      dingdanMapper.updateDingDanPayState(id);
    }
}

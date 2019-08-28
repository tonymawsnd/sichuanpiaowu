package cn.scpw.pojo;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;import java.util.List;


/**
 * Author: lyh
 * Version: V1.0
 * Package: ${PACKAGE_NAME}
 * Date:  2019/8/28
 * Description:
 */
@Mapper
public interface DingdanMapper {
    /**
     * 向数据中进行数据订单数据查询，通过用户ID去查询自己所有的订单信息
     *
     * @param userId 用户ID
     * @return 用户订单对象集合
     */
    List<Dingdan> selectAllMyDingDanByUserId(String userId);

    /**
     * 使用车次类别对用户所有订单进行查询，例如动车，用户会查询到自己所有的动车订单
     *
     * @param leixing 车次类型，比如动车
     * @param userId  用户ID
     * @return 用户订单对象集合
     */
    List<Dingdan> selectAllMyDingDanByCheCiLeiXing(String leixing, String userId);

    /**
     * 用户通过支付状态来查找自己的订单
     *
     * @param userId   用户ID
     * @param payState 支付状态 0 表示未支付，1表示支付
     * @return 用户订单对象集合
     */
    List<Dingdan> selectDingDanByUserIdAndPayState(String userId, String payState);

    /**
     * 通过订单ID去查询用户订单
     * @param DingDanId 订单ID
     * @return 订单对象
     */
    Dingdan selectDinDanByDinDanId(String DingDanId);
}
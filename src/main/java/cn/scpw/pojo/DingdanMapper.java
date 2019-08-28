package cn.scpw.pojo;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author: lyh
 * Version: V1.0
 * Package: ${PACKAGE_NAME}
 * Date:  2019/8/28
 * Description: 订单数据持久层
 */
@Mapper
public interface DingdanMapper {

    /**
     * 向数据中进行数据订单数据查询，通过用户ID去查询自己所有的订单信息
     * @param userId 用户ID
     * @return 用户订单对象集合
     */
    List<Dingdan> selectAllMyDingDanByUserId(String userId);

}
package cn.scpw.service;

import cn.scpw.pojo.Dingdan;
import cn.scpw.pojo.DingdanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * 用户查询自己所有订单信息业务
     * @param userId 用户ID
     * @return 用户订单集合信息
     */
    public List<Dingdan> selectAllMyDingDanByUserId(String userId) {
        return dingdanMapper.selectAllMyDingDanByUserId(userId);
    }

}

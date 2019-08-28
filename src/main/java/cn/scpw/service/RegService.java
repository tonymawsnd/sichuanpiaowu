package cn.scpw.service;

import cn.scpw.pojo.User;
import cn.scpw.pojo.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Author XHH
 * @Date 2019/8/28 10:01
 * 这是注册的Service，其中有isReg方法实现注册功能
 * 注册功能，先提取出前段传递的username，并验证数据库中是否存在该username，
 * 如果存在，就返回500，注册失败，原因为用户名重复，或其他原因
 * 如果不存在，就给user生成一个id，并将user对象插入到数据库，并返回200，注册成功
 */
@Service
public class RegService {
    @Autowired
    UserMapper userMapper;

    Map<String, String> map;

    @Transactional(rollbackFor = Exception.class)
    public Map<String, String> isReg(User user){
        map = new HashMap<>();
        if (userMapper.selectByUsername(user.getUsername()) == null){

            user.setId(UUID.randomUUID().toString().replace("-",""));
            userMapper.insertByUser(user);
            map.put("code", "200");
            map.put("msg", "注册成功");
            return map;

        }else {
            map.put("code", "500");
            map.put("msg", "用户名重复，或其他原因，注册失败");
            return map;

        }

    }

}

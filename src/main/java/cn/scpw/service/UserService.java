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
 * @Author LJR
 * @Date 2019/8/27 12:17
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    /**
     * 查询是否存在账号和密码
     * @param user  user对象
     * @return  返回是否成功的Json
     */
    @Transactional(rollbackFor = Exception.class)
    public Map<String, String> isLogin(User user){
        Map<String, String> map = new HashMap<>();
        //验证数据库是否存在
        if (userMapper.selectByUsernameAndPassword(user) != null){

            map.put("code", "200");
            map.put("msg", "登陆成功");
            return map;

        }else {

            map.put("code", "500");
            map.put("msg", "登陆失败");
            return map;

        }

    }

    /**
     * 注册功能，先提取出前段传递的username，并验证数据库中是否存在该username，
     * 如果存在，就返回500，注册失败，原因为用户名重复，或其他原因
     * 如果不存在，就给user生成一个id，并将user对象插入到数据库，并返回200，注册成功
     * @param user  user对象
     * @return  返回是否成功的Json
     */
    @Transactional(rollbackFor = Exception.class)
    public Map<String, String> isReg(User user){
        Map<String, String> map = new HashMap<>();
        //验证数据库是否存在
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
package cn.scpw.service;

import cn.scpw.pojo.User;
import cn.scpw.pojo.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author LJR
 * @Date 2019/8/27 12:17
 */
@Service
public class LoginService {
    @Autowired
    UserMapper userMapper;

    Map<String, String> map;

    /**
     * 查询是否存在账号和密码
     * @param user  user对象
     * @return  返回是否成功的Json
     */
    @Transactional(rollbackFor = Exception.class)
    public Map<String, String> isLogin(User user){
        map = new HashMap<>();
        //验证数据库是否存在
        if (userMapper.selectByUsernameAndPassword(user) != null){

            map.put("code", "200");
            map.put("msg", "登陆成功");
            map.put("userId",userMapper.selectByUsernameAndPassword(user).getId());
            return map;

        }else {

            map.put("code", "500");
            map.put("msg", "登陆失败");
            return map;

        }

    }

}

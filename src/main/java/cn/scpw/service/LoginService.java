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

    @Transactional(rollbackFor = Exception.class)
    public Map<String, String> isLogin(User user){
        map = new HashMap<>();
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

}

package cn.scpw.service;

import cn.scpw.pojo.User;
import cn.scpw.pojo.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: sky
 * Date: 2019/8/28
 * Description:
 */
@Service
public class XiuGaiMiMaService {
    @Autowired
    UserMapper userMapper;

    Map<String, String> map;

    @Transactional(rollbackFor = Exception.class)
    public Map<String, String> xiuGaiMiMa(Map<String, String> map1){
        map = new HashMap<>();
        if (map1.get("oldpassword").equals(map1.get("newpassword"))){
            map.put("code", "500");
            map.put("msg", "修改失败");
            return map;
        }
        else {
            userMapper.updateByUserPassword(map1.get("newpassword"), map1.get("userId"));
            map.put("code", "200");
            map.put("msg", "修改成功");
            return map;
        }
    }
}

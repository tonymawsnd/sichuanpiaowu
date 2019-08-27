package cn.scpw.service;

import cn.scpw.jsonbean.CodeBean;
import cn.scpw.pojo.User;
import cn.scpw.pojo.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author LJR
 * @Date 2019/8/27 12:17
 */
@Service
public class LoginService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    CodeBean codeBean;

    @Transactional(rollbackFor = Exception.class)
    public CodeBean isLogin(User user){
        if (userMapper.selectByUsernameAndPassword(user) != null){

            codeBean.setCode("200");
            codeBean.setMsg("登陆成功");
            return codeBean;

        }else {

            codeBean.setCode("500");
            codeBean.setMsg("登陆失败");
            return codeBean;
        }

    }

}

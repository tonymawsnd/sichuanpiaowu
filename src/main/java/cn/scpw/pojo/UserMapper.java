package cn.scpw.pojo;

import java.util.Map;

public interface UserMapper {
    //通过用户名和密码来查询
    User selectByUsernameAndPassword(User user);
    //用户修改密码
    void updateByUserPassword(String password, String userId);
}
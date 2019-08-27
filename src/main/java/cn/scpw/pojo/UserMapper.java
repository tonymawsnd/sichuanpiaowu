package cn.scpw.pojo;


public interface UserMapper {
    //通过用户名和密码来查询
    User selectByUsernameAndPassword(User user);

}
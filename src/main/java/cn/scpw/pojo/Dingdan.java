package cn.scpw.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Author: lyh
 * Version: V1.0
 * Package: ${PACKAGE_NAME}
 * Date:  2019/8/28
 * Description:
 */
public class Dingdan implements Serializable {

    @Override
    public String toString() {
        return "Dingdan{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", shenfenzheng='" + shenfenzheng + '\'' +
                ", userphone='" + userphone + '\'' +
                ", checiid='" + checiid + '\'' +
                ", userid='" + userid + '\'' +
                ", beizhu='" + beizhu + '\'' +
                ", checi=" + checi +
                '}';
    }

    /**
    * 订单id
    */
    private String id;

    /**
    * 用户姓名
    */
    private String name;

    /**
    * 用户身份证
    */
    private String shenfenzheng;

    /**
    * 用户手机
    */
    private String userphone;

    /**
    * 用户下单的车次ID
    */
    private String checiid;

    /**
    * 用户ID
    */
    private String userid;

    /**
    * 用户的备注
    */
    private String beizhu;

    private Checi checi;

    public Checi getCheci() {
        return checi;
    }

    public void setCheci(Checi checi) {
        this.checi = checi;
    }

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShenfenzheng() {
        return shenfenzheng;
    }

    public void setShenfenzheng(String shenfenzheng) {
        this.shenfenzheng = shenfenzheng;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getCheciid() {
        return checiid;
    }

    public void setCheciid(String checiid) {
        this.checiid = checiid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }
}
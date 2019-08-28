package cn.scpw.pojo;

import java.io.Serializable;

/**
 * Author: lyh
 * Version: V1.0
 * Package: ${PACKAGE_NAME}
 * Date:  2019/8/28
 * Description:
 */
public class Checi implements Serializable {
    /**
    * ID
    */
    private String id;

    /**
    * 车次
    */
    private String checi;

    /**
    * 车次类型
    */
    private String leixing;

    /**
    * 始发站
    */
    private String fazhan;

    /**
    * 到站
    */
    private String daozhan;

    /**
    * 发时
    */
    private String fashi;

    /**
    * 到达时
    */
    private String daoshi;

    /**
    * 价格
    */
    private Long jiage;

    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCheci() {
        return checi;
    }

    public void setCheci(String checi) {
        this.checi = checi;
    }

    public String getLeixing() {
        return leixing;
    }

    public void setLeixing(String leixing) {
        this.leixing = leixing;
    }

    public String getFazhan() {
        return fazhan;
    }

    public void setFazhan(String fazhan) {
        this.fazhan = fazhan;
    }

    public String getDaozhan() {
        return daozhan;
    }

    public void setDaozhan(String daozhan) {
        this.daozhan = daozhan;
    }

    public String getFashi() {
        return fashi;
    }

    public void setFashi(String fashi) {
        this.fashi = fashi;
    }

    public String getDaoshi() {
        return daoshi;
    }

    public void setDaoshi(String daoshi) {
        this.daoshi = daoshi;
    }

    public Long getJiage() {
        return jiage;
    }

    public void setJiage(Long jiage) {
        this.jiage = jiage;
    }

    @Override
    public String toString() {
        return "Checi{" +
                "id='" + id + '\'' +
                ", checi='" + checi + '\'' +
                ", leixing='" + leixing + '\'' +
                ", fazhan='" + fazhan + '\'' +
                ", daozhan='" + daozhan + '\'' +
                ", fashi='" + fashi + '\'' +
                ", daoshi='" + daoshi + '\'' +
                ", jiage=" + jiage +
                ", userID='" + userID + '\'' +
                '}';
    }
}
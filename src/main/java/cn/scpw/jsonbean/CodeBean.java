package cn.scpw.jsonbean;

import org.springframework.stereotype.Component;

/**
 * @Author LJR
 * @Date 2019/8/27 13:07
 */
@Component
public class CodeBean {

    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

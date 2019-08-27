package cn.scpw.util;

import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author LJR
 * @Date 2019/8/22 20:06
 */

public class ControllerAdvice {

    @ExceptionHandler(Throwable.class)
    public String chick(){
        System.out.println("报错了,铁憨憨");
        System.out.println("报错了,铁憨憨22222222222");

        return "index";

    }


}

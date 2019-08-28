package cn.scpw.service;

import cn.scpw.util.MyHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author LJR
 * @Date 2019/8/28 10:35
 */
@Service
public class ChepiaoService {

    @Autowired
    MyHttpClient myHttpClient;

    /**
     * 查询车票
     * @param map   controller传来的map
     * @return      返回JSON
     */
    public List<String> chePiaoQuery(Map map){
        //接入车票100的API
       String s = myHttpClient.httpClientDoPost("http://www.chepiao100.com/api/yupiao", map);
        List<String> list = new ArrayList<String>();
        list.add(s);
        return list;
    }

}

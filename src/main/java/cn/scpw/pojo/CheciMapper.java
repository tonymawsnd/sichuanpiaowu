package cn.scpw.pojo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * Author: lyh
 * Version: V1.0
 * Package: ${PACKAGE_NAME}
 * Date:  2019/8/28
 * Description:
 */
public interface CheciMapper {
    /**
     *  插入车次信息
     * @param id
     * @param checi
     * @param leixing
     * @param fazhan
     * @param daozhan
     * @param fashi
     * @param daoshi
     * @param jiage
     */
    void insert(String id, String checi, String leixing, String fazhan,
                String daozhan, String fashi, String daoshi, Long jiage);

}
package cn.sx.code.factory.case1.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.HashMap;

/**
 * 获奖信息实体类
 **/
@Data
@Accessors(chain = true)
public class AwardInfo {

    /**
     * 用户id
     */
    private String uid;

    /**
     * 奖品类型
     */
    private Integer type;

    /**
     * 奖品编号
     */
    private String id;

    /**
     * 额外信息
     */
    private HashMap<String, String> ext;
}

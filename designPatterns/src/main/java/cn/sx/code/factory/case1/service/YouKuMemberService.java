package cn.sx.code.factory.case1.service;

import cn.sx.code.factory.case1.entity.YouKuMember;
import lombok.extern.slf4j.Slf4j;

/**
 * 优酷会员服务
 **/
@Slf4j
public class YouKuMemberService {

    /**
     * 开放优酷会员
     * @param mobile 手机号
     * @param id 奖品编号
     */
    public void open(String mobile, String id){
        new YouKuMember();// 省略具体业务

    }
}

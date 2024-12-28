package cn.sx.code.factory.easy.case2.impl;

import cn.sx.code.factory.easy.case1.common.Result;
import cn.sx.code.factory.easy.case1.entity.AwardInfo;
import cn.sx.code.factory.easy.case1.entity.DiscountInfo;
import cn.sx.code.factory.easy.case1.entity.YouKuMember;
import cn.sx.code.factory.easy.case2.AwardSenderI;

/**
 * @author 谢骏
 * @date 2024/12/28 17:33
 **/
public class YouKuMemberSenderImpl implements AwardSenderI {
    @Override
    public Result send(AwardInfo awardInfo) {
        new YouKuMember();// 省略具体业务
        return new Result().setCode("0000").setMsg("发放优酷会员成功!");
    }
}

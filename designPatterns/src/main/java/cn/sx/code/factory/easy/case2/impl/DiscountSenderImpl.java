package cn.sx.code.factory.easy.case2.impl;

import cn.sx.code.factory.easy.case1.common.Result;
import cn.sx.code.factory.easy.case1.entity.AwardInfo;
import cn.sx.code.factory.easy.case1.entity.DiscountInfo;
import cn.sx.code.factory.easy.case2.AwardSenderI;

/**
 *
 **/
public class DiscountSenderImpl implements AwardSenderI {

    @Override
    public Result send(AwardInfo awardInfo) {
        new DiscountInfo();      //..... 省略具体业务
        return new Result().setCode("0000").setMsg("发放打折券成功!");
    }
}

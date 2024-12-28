package cn.sx.code.factory.easy.case2.impl;

import cn.sx.code.factory.easy.case1.common.Result;
import cn.sx.code.factory.easy.case1.entity.AwardInfo;
import cn.sx.code.factory.easy.case1.entity.DiscountInfo;
import cn.sx.code.factory.easy.case1.entity.SmallGiftInfo;
import cn.sx.code.factory.easy.case2.AwardSenderI;

/**
 *
 **/
public class SmallGiftSenderImpl implements AwardSenderI {

    @Override
    public Result send(AwardInfo awardInfo) {
        new SmallGiftInfo();      //..... 省略具体业务
        return new Result().setCode("0000").setMsg("发放小礼品成功!");
    }

}

package cn.sx.code.factory.easy.case2;

import cn.sx.code.factory.easy.case1.entity.AwardInfo;
import cn.sx.code.factory.easy.case2.impl.DiscountSenderImpl;
import cn.sx.code.factory.easy.case2.impl.SmallGiftSenderImpl;
import cn.sx.code.factory.easy.case2.impl.YouKuMemberSenderImpl;

/**
 * 奖品发放器工厂
 **/
public interface AwardSenderFactory {


    static AwardSenderI create(AwardInfo awardInfo) {
        if (awardInfo.getType() == 1) {
            return new DiscountSenderImpl();
        } else if (awardInfo.getType() == 2) {
            return new YouKuMemberSenderImpl();
        } else if (awardInfo.getType() == 3) {
            return new SmallGiftSenderImpl();
        }
        return null;
    }
}

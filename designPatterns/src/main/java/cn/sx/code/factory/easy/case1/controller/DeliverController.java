package cn.sx.code.factory.easy.case1.controller;

import cn.sx.code.factory.easy.case1.entity.AwardInfo;
import cn.sx.code.factory.easy.case1.entity.SmallGiftInfo;
import cn.sx.code.factory.easy.case1.service.DiscountService;
import cn.sx.code.factory.easy.case1.service.SmallGiftService;
import cn.sx.code.factory.easy.case1.service.YouKuMemberService;

/**
 * 客户端
 **/
public class DeliverController {

    /**
     * 按照类型的不同发放奖品
     * 奖品类型 : 1 打折券, 2优酷会员, 3 小礼品
     *
     * @param awardInfo 商品信息
     */
    public void awardToUser(AwardInfo awardInfo) {
        // 打折券
        if (awardInfo.getType() == 1) {
            DiscountService service = new DiscountService();
            service.send(awardInfo.getUid(), awardInfo.getId());
        }
        // 优酷
        else if (awardInfo.getType() == 2) {
            YouKuMemberService service = new YouKuMemberService();
            service.open(awardInfo.getExt().get("mobile"), awardInfo.getId());
        }
        // 小礼品
        else if (awardInfo.getType() == 3) {
            SmallGiftService service = new SmallGiftService();
            service.send(new SmallGiftInfo());
        }
    }

}

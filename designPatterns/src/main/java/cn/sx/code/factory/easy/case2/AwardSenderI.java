package cn.sx.code.factory.easy.case2;

import cn.sx.code.factory.easy.case1.common.Result;
import cn.sx.code.factory.easy.case1.entity.AwardInfo;

/**
 * 奖品发放接口
 **/
public interface AwardSenderI {

    /**
     * 发放奖品
     * @param awardInfo 商品信息
     * @return
     */
    Result send(AwardInfo awardInfo);
}

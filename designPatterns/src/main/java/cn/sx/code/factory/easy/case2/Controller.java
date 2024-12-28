package cn.sx.code.factory.easy.case2;

import cn.sx.code.factory.easy.case1.entity.AwardInfo;

/**
 * @author 谢骏
 * @date 2024/12/28 17:39
 **/
public class Controller {

    public void awardToUser(AwardInfo awardInfo) {
        // 获取奖品发送器
        AwardSenderI sender = AwardSenderFactory.create(awardInfo);
        if (sender == null) {
            return;
        }
        // 发送奖品
        sender.send(awardInfo);
    }
}

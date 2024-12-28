package cn.sx.code.factory.easy.case1.service;

import cn.sx.code.factory.easy.case1.common.Result;
import cn.sx.code.factory.easy.case1.entity.DiscountInfo;

/**
 * 打折券服务
 **/
public class DiscountService {


    /**
     * 方法打折券
     *
     * @param uid 用户编号
     * @param id  奖品编号
     * @return
     */
    public Result send(String uid, String id) {
        new DiscountInfo();      //..... 省略具体业务
        return new Result().setCode("0000").setMsg("发放打折券成功!");
    }
}

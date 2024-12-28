package cn.sx.code.factory.case1.common;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author 谢骏
 * @date 2024/12/28 16:07
 **/
@Data
@Accessors(chain = true)
public class Result {

    private String code;

    private String msg;

    private Object data;
}

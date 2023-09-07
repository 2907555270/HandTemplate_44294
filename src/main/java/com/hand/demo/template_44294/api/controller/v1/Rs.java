package com.hand.demo.template_44294.api.controller.v1;

import lombok.Data;
import org.springframework.http.HttpStatus;

import javax.sound.sampled.AudioFormat;

/**
 * 前后端交互协议
 *
 * @author EMP_44294 2023/09/07 11:28
 */
@Data
public class Rs {
    private Integer code;
    private String msg;
    private Object data;

    /**
     * 成功的响应
     *
     * @param msg  反馈消息
     * @param data 反馈的数据
     * @return 格式化返回结果
     */
    public static Rs success(String msg, Object data) {
        Rs rs = new Rs();
        rs.setCode(HttpStatus.OK.value());
        rs.setMsg(msg);
        rs.setData(data);
        return rs;
    }

    /**
     * 发生错误时的响应
     *
     * @param msg 反馈错误消息
     * @return 格式化返回结果
     */
    public static Rs error(String msg) {
        Rs rs = new Rs();
        rs.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        rs.setMsg(msg);
        return rs;
    }

}

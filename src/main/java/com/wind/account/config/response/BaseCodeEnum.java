package com.wind.account.config.response;

import lombok.Getter;

/**
 * @author hsc
 * @date 2022/4/26 17:43
 */
@Getter
public enum BaseCodeEnum {

    /**
     * 基本code
     */
    SUCCESS(200, "请求成功"),
    FAIL(500, "请求失败");

    private final Integer code;

    private final String msg;

    BaseCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

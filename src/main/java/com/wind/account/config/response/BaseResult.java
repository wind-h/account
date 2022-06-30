package com.wind.account.config.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * @author hsc
 * @date 2022/4/26 17:24
 */
@Data
@NoArgsConstructor
public class BaseResult implements Serializable {

    private static final long serialVersionUID = 1L;

    protected boolean success;

    protected Integer code;

    protected String msg;

    protected Long timestamp;

    public BaseResult(boolean success, Integer code, String msg) {
        this(success, code, msg, Timestamp.valueOf(LocalDateTime.now()).getTime());
    }

    public BaseResult(boolean success, Integer code, String msg, Long timestamp) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.timestamp = timestamp;
    }
}

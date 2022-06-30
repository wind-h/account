package com.wind.account.config.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author hsc
 * @date 2022/4/26 17:25
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class  Result<T> extends BaseResult implements Serializable {

    private static final long serialVersionUID = 1L;

    T data;

    public Result(boolean success, Integer code, String msg, T data) {
        super(success, code, msg);
        this.data = data;
    }
}

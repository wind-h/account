package com.wind.account.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author hsc
 */
@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends Base {
    /**
     * id
     */
    private Long id;

    /**
     * 用户名称
     */
    private String userName;
}

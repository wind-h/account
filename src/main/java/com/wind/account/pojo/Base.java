package com.wind.account.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author hsc
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Base {
    /**
     * 创建者
     */
    private Long creator;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 修改者
     */
    private Long updator;
    /**
     * 修改时间
     */
    private LocalDateTime updateTime;
    /**
     * 是否删除 0 未删除 1 已删除
     */
    private Integer deleteStatus;
}

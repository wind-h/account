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
public class Category extends Base {
    /**
     * id
     */
    private Long id;

    /**
     * 父id
     */
    private Long parentId;
    /**
     * 分类名称
     */
    private String categoryName;
}

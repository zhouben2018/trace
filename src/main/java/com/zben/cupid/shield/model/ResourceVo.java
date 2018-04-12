package com.zben.cupid.shield.model;

import lombok.Data;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午9:30 2018/4/12
 */
@Data
public class ResourceVo extends BaseVo {
    private static final long serialVersionUID = -6608465614161558403L;

    /**
     * primary key
     */
    private String id;
    /**
     * 资源名称
     */
    private String name;
    /**
     * 资源code
     */
    private String code;
    /**
     * 资源类型
     */
    private Integer type;
    /**
     * 父资源id
     */
    private String parentId;
    /**
     * 资源图标url
     */
    private String iconUrl;
    /**
     * 链接
     */
    private String link;
    /**
     * 排序
     */
    private Integer sort = -1;

    /**
     * 是否为保留资源,保留资源车商不可见
     */
    private Integer reserved = 1;

    /**
     * 描述文字
     */
    private String description;
}

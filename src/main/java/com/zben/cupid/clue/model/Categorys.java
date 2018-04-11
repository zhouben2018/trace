package com.zben.cupid.clue.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午10:49 2018/4/10
 */
@Data
public class Categorys implements Serializable {

    private static final long serialVersionUID = 4039895001322232252L;

    private String id;

    //编码名
    private String code;

    //中文名
    private String name;

    //父级编码名
    private String parentCode;

    //父类所属的app业务方
    private Integer appId;

    //模式 c2c c2b b2c b2b
    private String mode;

    //状态 1：一级类别  2：二级类别  3：appId类别
    private Integer status;

    //排序号
    private Integer sortId;

}


































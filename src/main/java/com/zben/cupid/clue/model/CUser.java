package com.zben.cupid.clue.model;

import com.zben.cupid.shield.model.BaseVo;
import lombok.Data;

import java.util.Date;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午4:04 2018/4/12
 */
@Data
public class CUser extends BaseVo {

    private static final long serialVersionUID = 8759745296717896582L;

    private String id;

    /**
     * 手机
     */
    private String phone;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 微信
     */
    private String weixin;

    /**
     * 自增ID
     */
    private Integer iid;

    /**
     * 客户等级
     */
    private String level;

    /**
     * 来源
     */
    private String source;

    private String province;

    private String city;

    private String avatar;

    private String saler;

    private String qq;

    private String identityCard;

    private String cellphone1;

    private Date birthday;

    private String username;

    private String sex;
}

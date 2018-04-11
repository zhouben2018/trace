package com.zben.cupid.shield.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午3:52 2018/4/11
 */
@Data
@ApiModel
public class UserVo extends BaseVo {
    private static final long serialVersionUID = -4277077027087212191L;

    private String id;

    @ApiModelProperty("用户IID")
    private Long iid;

    @ApiModelProperty("账号")
    private String account;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("电话")
    private String phone;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("真实姓名")
    private String nickname;

    @ApiModelProperty("qq")
    private String qq;

    @ApiModelProperty("性别")
    private Integer sex = -1;

    @ApiModelProperty("用户头像")
    private String headImgUrl;

    @ApiModelProperty("店铺")
    private String shopCode;

    @ApiModelProperty("店铺名称")
    private String shopName;

    @ApiModelProperty("车牛token")
    private String cheNiuToken;

    @ApiModelProperty("上级ID")
    private String parentId;

    @ApiModelProperty("状态")
    private Integer status;

    @ApiModelProperty("上次登录IP")
    private String lastLoginIp;

    @ApiModelProperty("上次更新密码时间")
    private Date updatePwdTime;

    @ApiModelProperty("部门ID")
    private Long departmentId;

    @ApiModelProperty("部门名称")
    private String departName;

    @ApiModelProperty("父部门名称")
    private String departParentName;

    @ApiModelProperty("职位ID")
    private Long positionId;

    @ApiModelProperty("职位名称")
    private String positionName;

    @ApiModelProperty("微信")
    private String weixin;

    @ApiModelProperty("用户类型 大风车-souche 车牛-cheniu")
    private String userType;

    private String soucheId;

    private Timestamp resignTime;

}






































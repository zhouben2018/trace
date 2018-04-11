package com.zben.cupid.shield.dto;

import com.zben.cupid.shield.model.UserVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午6:01 2018/4/11
 */
@Data
public class UserDto implements Serializable {
    private static final long serialVersionUID = -1409187227227151120L;

    private UserVo user;
    @ApiModelProperty("如果要修改密码, 必须传这个pwdAgain")
    private String pwdAgain;        //如果要修改密码, 必须传这个pwdAgain
    private String shopName;
    @ApiModelProperty("账号是否被锁定")
    private boolean locked;         //账号是否被锁定
    @ApiModelProperty("是否有验证码")
    private boolean hasPhoneCode;   //是否有验证码
    @ApiModelProperty("部门名称")
    private String departmentName;  //部门名称
    @ApiModelProperty("职位名称")
    private String positionName;    //职位名称
    @ApiModelProperty("上级名称")
    private String parentName;      //上级名称

    private List<String> roleIds;

    private List<String> roleCodes;

    private List<String> roleNames;
}

package com.zben.cupid.shield.api;

import com.zben.cupid.shield.model.UserVo;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午3:48 2018/4/11
 */
public interface UserService {

    /**
     * 查询用户信息
     * @param userId
     * @return
     */
    UserVo get(String userId);
}

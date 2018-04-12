package com.zben.cupid.shield.api;

import com.zben.cupid.shield.model.ResourceVo;

import java.util.List;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午9:28 2018/4/12
 */
public interface ResourceService {

    /**
     * 根据用户id查询资源列表
     * @param userId
     * @return
     */
    List<ResourceVo> getResourceByUserId(String userId);
}

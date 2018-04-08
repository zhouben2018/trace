package com.zben.cupid.trace.api;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午9:46 2018/4/8
 */
public interface ClueTraceService {

    void addClueTrace(String userId, String storeId, String operator, String key, Object value);
}

package com.zben.cupid.clue.api;

import com.zben.cupid.clue.model.Categorys;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午10:56 2018/4/10
 */
public interface SourceTextService {

    /**
     * 查询当前类别
     */
    Categorys getByCode(String code);
}

package com.zben.cupid.track.model;

import lombok.Data;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午10:01 2018/4/13
 */
@Data
public class SystemTrack extends Track {
    private static final long serialVersionUID = 3603155916313597415L;

    /**
     * 轨迹内容
     */
    private String message;

    /**
     * 触发事件
     */
    private String event;

    private String operator;
}

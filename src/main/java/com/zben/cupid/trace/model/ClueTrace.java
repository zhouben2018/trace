package com.zben.cupid.trace.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午10:05 2018/4/8
 */
@Data
@Builder
public class ClueTrace {

    private String id;

    private String userId;

    private String storeId;

    private String operator;

    private String key;

    private Object value;

    private Date dateCreate;
}

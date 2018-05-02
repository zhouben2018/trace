package com.zben.cupid.track.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午10:02 2018/4/13
 */
@Data
public class Track implements Serializable {
    private static final long serialVersionUID = 7040463622148336562L;

    private String id;

    private String userId;

    private String shopCode;

    private int type;

    private String info;

    private String operatorId;

    private Date dateCreate;

    private Date dateUpdate;

    private Date dateDelete;
}

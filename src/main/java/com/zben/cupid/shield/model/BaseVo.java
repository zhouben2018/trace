package com.zben.cupid.shield.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午3:53 2018/4/11
 */
@Data
@NoArgsConstructor
public abstract class BaseVo implements Serializable {
    private static final long serialVersionUID = -6728391684154888796L;

    protected Timestamp dateCreate;
    protected Timestamp dateUpdate;
    protected Timestamp dateDelete;
}

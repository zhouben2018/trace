package com.zben.cupid.clue.model;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午3:33 2018/4/12
 */
public class AppPrivilege {
    public enum AppPrivilegeEnum {

        SHIELD_SALES("SHIELD-SALES", "销售员"),
        ;

        private String code;
        private String desc;

        private AppPrivilegeEnum(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public String getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }

    }
}
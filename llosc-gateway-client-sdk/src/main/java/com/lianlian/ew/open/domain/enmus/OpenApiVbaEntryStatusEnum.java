package com.lianlian.ew.open.domain.enmus;

/**
 * vba加款状态
 */
public enum OpenApiVbaEntryStatusEnum {


    SUCCESS("SUCCESS", "成功");

    private String code;
    private String desc;

    OpenApiVbaEntryStatusEnum(String _code, String _desc) {
        this.code = _code;
        this.desc = _desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static OpenApiVbaEntryStatusEnum getByCode(String _code) {
        for (OpenApiVbaEntryStatusEnum locationEnum : OpenApiVbaEntryStatusEnum.values()) {
            if (locationEnum.getCode().equals(_code)) {
                return locationEnum;
            }
        }
        return null;
    }

}

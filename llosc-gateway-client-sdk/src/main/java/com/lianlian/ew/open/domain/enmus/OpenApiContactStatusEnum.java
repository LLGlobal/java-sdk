package com.lianlian.ew.open.domain.enmus;

public enum OpenApiContactStatusEnum {


    REJECTED("REJECTED", "拒绝"),
    ACCEPTED("ACCEPTED", "接受"),
    PROCESSING("PROCESSING", "处理中");

    private String code;
    private String desc;

    OpenApiContactStatusEnum(String _code, String _desc) {
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

    public static OpenApiContactStatusEnum getByCode(String _code) {
        for (OpenApiContactStatusEnum locationEnum : OpenApiContactStatusEnum.values()) {
            if (locationEnum.getCode().equals(_code)) {
                return locationEnum;
            }
        }
        return null;
    }
}

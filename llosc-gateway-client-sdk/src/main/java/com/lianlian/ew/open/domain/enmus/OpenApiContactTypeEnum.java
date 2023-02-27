package com.lianlian.ew.open.domain.enmus;

/**
 * 开放平台联系人类型<br></>
 *
 * @author xujs002
 */
public enum OpenApiContactTypeEnum {

    INDIVIDUAL("INDIVIDUAL", "个人"),
    CORPORATE("CORPORATE", "企业");

    private String code;
    private String desc;

    OpenApiContactTypeEnum(String _code, String _desc) {
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

    public static OpenApiContactTypeEnum getByCode(String _code) {
        for (OpenApiContactTypeEnum locationEnum : OpenApiContactTypeEnum.values()) {
            if (locationEnum.getCode().equals(_code)) {
                return locationEnum;
            }
        }
        return null;
    }


}

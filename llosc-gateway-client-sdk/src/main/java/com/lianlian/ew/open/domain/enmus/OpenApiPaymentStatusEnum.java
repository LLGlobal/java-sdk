package com.lianlian.ew.open.domain.enmus;

public enum OpenApiPaymentStatusEnum {

    INIT("INIT", "初始化"),
    PROCESSING("PROCESSING", "处理中"),
    FAILED("FAILED", "失败"),
    CANCELLED("CANCELLED", "已取消"),
    REFUNDING("REFUNDING", "退款中"),
    REFUNDED("REFUNDED", "已退款"),
    COMPLETED("COMPLETED", "已完成");

    private String code;
    private String desc;

    OpenApiPaymentStatusEnum(String _code, String _desc) {
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

    public static OpenApiPaymentStatusEnum getByCode(String _code) {
        for (OpenApiPaymentStatusEnum locationEnum : OpenApiPaymentStatusEnum.values()) {
            if (locationEnum.getCode().equals(_code)) {
                return locationEnum;
            }
        }
        return null;
    }
}

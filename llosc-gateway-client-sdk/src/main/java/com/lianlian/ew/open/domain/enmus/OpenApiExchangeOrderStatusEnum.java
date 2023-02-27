package com.lianlian.ew.open.domain.enmus;

/**
 * OpenAPI汇兑订单状态
 * 
 * @author xujs002
 *
 */
public enum OpenApiExchangeOrderStatusEnum {	
	
	SETTLED("SETTLED", "已汇兑"),
	CANCELLED("CANCELLED", "已取消"),
	WAITING_SETTLEMENT("WAITING_SETTLEMENT", "待汇兑");
	
	private String code;
	private String desc;

	OpenApiExchangeOrderStatusEnum(String _code, String _desc) {
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

	public static OpenApiExchangeOrderStatusEnum getByCode(String _code) {
		for (OpenApiExchangeOrderStatusEnum locationEnum : OpenApiExchangeOrderStatusEnum.values()) {
			if (locationEnum.getCode().equals(_code)) {
				return locationEnum;
			}
		}
		return null;
	}
}

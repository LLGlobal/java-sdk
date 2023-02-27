package com.lianlian.ew.open.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 汇兑订单详情
 * 
 * @doc https://developer.lianlianglobal.com/docs/llg-openapi/c2NoOjQ0NzQwNjQ0-conversion-response
 * 
 * @author xujs002
 *
 */
@Getter
@Setter
@ToString
public class ConversionDetailRes implements Serializable {

	private static final long serialVersionUID = 5590389814574087556L;

	/** user ID */
	private String userId;

	/** conversion ID */
	private String id;
	
	/** request ID */
	private String requestId;
	
	/** 卖出币种 */
	private String sellCurrency;
	
	/** 卖出金额 */
	private String sellAmount;
	
	/** 买入币种 */
	private String buyCurrency;
	
	/** 买入金额 */
	private String buyAmount;
	
	/** 汇率ID */
	private String rateId;
	
	/** 汇率 */
	private String rate;
	
	/** 状态 */
	private String status;
	
	/** 创建时间 */
	private Date createTime;
	
	/** 基础币种 */
	private String baseCurrency;


}

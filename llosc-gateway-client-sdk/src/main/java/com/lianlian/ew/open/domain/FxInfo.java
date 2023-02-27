/**
 * 
 */
package com.lianlian.ew.open.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 付款单汇兑信息
 * 
 * @author xujs002
 *
 */
@Getter
@Setter
@ToString
public class FxInfo implements Serializable {

	private static final long serialVersionUID = -1953361009989771272L;

	private String sellCurrency;
	private String sellAmount;
	private String buyCurrency;
	private String buyAmount;
	private String rateId;
	private String rate;
	private String baseCurrency;

}

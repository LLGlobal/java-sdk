/**
 * 
 */
package com.lianlian.ew.open.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 手续费
 * 
 * @author xujs002
 *
 */
@Getter
@Setter
@ToString
public class PaymentFee implements Serializable {

	private static final long serialVersionUID = -8212563225077721617L;

	public PaymentFee(String currency, String amount) {
		this.currency = currency;
		this.amount = amount;
	}

	/** 付款人 */
	private String paidBy = "PAYER";

	/** 币种 */
	private String currency;

	/** 金额 */
	private String amount;

}

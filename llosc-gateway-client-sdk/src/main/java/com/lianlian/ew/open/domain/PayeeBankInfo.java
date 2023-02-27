/**
 * 
 */
package com.lianlian.ew.open.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * 联系人银行信息
 * 
 * @doc https://developer.lianlianglobal.com/docs/llg-openapi/c2NoOjQ0NzMwNTEx-payee-response
 * 
 * @author xujs002
 *
 */
@Getter
@Setter
@ToString
public class PayeeBankInfo implements Serializable {

	private static final long serialVersionUID = 6641437815765036600L;
	
	/** 银行国家编码 */
	private String bankCountryCode;
	/** 持有人名称 */
	private String holderName;
	
	/** 持有人类型:CORPORATE、INDIVIDUAL */
	private String holderType;
	
	/** 账户币种 */
	private String accountCurrency;
	
	/** 账号 */
	private String accountNumber;
	
	/** 银行名称 */
	private String bankName;
	
	/** 银行地址 */
	private String bankAddress;
	
	
	private String swiftCode;
	
	private String iban;
	
	/** 路由信息 */
	private List<BankInfoRoutingInfo> routingInfo;

}

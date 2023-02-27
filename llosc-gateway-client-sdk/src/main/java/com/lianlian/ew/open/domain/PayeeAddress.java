/**
 * 
 */
package com.lianlian.ew.open.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 联系人地址
 * 
 * @doc https://developer.lianlianglobal.com/docs/llg-openapi/c2NoOjQ0NzMwNTEx-payee-response
 * 
 * @author xujs002
 *
 */
@Getter
@Setter
@ToString
public class PayeeAddress implements Serializable {

	private static final long serialVersionUID = 3536664159802937174L;
	
	/** 国家代码 */
	private String countryCode;
	
	/** 城市 */
	private String city;
	
	/** 州 */
	private String state;
	
	/** 地址第一行 */
	private String line1;
	
	/** 地址第二行 */
	private String line2;
	
	/** 邮编 */
	private String postcode;
}

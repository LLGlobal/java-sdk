/**
 * 
 */
package com.lianlian.ew.open.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 联系人基础信息
 * 
 * @author xujs002
 *
 */
@Getter
@Setter
@ToString
public class PayeeBaseInfo implements Serializable {

	
	private static final long serialVersionUID = 546680015623943319L;
	
	// 企业类型
	private String corporateName;
	private String corporateRegistrationNumber;
	private String corporatePhoneNumber;
	private String corporatePhoneAreaCode;
	private String corporateContactName;
	
	
	
	
	//个人类型
	private String firstName;
	private String middleName;
	private String lastName;
	private String idType;
	private String idNumber;
	
	
	/** 邮箱 */
	private String email;
	
	/** 国家代码 */
	private String countryCode;
	
	/** 电话号码 */
	private String phoneNumber;

	/** 电话区号 */
	private String phoneAreaCode;

	/** 昵称 */
	private String nickname;

}

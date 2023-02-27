/**
 *
 */
package com.lianlian.ew.open.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 银行路由信息
 *
 * @doc https://developer.lianlianglobal.com/docs/llg-openapi/c2NoOjQ0NzMwNTEx-payee-response
 * @author xujs002
 *
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class BankInfoRoutingInfo implements Serializable {

    private static final long serialVersionUID = 5337788378540691859L;

    /** 路由类型 */
    private String bankRoutingType;

    /** 路由号 */
    private String bankRoutingNumber;


    public BankInfoRoutingInfo() {
    }
}

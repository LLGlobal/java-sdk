/**
 *
 */
package com.lianlian.ew.open.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Balance Detail
 *
 * @author xujs002
 *
 */
@Getter
@Setter
@ToString
public class BalanceDetailRes implements Serializable {

    private static final long serialVersionUID = 296286446122443946L;

    /** Unique identifier of the LianLian Global account */
    private String accountId;

    /** Three-letter ISO 4217 currency code. */
    private String currency;

    /** Available amount : Yuan */
    private String availableAmount;

    /**
     * auto recharge setting
     */
    private BalanceRechargeSetting autoRechargeSetting;


}

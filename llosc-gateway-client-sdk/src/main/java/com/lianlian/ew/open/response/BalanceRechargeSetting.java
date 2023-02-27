package com.lianlian.ew.open.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 余额详情
 *
 * @author xujs002
 */
@Getter
@Setter
@ToString
public class BalanceRechargeSetting implements Serializable {


    private static final long serialVersionUID = 5628235636607743325L;

    private String balanceMinimumAmount;
    private String autoRechargeAmount;


}

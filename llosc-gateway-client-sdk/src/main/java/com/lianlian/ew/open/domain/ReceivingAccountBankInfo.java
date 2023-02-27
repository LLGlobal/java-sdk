package com.lianlian.ew.open.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * vba银行信息
 *
 * @author xujs002
 */
@Getter
@Setter
@ToString
public class ReceivingAccountBankInfo implements Serializable {

    private static final long serialVersionUID = -6823855878566448033L;

    private String aba;
    private String accountType;
    private String accountHoldersName;
    private String wireaba;
    private String swiftCode;
    private String bankName;
    private String bankCountryRegionName;
    private String bankAddress;
    private String routingNumber;
    private String bankId;
    private Date createTime;
    private String bankCountryRegion;
    private String bankAccountNumber;
    private String channelCode;


}

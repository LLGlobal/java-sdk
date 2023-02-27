package com.lianlian.ew.open.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 绑定店铺信息
 *
 * @author xujs002
 */
@Getter
@Setter
@ToString
public class ReceivingAccountShopInfo implements Serializable {

    private static final long serialVersionUID = 5142011976449499036L;

    private String fundSourceType;
    private String marketplaceEntityId;
    private String memo;
    private String bankStatementAttachPath;
    private String userName;
    private String shopUrl;
    private String marketplaceEntityName;
    private String userId;
    private String balanceAccountNo;
    private String sellerId;
    private String failureReason;
    private String businessCategory;
    private String shopId;
    private String vbaId;//FIXME:VBA
    private String status;//approved、submitted
    private String bindingMethod;


}

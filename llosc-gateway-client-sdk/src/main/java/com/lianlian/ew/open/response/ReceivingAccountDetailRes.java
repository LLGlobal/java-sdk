package com.lianlian.ew.open.response;

import com.lianlian.ew.open.domain.ReceivingAccountBankInfo;
import com.lianlian.ew.open.domain.ReceivingAccountShopInfo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * VBA详情信息
 *
 * @author xujs002
 */
@Getter
@Setter
@ToString
public class ReceivingAccountDetailRes implements Serializable {
    private static final long serialVersionUID = 5192041749824141597L;


    private ReceivingAccountBankInfo bankInfo;

    private String vbaNickname;//FIXME:VBA
    private String currency;
    private String vbaId;//FIXME:VBA
    private String virtualAccountNo;//FIXME:VBA
    private String channelCode;


    private List<ReceivingAccountShopInfo> shops;

}

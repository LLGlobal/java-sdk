package com.lianlian.ew.open.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 加款单详情
 *
 * @author xujs002
 */
@Getter
@Setter
@ToString
public class ReceivingTransactionRes implements Serializable {

    private static final long serialVersionUID = -5926225853969588158L;

    private String accountNo;//;//"0201002580284"
    //private String approveMemo;//"11"
    private String id;//bpOrderId;//"202204296651508"
    //bpUniEntityId;//"202105181000001"
    //private String channelCode;//"US_SWITCH_01"
    //private String channelId;//"2021071300570071"
    private Date createTime;//;//"2022-04-29 16:08:44"
    private String creditorAcctNo;//"003300"
    private String creditorName;//"LIANLIAN INTERNATIONAL COMPANY LTD"
    //entryChannelAmount;//1384410
    private String entryAmount;//entryChannelAmountYuan;//"1384.41"
    private String entryCurrency;//entryChannelCurrency;//"EUR"
    //entryReceiveAmount;//1364890
    private String receiveAmount;//entryReceiveAmountYuan;//"1364.89"
    private String receiveCurrency;//entryReceiveCurrency;//"EUR"
    private String entrySource;//"E_COMMERCE_PLATFORM"
    //feeAmount;//19520
    private String fee;//feeYuan;//"19.52"
    //handUpReason;//"payee user whitelist fail"
    //handUpTime;//"2022-04-29 16:09:02"
    //marketingFee;//0
    private String memo;//"11"
    //modifyTime;//"2022-04-29 16:12:35"
//    name;//"Franklin Music"
    //payeeEntityId;//"202204250102507944"
//    payeeName;//"Franklin Music"
//    recordedTime;//"2022-04-29 16:12:33"
    private String ref;//"NA"
    //    refundAmount;//0
//    refundYuan;//"0.00"
    private String remind;//"0"
    private String status;//"SUCCESS"
    //    usOrderId;//"2022042902567215"
    private String userId;//"2022042512674869"
    private String virtualAccountNo;//"1450000004909"


}

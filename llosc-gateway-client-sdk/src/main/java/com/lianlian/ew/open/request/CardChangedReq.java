//package com.lianlian.ew.open.request;
//
//import lombok.Getter;
//import lombok.Setter;
//import org.hibernate.validator.constraints.NotBlank;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
//
///**
// * @author jipx
// */
//@Getter
//@Setter
//public class CardChangedReq implements Serializable {
//
//    private static final long serialVersionUID = -6302612715398968171L;
//
//    private String cardId;
//
//    private String cardNo;
//
//    private String otp;
//
//    private String transactionCurrency;
//
//    private String transactionAmount;
//
//    private String merchantName;
//
//    private String userId;
//
//    private String merchantId;
//
//    private String vccUserId;
//
//    private String bpUniEntityId;
//    private String transactionId;
//    private String transactionType;
//    private BigDecimal billingAmount;
//    private String billingCurrencyCode;
//    private String transactionCurrencyCode;
//    private String merchantCategoryCode;
//    private String merchantNameLocation;
//    private String originalTransactionId;
//    private String status;
//    private String errorMsg;
//    private String errorMsgCode;
//
//    @NotBlank(message = "thirdUserId is null")
//    private String thirdUserId;
//
//}

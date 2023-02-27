package com.lianlian.ew.open.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 签约结果
 *
 * @author xujs002
 */
@Getter
@Setter
@ToString
public class SigningDataInfo implements Serializable {

    private static final long serialVersionUID = 496797066770115140L;
    /**
     * Unique identifier for the `Agreement` created by the LianLian Global.
     */
    private String agreementNo;

    /**
     * Merchant ID as known by the client platform.
     */
    private String merchantClientId;

    /**
     * Unique identifier for the `Contact` Object.
     */
    private String contantId;

    /**
     * Name of signer.
     */
    private String signerName;

    /**
     * Name of counterparty.
     */
    private String counterpartyName;

    /**
     * Contract type.
     * <p>
     * ECOMMERCE-SEND-PAYMENT
     * <p>
     * BILL-DIRECT-DEBIT
     */
    private String agreementType;

    /**
     * copy type of Contract.
     * <p>
     * DUPLICATE
     * <p>
     * ORIGINAL
     */
    private String copy;

    /**
     * The object creation time.
     */
    private Date createTime;
    /**
     * The ID of File Folder object.
     */
    private String fileFloderId;

    /**
     * status of Contract.
     * <p>
     * Allowed values:
     * INIT
     * PROCESSING
     * APPROVED
     * DECLINED
     * RESCINDED
     */
    private String status;

    /**
     * Additional info to be used by customer support if needed.
     */
    private List<AdditionalInfo> additionalInfo;


}

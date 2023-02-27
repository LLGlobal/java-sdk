package com.lianlian.ew.open.response;

import com.lianlian.ew.open.domain.AdditionalInfo;
import com.lianlian.ew.open.domain.PayeeAddress;
import com.lianlian.ew.open.domain.PayeeBankInfo;
import com.lianlian.ew.open.domain.PayeeBaseInfo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * Payee Detail<br>
 * </>
 *
 * @author xujs002
 * @doc ：https://developer.lianlianglobal.com/docs/llg-openapi/c2NoOjQ0NzMwNTEx-payee-response
 */
@Getter
@Setter
@ToString
public class PayeeDetailRes implements Serializable {

    private static final long serialVersionUID = 494931057738323810L;

    /**
     * The user ID
     */
    private String userId;

    /**
     * Unique identifier for the payee.
     */
    private String id;

    /**
     * Payee type, one of INDIVIDUAL and CORPORATE
     */
    private String entityType;

    /**
     * Status of this payee in Lianlianpay system.
     * Allowed values: REJECTED ACCEPTED PROCESSING
     */
    private String status;

    /**
     * The base info of payee
     */
    private PayeeBaseInfo baseInfo;

    /**
     * The address of payee
     */
    private PayeeAddress address;

    /**
     * Then bank info of payee
     */
    private PayeeBankInfo bankInfo;

    /**
     * Then additional info of payee
     */
    private List<AdditionalInfo> additionalInfo;

    /**
     * File for this payee
     */
    private String fileId;

}

package com.lianlian.ew.open.request;

import com.lianlian.ew.open.domain.AdditionalInfo;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 创建付款单参数<br></>
 *
 * @author xujs002
 */
@Getter
@Setter
public class PayoutWriteReq extends BaseOpenApiReq {

    private static final long serialVersionUID = 3730027018488608498L;

    /**
     * Unique identifier of payee.
     */
    @NotNull(message = "payeeId is required.")
    private String payeeId;

    /**
     * The idempotent value generated by the client must be unique on each request.
     * payout requests with the same request_id will be rejected. The parameter contains a maximum of 128 characters.
     */
    @NotNull(message = "requestId is required.")
    private String requestId;

    /**
     * purpose of payout
     */
    @NotNull(message = "purpose is required.")
    private String purpose;

    /**
     * This parameter is required when exchange is required
     */
    private String rateId;

    /**
     * The actual currency of payment by the payer (in three-letter ISO 4217 format).
     */
    @NotNull(message = "payCurrency is required.")
    private String payCurrency;

    /**
     * Currency of payment to payee (in three-letter ISO 4217 format).
     */
    @NotNull(message = "sendCurrency is required.")
    private String sendCurrency;

    /**
     * Amount paid to payee, main currency unit, rounded up to 2 decimal places.
     */
    @NotNull(message = "sendAmount is required.")
    private String sendAmount;

    /**
     * Unique identification of required materials
     */
    private String fileFolderId;

    /**
     * This is the postscript information visible to the payee.
     */
    private String reference;

    /**
     * Set of key-value pairs that you can attach the business information according to Lianlian Global's requirements.
     */
    private List<AdditionalInfo> additionalInfo;

    @Override
    public String toString() {
        return "PaymentOrderWriteReq{" +
                "payeeId='" + payeeId + '\'' +
                ", requestId='" + requestId + '\'' +
                ", purpose='" + purpose + '\'' +
                ", rateId='" + rateId + '\'' +
                ", payCurrency='" + payCurrency + '\'' +
                ", sendCurrency='" + sendCurrency + '\'' +
                ", sendAmount='" + sendAmount + '\'' +
                ", fileFolderId='" + fileFolderId + '\'' +
                ", reference='" + reference + '\'' +
                ", additionalInfo=" + additionalInfo +
                "} " + super.toString();
    }
}

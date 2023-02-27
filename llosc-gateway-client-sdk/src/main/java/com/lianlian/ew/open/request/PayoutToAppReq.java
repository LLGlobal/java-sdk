package com.lianlian.ew.open.request;

import com.lianlian.ew.open.domain.AdditionalInfo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * Payout To App Req
 *
 * @author xujs002
 */
@Getter
@Setter
@ToString
public class PayoutToAppReq extends BaseOpenApiReq {

    private static final long serialVersionUID = -2511069926231237673L;

    private String appClientId;

    private String requestId;

    private String purpose;

    private String rateId;

    private String payCurrency;

    private String sendCurrency;

    private String sendAmount;

    private String fileFolderId;

    private String reference;

    private List<AdditionalInfo> additionalInfo;

}

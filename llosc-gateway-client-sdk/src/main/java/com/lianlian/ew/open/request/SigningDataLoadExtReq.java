package com.lianlian.ew.open.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;

@Setter
@Getter
@ToString
public class SigningDataLoadExtReq extends BaseOpenApiReq {
    /**
     * 商户客户端ID，外部签约单号，外部联系人ID
     */
    @NotBlank(message = "merchant_client_id is required")
    private String merchantClientId;

    @NotBlank(message = "agreement_type is required")
    @Pattern(regexp = "^ECOMMERCE-SEND-PAYMENT|BILL-DIRECT-DEBIT$", flags = Pattern.Flag.CASE_INSENSITIVE, message = "illegal agreement_type, allowed values: ECOMMERCE-SEND-PAYMENT, BILL-DIRECT-DEBIT.")
    private String agreementType;


    @Override
    public void format() {
        super.format();
    }

}

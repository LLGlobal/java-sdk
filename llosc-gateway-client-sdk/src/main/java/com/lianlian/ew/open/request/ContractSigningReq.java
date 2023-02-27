package com.lianlian.ew.open.request;

import com.lianlian.ew.open.domain.AdditionalInfo;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import java.util.List;

@Getter
@Setter
public class ContractSigningReq extends BaseOpenApiReq {


    private static final long serialVersionUID = -2176403323157435807L;


    /**
     * 商户客户端ID，外部签约单号，外部联系人ID
     */
    @NotBlank(message = "merchant_client_id is required")
    private String merchantClientId;

    /**
     * 外部商户名称
     */
    private String merchantClientName;

    /**
     * 国家地区编码，用户确定payee在哪个站点onboarding
     */
    @NotBlank(message = "country_code is required")
    private String countryCode;

//    /**
//     * 电商店铺名称，迁移到additionalInfo
//     */
//    @NotBlank(message = "store_name is required")
//    private String storeName;

    /**
     * 电商平台重定向地址
     */
    @NotBlank(message = "redirect_url is required")
    private String redirectUrl;

    /**
     * 合同类型：ECOMMERCE-SEND-PAYMENT、BILL-DIRECT-DEBIT
     */
    @NotBlank(message = "agreement_type is required")
    @Pattern(regexp ="^ECOMMERCE-SEND-PAYMENT|BILL-DIRECT-DEBIT$", flags = Pattern.Flag.CASE_INSENSITIVE , message = "illegal agreement_type, allowed values: ECOMMERCE-SEND-PAYMENT, BILL-DIRECT-DEBIT.")
    private String agreementType;


    /**
     * 电商店铺URL，迁移到additionalInfo
     */
//    private String shopUrl;

    /**
     * 扩展信息KV，存储于协议扩展信息和Payee的扩展信息
     */
    private List<AdditionalInfo> additionalInfo;


}

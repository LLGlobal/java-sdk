package com.lianlian.ew.open.request;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 汇兑订单创建、修改参数
 *
 * @author xujs002
 */
@Getter
@Setter
public class ConversionWriteReq extends BaseOpenApiReq {

    private static final long serialVersionUID = 3860709243748419236L;

    /**
     * The idempotent value generated by the client must be unique on each request.
     * Conversion requests with the same request_id will be rejected. The parameter contains a maximum of 128 characters.
     */
    @NotBlank(message = "requestId is required")
    private String requestId;

    /**
     * Sell currency, the currency that the client sells (in 3-letter ISO-4217 format).
     */
    @NotBlank(message = "sellCurrency is required")
    private String sellCurrency;

    /**
     * 买入币种
     */
    @NotBlank(message = "buyCurrency is required")
    private String buyCurrency;

    /**
     * 卖出金额
     */
    private String sellAmount;

    /**
     * 买入金额
     */
    private String buyAmount;

    /**
     * 汇率ID
     */
    @NotBlank(message = "rateId is required")
    private String rateId;

    @Override
    public String toString() {
        return "ExchangeOrderWriteReq{" +
                "requestId='" + requestId + '\'' +
                ", sellCurrency='" + sellCurrency + '\'' +
                ", buyCurrency='" + buyCurrency + '\'' +
                ", sellAmount='" + sellAmount + '\'' +
                ", buyAmount='" + buyAmount + '\'' +
                ", rateId='" + rateId + '\'' +
                "} " + super.toString();
    }
}
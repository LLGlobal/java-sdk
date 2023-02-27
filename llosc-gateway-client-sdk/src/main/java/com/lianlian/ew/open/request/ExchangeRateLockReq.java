package com.lianlian.ew.open.request;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

/**
 * request parameter of Exchange Rate Lock
 *
 * @author xujs002
 */
@Getter
@Setter
public class ExchangeRateLockReq extends BaseOpenApiReq {

    private static final long serialVersionUID = 7256590386780482186L;


    /**
     * Sell currency, the currency that the client sells (in 3-letter ISO-4217 format).
     */
    @NotBlank(message = "sell_currency is required")
    private String sellCurrency;

    /**
     * Buy currency, the currency that the client buys (in 3-letter ISO-4217 format).
     */
    @NotBlank(message = "buy_currency is required")
    private String buyCurrency;

    /**
     * When is the rate valid.
     * <p>
     * Allowed value:
     * T_0
     */
    private String validity = "T_0";

    @Override
    public String toString() {
        return "ExchangeRateLockReq{" +
                "sellCurrency='" + sellCurrency + '\'' +
                ", buyCurrency='" + buyCurrency + '\'' +
                ", validity='" + validity + '\'' +
                "} " + super.toString();
    }
}

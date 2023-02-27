/**
 *
 */
package com.lianlian.ew.open.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * return of Conversion Rate Lock
 *
 * @author xujs002
 *
 */
@Getter
@Setter
@ToString
public class ConversionRateLockRes implements Serializable {

    private static final long serialVersionUID = -8898456240767564727L;
    /**
     * Unique ID for this quote
     */
    private String id;

    /**
     * The FX quote
     */
    private String rate;

    /**
     * It represents how much of the quote currency is needed for you to get one unit of the base currency.
     */
    private String baseCurrency;

    /**
     * Sell currency, the currency that the client sells (in three-letter ISO 4217 format).
     */
    private String sellCurrency;

    /**
     * Buy currency, the currency that the client buys (in three-letter ISO 4217 format).
     */
    private String buyCurrency;

    /**
     * Quote validity period.
     */
    private String validity = "T_0";

    /**
     * The valid time of the exchange rate.
     */
    private Date validStrartingAfter;

    /**
     * The valid end time of the exchange rate.
     */
    private Date validEndingBefore;


}

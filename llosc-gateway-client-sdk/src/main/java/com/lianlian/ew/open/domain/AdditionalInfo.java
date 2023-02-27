/**
 *
 */
package com.lianlian.ew.open.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * anditionalInfo for Objects:payout, fileFolder
 *
 *
 * @author xujs002
 *
 */
@Getter
@Setter
@ToString
public class AdditionalInfo implements Serializable {

    private static final long serialVersionUID = 1245243564371273731L;

    //for payout
    public static final String PAYMENT_PRODUCT_NAME = "product_name";
    public static final String PAYMENT_QUANTITY = "quantity";
    public static final String PAYMENT_UNIT_PRICE = "unit_price";
    public static final String PAYMENT_UNITPRICE_CURRENCY = "unit_price_currency";
    public static final String PAYMENT_PURCHASE_DATE = "purchase_date";


    public AdditionalInfo() {

    }

    public AdditionalInfo(String name, String value) {
        this.name = name;
        this.value = value;
    }

    /** key */
    private String name;

    /** value */
    private String value;
}

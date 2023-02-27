package com.lianlian.ew.open.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
public class VaOpenRequest implements Serializable {
    private static final long serialVersionUID = -8358817050011572606L;

//    "merchant_client_id"："123434"，
//            "virtual_no"："60031816"，
//            "shop_url"："http://www.wish.com/wish002"


    private String merchantClientId;

    private String virtualNo;

    private String shopUrl;

    private String storeName;

    public VaOpenRequest(String merchantClientId, String virtualNo, String shopUrl) {
        this.merchantClientId = merchantClientId;
        this.virtualNo = virtualNo;
        this.shopUrl = shopUrl;
    }

    public VaOpenRequest() {
    }
}

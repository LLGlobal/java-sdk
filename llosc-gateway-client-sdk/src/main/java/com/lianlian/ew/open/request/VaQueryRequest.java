package com.lianlian.ew.open.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class VaQueryRequest {

    private String merchantClientId;

    private String currency;

    public VaQueryRequest(String merchantClientId, String currency) {
        this.merchantClientId = merchantClientId;
        this.currency = currency;
    }
}

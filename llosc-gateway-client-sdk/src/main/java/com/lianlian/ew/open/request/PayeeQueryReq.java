package com.lianlian.ew.open.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PayeeQueryReq extends BaseOpenApiQueryReq {

    private static final long serialVersionUID = 4777426059049495122L;


    private String currency;

    private String status;

    private String keyword;

    @Override
    public String toString() {
        return "ContactQueryReq{" +
                "currency='" + currency + '\'' +
                ", status='" + status + '\'' +
                ", keyword='" + keyword + '\'' +
                "} " + super.toString();
    }
}

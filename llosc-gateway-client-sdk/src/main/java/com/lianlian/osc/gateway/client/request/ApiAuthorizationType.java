package com.lianlian.osc.gateway.client.request;

public enum ApiAuthorizationType {


    Basic("Basic "),

    Bearer("Bearer ");

    private final String type;


    ApiAuthorizationType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


}

package com.lianlian.osc.gateway.client.request;

public enum ApiUriType {
    REGULAR("REGULAR"),
    NORMAL("NORMAL");
    private final String type;

    ApiUriType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

package com.lianlian.osc.gateway.client.request;

/**
 * API invoke http menthod
 *
 * @author xujs002
 */
public enum ApiMenthod {

    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE"),
    PATCH("PATCH"),
    ;
    private final String menthod;

    ApiMenthod(String menthod) {
        this.menthod = menthod;
    }

    public String getMenthod() {
        return menthod;
    }
}

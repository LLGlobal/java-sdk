package com.lianlian.osc.gateway.client;

import com.lianlian.osc.gateway.client.response.ApiResult;
import lombok.Getter;
import lombok.Setter;

/**
 * LianLian Global API Exception
 *
 * @author xujs002
 */
@Getter
@Setter
public class ApiException extends RuntimeException {

    private static final long serialVersionUID = -8404888730164734794L;

    private int httpStatusCode;
    private String httpReasonPhrase;
    private String code;


    public ApiException(int httpStatusCode, String httpReasonPhrase, String code, String message) {
        super(message);
        this.httpStatusCode = httpStatusCode;
        this.httpReasonPhrase = httpReasonPhrase;
        this.code = code;
    }


    public ApiException(int httpStatusCode, String code, String message) {
        super(message);
        this.httpStatusCode = httpStatusCode;
        this.code = code;
    }

    public ApiException(String code, String message) {
        super(message);
        this.code = code;
    }

    @Override
    public String toString() {
        return "ApiException{" +
                "httpStatusCode=" + httpStatusCode +
                ", httpReasonPhrase='" + httpReasonPhrase + '\'' +
                ", code='" + code + '\'' +
                "} " + super.toString();
    }
}

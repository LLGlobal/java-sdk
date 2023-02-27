/**
 *
 */
package com.lianlian.ew.open.domain.enmus;

/**
 * open API error code
 *
 * @author xujs002
 *
 */
public enum OpenApiErrorCodeEnum {
    SUCCESS("000000", "success", "success"),
    ILLEGAL_ARGUMENT("400100", "invalid_parameter", "Invalid parameter"),
    SYS_ERROR("999999", "service_unavailable", "The requested service is currently unavailable due to operating hours limitations, or because a third-party service is temporarily unavailable, please try again later."),
    UNEXPECTED_ERROR("400999", "unexpected_error", "Unknown error, please try again."),
    SAME_REQUEST_ID_ERROR("400403", "invalid_parameter", "The request conflicts with another request."),
    BANK_ACCOUNT_NOT_FOUND("400100", "invalid_parameter", "Payee bank account not found."),

    VBA_COUNTRY_CURRENCY_NOT_SUPPORT("400100", "invalid_parameter", "Currency not supported in this country."),
    ;


    private String code;
    private String error;
    private String message;

    OpenApiErrorCodeEnum(String _code, String _error, String _message) {
        this.code = _code;
        this.error = _error;
        this.message = _message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static OpenApiErrorCodeEnum getByCode(String _code) {
        for (OpenApiErrorCodeEnum locationEnum : OpenApiErrorCodeEnum.values()) {
            if (locationEnum.getCode().equals(_code)) {
                return locationEnum;
            }
        }
        return null;
    }
}

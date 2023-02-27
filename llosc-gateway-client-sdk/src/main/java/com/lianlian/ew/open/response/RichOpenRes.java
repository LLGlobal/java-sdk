package com.lianlian.ew.open.response;

import com.lianlian.ew.open.domain.enmus.OpenApiErrorCodeEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * base gateway result
 */
@Getter
@Setter
@ToString
public class RichOpenRes<T> implements Serializable {


    private static final long serialVersionUID = -2217580486517696361L;

    private boolean success;
    private String code;
    private String error;
    private String message;
    private T data;

    public boolean isSuccess() {
        return success;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCode() {
        return code;
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public RichOpenRes(RichOpenRes<?> res) {
        if (res == null) {
            return;
        }
        this.success = res.isSuccess();
        this.code = res.getCode();
        this.message = res.getMessage();
        this.error = res.getError();
    }

    public RichOpenRes(RichOpenRes<?> res, String message) {
        this.message = message;
        if (res == null) {
            return;
        }
        this.success = res.isSuccess();
        this.code = res.getCode();
        this.error = res.getError();
    }

    public RichOpenRes(T data) {
        this.success = Boolean.TRUE;
        this.code = OpenApiErrorCodeEnum.SUCCESS.getCode();
        this.error = OpenApiErrorCodeEnum.SUCCESS.getError();
        this.message = OpenApiErrorCodeEnum.SUCCESS.getMessage();
        this.data = data;
    }

    public RichOpenRes() {
    }

    public RichOpenRes(boolean success) {
        this.success = success;
    }

    public RichOpenRes(boolean success, OpenApiErrorCodeEnum errorCode) {
        this.success = success;
        if (errorCode != null) {
            this.code = errorCode.getCode();
            this.error = errorCode.getError();
            this.message = errorCode.getMessage();
        }
    }

    public RichOpenRes(OpenApiErrorCodeEnum errorCode) {
        this.success = Boolean.FALSE;
        if (errorCode != null) {
            this.code = errorCode.getCode();
            this.error = errorCode.getError();
            this.message = errorCode.getMessage();
        }
    }

    public RichOpenRes(boolean success, String code, String error, String message) {
        this.success = success;
        this.code = code;
        this.error = error;
        this.message = message;
    }

    public RichOpenRes(boolean success, String code, String message, T data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }

}

package com.lianlian.osc.gateway.client.response;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * API return Reference type
 *
 * @author xujs002
 */
@Getter
@Setter
@ToString
public class ApiResult {

    private String code;

    private String message;


    public ApiResult() {
    }

    public ApiResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ApiResult error(String responseBody) {
        try {
            ApiResult apiErrorResult = JSONObject.parseObject(responseBody, ApiResult.class);
            return apiErrorResult;
        } catch (Exception e) {
            return new ApiResult(null, responseBody);
        }
    }

}

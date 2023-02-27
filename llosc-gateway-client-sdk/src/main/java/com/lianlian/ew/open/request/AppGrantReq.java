package com.lianlian.ew.open.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * APP授权接口输入参数
 *
 * @author xujs002
 */
@Setter
@Getter
@ToString
public class AppGrantReq extends BaseOpenApiReq implements Serializable {
    private static final long serialVersionUID = -7055654752371573942L;

    @NotBlank(message = "app_cilent_id is required")
    private String appCilentId;


    @NotBlank(message = "merchant_client_id is required")
    private String merchantClientId;


    private String redirectUrl;
}

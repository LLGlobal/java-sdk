package com.lianlian.osc.gateway.client;

import com.lianlian.osc.gateway.client.request.ApiAuthorizationType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * config for api
 *
 * @author xujs002
 */
@Getter
@Setter
@ToString
public class GatewayConfig implements Serializable {

    private static final long serialVersionUID = -6940921310091864711L;



    private String url;
    private String lianlianPublicKey;
    private String privateKey;
    private String developerId;
    private String token;


    private boolean needVerifyResponse = Boolean.FALSE;
    private boolean needSign = Boolean.TRUE;

    private ApiAuthorizationType authorizationType = ApiAuthorizationType.Basic;


    private long readTimeout = -1;
    private long connectTimeout = -1;

    public GatewayConfig() {

    }

    public GatewayConfig(String url, String lianlianPublicKey, String privateKey, String developerId, String token, long readTimeout, long connectTimeout) {
        this.url = url;
        this.lianlianPublicKey = lianlianPublicKey;
        this.privateKey = privateKey;
        this.developerId = developerId;
        this.readTimeout = readTimeout;
        this.connectTimeout = connectTimeout;
        this.token = token;
    }


    public GatewayConfig(ApiAuthorizationType authorizationType, String url, String lianlianPublicKey, String privateKey, String developerId, String token, long readTimeout, long connectTimeout) {
        this.url = url;
        this.lianlianPublicKey = lianlianPublicKey;
        this.privateKey = privateKey;
        this.developerId = developerId;
        this.authorizationType = authorizationType;
        this.readTimeout = readTimeout;
        this.connectTimeout = connectTimeout;
        this.token = token;
    }


    public GatewayConfig(String url, String lianlianPublicKey, String privateKey, String developerId, String token, boolean needVerifyResponse, ApiAuthorizationType authorizationType, long readTimeout, long connectTimeout) {
        this.url = url;
        this.lianlianPublicKey = lianlianPublicKey;
        this.privateKey = privateKey;
        this.developerId = developerId;
        this.token = token;
        this.needVerifyResponse = needVerifyResponse;
        this.authorizationType = authorizationType;
        this.readTimeout = readTimeout;
        this.connectTimeout = connectTimeout;
    }

    public GatewayConfig(String url, String lianlianPublicKey, String privateKey, String developerId, String token, boolean needVerifyResponse, boolean needSign, ApiAuthorizationType authorizationType, long readTimeout, long connectTimeout) {
        this.url = url;
        this.lianlianPublicKey = lianlianPublicKey;
        this.privateKey = privateKey;
        this.developerId = developerId;
        this.token = token;
        this.needVerifyResponse = needVerifyResponse;
        this.needSign = needSign;
        this.authorizationType = authorizationType;
        this.readTimeout = readTimeout;
        this.connectTimeout = connectTimeout;
    }


    public GatewayConfig(String url, String lianlianPublicKey, String privateKey, String token) {
        this.url = url;
        this.lianlianPublicKey = lianlianPublicKey;
        this.privateKey = privateKey;
        this.token = token;
        this.authorizationType = ApiAuthorizationType.Bearer;
    }
}

package com.lianlian.osc.gateway.client.demo;

import com.lianlian.osc.gateway.client.request.ApiAuthorizationType;
import com.lianlian.osc.gateway.client.GatewayConfig;

/**
 * Constants for demo
 *
 * @author xujs002
 */
public interface Constants {


    /**
     * the gateway server url
     */
    String GATEWAY_SERVER_URL = "https://test-global-api.lianlianpay-inc.com";


    /**
     * the api RSA public key of LianLian Global
     */
    String LIANLIAN_GLOBAL_PUBLIC_KEY = "xxx";
    /**
     * your Application own RSA private key
     */
    String PRIVATE_KEY = "xxxx";

    /**
     * your developer ID for API uid：2022042512674869
     */
    String DEVELOPER_ID = "xxxx";

    /**
     * your token for API
     */
    String TOKEN = "xxxx";


    long CONNECT_TIMEOUT = -1;

    long SOCKET_TIMEOUT = -1;


    GatewayConfig config = new GatewayConfig(GATEWAY_SERVER_URL, LIANLIAN_GLOBAL_PUBLIC_KEY, PRIVATE_KEY, DEVELOPER_ID, TOKEN, false, true, ApiAuthorizationType.Basic, CONNECT_TIMEOUT, SOCKET_TIMEOUT);


}

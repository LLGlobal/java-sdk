package com.lianlian.osc.gateway.client.demo;

import com.lianlian.osc.gateway.client.GatewayConfig;
import com.lianlian.osc.gateway.client.request.ApiAuthorizationType;

/**
 * Constants for demo
 *
 * @author xujs002
 */
public interface ConstantsBearer {


    /**
     * the gateway server url
     */
    String GATEWAY_SERVER_URL = "https://test-global-api.lianlianpay-inc.com";


    /**
     * the api RSA public key of LianLian Global
     */
    String LIANLIAN_GLOBAL_PUBLIC_KEY = "xxxx";
    /**
     * your Application own RSA private key
     */
    String PRIVATE_KEY = "xxxx";

            /**
             * your token for API
             */
            String TOKEN = "xxxx";



    GatewayConfig config = new GatewayConfig(GATEWAY_SERVER_URL, LIANLIAN_GLOBAL_PUBLIC_KEY, PRIVATE_KEY, TOKEN);


}

package com.lianlian.osc.gateway.client.demo;

import com.alibaba.fastjson.JSONObject;
import com.lianlian.ew.open.request.BaseOpenApiReq;
import com.lianlian.ew.open.response.BalanceDetailRes;
import com.lianlian.ew.open.service.BalanceReadService;
import com.lianlian.osc.gateway.client.ApiException;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;

import java.util.List;

public class Txxx implements Constants {


    /**
     * @param args The SDK will automatically convert hump input parameters to underlined input parameters. Please use underlined input parameters as the standard.
     */
    public static void main(String[] args) {
        // create an API service as native Object
        BalanceReadService service = GatewayProxyFactory.getInstance().create(BalanceReadService.class, config);
        // init your API call parameter
        BaseOpenApiReq req = new BaseOpenApiReq();
        // invoke api as native call and get the deserialized result Object
        try {
            List<BalanceDetailRes> res = service.list(req);
            // if invoke succeed do your business
            System.out.println(res);
            System.out.println(JSONObject.toJSON(res));
            if (res != null) {
                res.forEach(e -> {
                    System.out.println("accountId:" + e.getAccountId() + "\t\t" + "currency:" + e.getCurrency() + "\t\t" + "availableAmount:" + e.getAvailableAmount());
                });
            }
        } catch (ApiException e) {
            // if invoke failed handle the exception
            System.err.println("invoke failed \nhttpStatusCode:" + e.getHttpStatusCode() + "\ncode:" + e.getCode() + "\nmessage:" + e.getMessage() + "\nhttpReasonPhrase:" + e.getHttpReasonPhrase());
        }
    }


}

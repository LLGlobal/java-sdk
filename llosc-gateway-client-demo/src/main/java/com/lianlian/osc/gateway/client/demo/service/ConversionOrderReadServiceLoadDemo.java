package com.lianlian.osc.gateway.client.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.ConversionDetailRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.ew.open.service.ConversionOrderReadService;
import com.lianlian.osc.gateway.client.ApiException;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

/**
 * demo for 'Get Conversion by Request_ID'
 * <p>
 * API doc: https://developer.lianlianglobal.com/docs/e-wallet-openapi/cdf74dea93a26-get-conversion-by-request-id
 *
 * @author xujs002
 */
public class ConversionOrderReadServiceLoadDemo implements Constants {


    public static void main(String[] args) {
        try {
            ConversionOrderReadService service = GatewayProxyFactory.getInstance().create(ConversionOrderReadService.class, config);
            OpenApiIdReq req = new OpenApiIdReq();
            req.setId("220902330326");
            ConversionDetailRes res = service.load(req);
            System.out.println(JSONObject.toJSON(res));
            System.out.println(res);
            if (res != null) {
                System.out.println(res.getSellAmount());
            }
        } catch (ApiException e) {
            //if invoke failed handle the exception
            System.err.println("invoke failed \nhttpStatusCode:" + e.getHttpStatusCode() + "\ncode:" + e.getCode() + "\nmessage:" + e.getMessage() + "\nhttpReasonPhrase:" + e.getHttpReasonPhrase());
        }
    }

}

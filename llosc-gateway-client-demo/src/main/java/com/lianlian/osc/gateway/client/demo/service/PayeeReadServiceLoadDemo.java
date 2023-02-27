package com.lianlian.osc.gateway.client.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.PayeeDetailRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.ew.open.service.PayeeReadService;
import com.lianlian.osc.gateway.client.ApiException;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

/**
 * Demo for 'Get a payee'
 * <p>
 * API doc: https://developer.lianlianglobal.com/docs/e-wallet-openapi/1020c8df44b06-get-a-payee
 *
 * @author xujs002
 */
public class PayeeReadServiceLoadDemo implements Constants {


    public static void main(String[] args) {
        try {
            PayeeReadService service = GatewayProxyFactory.getInstance().create(PayeeReadService.class, config);
            OpenApiIdReq req = new OpenApiIdReq();
            req.setId("910037478005900514304");
            PayeeDetailRes res = service.load(req);
            System.out.println(JSONObject.toJSON(res));
            System.out.println(res);
            System.out.println(res.getBaseInfo().getEmail());
        } catch (ApiException e) {
            //if invoke failed handle the exception
            System.err.println("invoke failed \nhttpStatusCode:" + e.getHttpStatusCode() + "\ncode:" + e.getCode() + "\nmessage:" + e.getMessage() + "\nhttpReasonPhrase:" + e.getHttpReasonPhrase());
        }
    }


}

package com.lianlian.osc.gateway.client.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.lianlian.ew.open.request.BaseOpenApiReq;
import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.ReceivingAccountDetailRes;
import com.lianlian.ew.open.response.ResTypeReference;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.ew.open.service.ReceivingAccountReadService;
import com.lianlian.osc.gateway.client.GatewayConfig;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

import java.util.List;

/**
 * Demo for 'Get Receiving Account Info by ID'
 * <p>
 * API doc: https://developer.lianlianglobal.com/docs/e-wallet-openapi/e2984dab47bc9-get-receiving-account-info-by-id
 *
 * @author xujs002
 */
public class ReceivingAccountReadServiceLoadDemo implements Constants {

    public static void main(String[] args) {
        ReceivingAccountReadService service = GatewayProxyFactory.getInstance().create(ReceivingAccountReadService.class, config);
        OpenApiIdReq req = new OpenApiIdReq();
        req.setId("688836368438312820736");
        RichOpenRes<ReceivingAccountDetailRes> res = service.load(req);
        System.out.println(JSONObject.toJSON(res));
        System.out.println(res);
    }


}

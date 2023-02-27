package com.lianlian.osc.gateway.client.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.lianlian.ew.open.request.BaseOpenApiReq;
import com.lianlian.ew.open.response.ReceivingAccountDetailRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.ew.open.service.ReceivingAccountReadService;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

import java.util.List;

/**
 * Demo for 'Get Receiving Account list'
 * <p>
 * API doc: https://developer.lianlianglobal.com/docs/e-wallet-openapi/facfaeb590730-get-receiving-account-list
 *
 * @author xujs002
 */
public class ReceivingAccountReadServiceListDemo implements Constants {

    public static void main(String[] args) {
        ReceivingAccountReadService service = GatewayProxyFactory.getInstance().create(ReceivingAccountReadService.class, config);
        BaseOpenApiReq req = new BaseOpenApiReq();
        RichOpenRes<List<ReceivingAccountDetailRes>> res = service.list(req);
        System.out.println(JSONObject.toJSON(res));
        System.out.println(res);
    }


}

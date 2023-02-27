package com.lianlian.osc.gateway.client.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.PayoutDetailRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.ew.open.service.PayoutReadService;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

/**
 * Demo for 'Get payout by Request ID'
 * <p>
 * API doc: https://developer.lianlianglobal.com/docs/e-wallet-openapi/64442df6273c2-get-payout-by-request-id
 *
 * @author xujs002
 */
public class PayoutReadServiceLoadDemo implements Constants {


    public static void main(String[] args) {
        //create an API service as native Object
        PayoutReadService service = GatewayProxyFactory.getInstance().create(PayoutReadService.class, config);
        //init your API call parameter
        OpenApiIdReq req = new OpenApiIdReq("220400635761");
        //invoke api as native call and get the deserialized result Object
        PayoutDetailRes res = service.load(req);
        System.out.println(JSONObject.toJSON(res));
    }


}

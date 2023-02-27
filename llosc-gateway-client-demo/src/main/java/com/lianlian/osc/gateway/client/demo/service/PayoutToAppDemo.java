package com.lianlian.osc.gateway.client.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.lianlian.ew.open.request.PayoutToAppReq;
import com.lianlian.ew.open.response.PayoutDetailRes;
import com.lianlian.ew.open.service.PayoutWriteService;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.ConstantsBearer;

public class PayoutToAppDemo implements ConstantsBearer {

    public static void main(String[] args) {
        PayoutWriteService service = GatewayProxyFactory.getInstance().create(PayoutWriteService.class, config);
        PayoutToAppReq req = new PayoutToAppReq();
        req.setAppClientId("qw9wiapydxanL0cIJLfT");
        req.setSendCurrency("USD");
        req.setPurpose("test");
        req.setPayCurrency("USD");
        req.setRequestId("SEKO_TEST_5");
        req.setSendAmount("10");
        PayoutDetailRes res = service.createToApp(req);
        System.out.println(JSONObject.toJSONString(res));
    }


}

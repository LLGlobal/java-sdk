package com.lianlian.osc.gateway.client.demo.service;

import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.ReceivingTransactionRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.ew.open.service.ReceivingTransactionReadService;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

/**
 * Demo for 'Get Receiving Transaction by ID'
 * <p>
 * API doc: https://developer.lianlianglobal.com/docs/e-wallet-openapi/c7322bcd64dac-get-receiving-transaction-by-id
 *
 * @author xujs002
 */
public class ReceivingTransactionReadServiceLoadDemo implements Constants {

    public static void main(String[] args) {
        ReceivingTransactionReadService service = GatewayProxyFactory.getInstance().create(ReceivingTransactionReadService.class, config);
        OpenApiIdReq req = new OpenApiIdReq();
        req.setId("2022050702612395");
        RichOpenRes<ReceivingTransactionRes> res = service.load(req);
        System.out.println(res);
        System.out.println(res.getData().getReceiveAmount());
    }

}

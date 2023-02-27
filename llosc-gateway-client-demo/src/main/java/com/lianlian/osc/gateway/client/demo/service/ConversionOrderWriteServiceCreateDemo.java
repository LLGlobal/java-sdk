package com.lianlian.osc.gateway.client.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.lianlian.ew.open.request.ConversionWriteReq;
import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.ConversionDetailRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.ew.open.service.ConversionOrderReadService;
import com.lianlian.ew.open.service.ConversionOrderWriteService;
import com.lianlian.osc.gateway.client.ApiException;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

/**
 * Demo for 'Create a Conversion'
 * <p>
 * API doc: https://developer.lianlianglobal.com/docs/e-wallet-openapi/61ea8a4d4747f-create-a-conversion
 *
 * @author xujs002
 */
public class ConversionOrderWriteServiceCreateDemo implements Constants {

    public static void main(String[] args) {
        try {
            ConversionOrderWriteService service = GatewayProxyFactory.getInstance().create(ConversionOrderWriteService.class, config);
            ConversionWriteReq req = new ConversionWriteReq();
            req.setBuyAmount("10.22");
            req.setBuyCurrency("EUR");
            req.setSellCurrency("USD");
            req.setRequestId("123-456-00888");
            req.setRateId("202207010001874305");
            ConversionDetailRes res = service.create(req);
            System.out.println(res);
            System.out.println(JSONObject.toJSONString(res));
            System.out.println(res.getSellAmount());
        } catch (ApiException e) {
            //if invoke failed handle the exception
            System.err.println("invoke failed \nhttpStatusCode:" + e.getHttpStatusCode() + "\ncode:" + e.getCode() + "\nmessage:" + e.getMessage() + "\nhttpReasonPhrase:" + e.getHttpReasonPhrase());
        }


    }

}

package com.lianlian.osc.gateway.client.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.lianlian.ew.open.request.ConversionWriteReq;
import com.lianlian.ew.open.request.ExchangeRateLockReq;
import com.lianlian.ew.open.response.ConversionDetailRes;
import com.lianlian.ew.open.response.ConversionRateLockRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.ew.open.service.ConversionOrderWriteService;
import com.lianlian.ew.open.service.ConversionRateLockService;
import com.lianlian.osc.gateway.client.ApiException;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

/**
 * Demo for 'Create a LockFX quote'
 * <p>
 * API doc: https://developer.lianlianglobal.com/docs/e-wallet-openapi/64502580aba47-create-a-lock-fx-quote
 *
 * @author xujs002
 */
public class ConversionRateLockServiceLockDemo implements Constants {

    public static void main(String[] args) {
        try {
            ConversionRateLockService service = GatewayProxyFactory.getInstance().create(ConversionRateLockService.class, config);
            ExchangeRateLockReq req = new ExchangeRateLockReq();
            req.setBuyCurrency("EUR");
            req.setSellCurrency("USD");
            req.setValidity("T_0");
            ConversionRateLockRes res = service.lockFxQuote(req);
            System.out.println(res);
            if (res != null) {
                System.out.println(res.getId());
            }
        } catch (ApiException e) {
            //if invoke failed handle the exception
            System.err.println("invoke failed \nhttpStatusCode:" + e.getHttpStatusCode() + "\ncode:" + e.getCode() + "\nmessage:" + e.getMessage() + "\nhttpReasonPhrase:" + e.getHttpReasonPhrase());
        }
    }


}

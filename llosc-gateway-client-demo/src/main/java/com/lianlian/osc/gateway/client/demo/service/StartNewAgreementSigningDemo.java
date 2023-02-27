package com.lianlian.osc.gateway.client.demo.service;

import com.lianlian.ew.open.domain.AdditionalInfo;

import java.util.ArrayList;

import com.alibaba.fastjson.JSONObject;
import com.lianlian.ew.open.request.BaseOpenApiReq;
import com.lianlian.ew.open.request.ContractSigningReq;
import com.lianlian.ew.open.response.BalanceDetailRes;
import com.lianlian.ew.open.response.SigningUrlRes;
import com.lianlian.ew.open.service.BalanceReadService;
import com.lianlian.ew.open.service.ContractSigningService;
import com.lianlian.osc.gateway.client.ApiException;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

import java.util.List;
/**
 * Demo for 'Start a New Agreement Signing'
 * <p>
 * API doc: https://developer.lianlianglobal.com/docs/e-wallet-openapi/ef69fa37d356e-start-a-new-agreement-signing
 *
 * @author xujs002
 */
public class StartNewAgreementSigningDemo implements Constants {

    public static void main(String[] args) {
        //create an API service as native Object
        ContractSigningService service = GatewayProxyFactory.getInstance().create(ContractSigningService.class, config);
        //init your API call parameter
        ContractSigningReq req = new ContractSigningReq();
        req.setMerchantClientId("your_merchant_client_id");
        req.setMerchantClientName("your_merchant_client_name");
        req.setCountryCode("VN");
        //your redirect url
        req.setRedirectUrl("https://www.google.com?merchant_client_id=" + req.getMerchantClientId());
        req.setAgreementType("ECOMMERCE-SEND-PAYMENT");
        req.setAdditionalInfo(new ArrayList<AdditionalInfo>());
        List<AdditionalInfo> additionalInfos = new ArrayList<>();
        additionalInfos.add(new AdditionalInfo("store_name", "TestStoreName"));
        additionalInfos.add(new AdditionalInfo("shop_url", "https://www.xxx.com/TestShopUrl"));
        req.setAdditionalInfo(additionalInfos);
        //invoke api as native call and get the deserialized result Object
        try {
            SigningUrlRes res = service.generateSigningnUrl(req);
            //if invoke succeed do your business
            System.out.println(res);
            System.out.println(JSONObject.toJSON(res));
        } catch (ApiException e) {
            //if invoke failed handle the exception
            System.err.println("invoke failed \nhttpStatusCode:" + e.getHttpStatusCode() + "\ncode:" + e.getCode() + "\nmessage:" + e.getMessage() + "\nhttpReasonPhrase:" + e.getHttpReasonPhrase());
        }
    }

}

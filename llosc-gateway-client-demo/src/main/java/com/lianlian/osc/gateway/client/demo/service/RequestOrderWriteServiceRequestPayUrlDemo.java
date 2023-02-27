package com.lianlian.osc.gateway.client.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.lianlian.ew.open.domain.AdditionalInfo;
import com.lianlian.ew.open.request.RequestPayUrlReq;
import com.lianlian.ew.open.response.RequestPayUrlRes;
import com.lianlian.ew.open.service.RequestOrderWriteService;
import com.lianlian.osc.gateway.client.ApiException;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RequestOrderWriteServiceRequestPayUrlDemo implements Constants {


    public static void main(String[] args) {
        //create an API service as native Object
        RequestOrderWriteService service = GatewayProxyFactory.getInstance().create(RequestOrderWriteService.class, config);
        //init your API call parameter
        RequestPayUrlReq req = new RequestPayUrlReq();
        req.setRequestId("R00101");
        req.setAmount("2.02");
        req.setCurrency("USD");
        req.setPurpose("Purpose_R00101");
        req.setReference("Reference_R00101");

        List<AdditionalInfo> additionalInfos = new ArrayList<>();
        additionalInfos.add(new AdditionalInfo("additionalInfo1", "additionalInfo1Value"));
        additionalInfos.add(new AdditionalInfo("additionalInfo2", "additionalInfo2Value"));
        req.setAdditionalInfo(additionalInfos);
        req.setExpireTime(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24));
        req.setReturnUrl("https://www.baidu.com");


        //invoke api as native call and get the deserialized result Object
        try {
            RequestPayUrlRes res = service.requestPayUrl(req);
            //if invoke succeed do your business
            System.out.println(res);
            System.out.println(JSONObject.toJSON(res));

        } catch (ApiException e) {
            //if invoke failed handle the exception
            System.err.println("invoke failed \nhttpStatusCode:" + e.getHttpStatusCode() + "\ncode:" + e.getCode() + "\nmessage:" + e.getMessage() + "\nhttpReasonPhrase:" + e.getHttpReasonPhrase());
        }
    }

}

package com.lianlian.osc.gateway.client.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.RequestOrderDetailRes;
import com.lianlian.ew.open.service.BalanceReadService;
import com.lianlian.ew.open.service.RequestOrderReadService;
import com.lianlian.osc.gateway.client.ApiException;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

public class RequestOrderReadServiceDemo implements Constants {

    public static void main(String[] args) {
        try {
            RequestOrderReadService service = GatewayProxyFactory.getInstance().create(RequestOrderReadService.class, config);
            String requestId = "d618145f-522c-453d-8dc7-366830b2ed99";
            OpenApiIdReq id = new OpenApiIdReq(requestId);
            RequestOrderDetailRes res = service.loadByExtId(id);
            System.out.println(JSONObject.toJSON(res));
        } catch (ApiException e) {
            System.err.println("invoke failed \nhttpStatusCode:" + e.getHttpStatusCode() + "\ncode:" + e.getCode() + "\nmessage:" + e.getMessage() + "\nhttpReasonPhrase:" + e.getHttpReasonPhrase());
        }


    }


}

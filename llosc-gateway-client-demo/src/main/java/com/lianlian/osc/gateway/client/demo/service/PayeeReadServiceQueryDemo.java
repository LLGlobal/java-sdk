package com.lianlian.osc.gateway.client.demo.service;

import com.lianlian.ew.open.request.PayeeQueryReq;
import com.lianlian.ew.open.response.PageRes;
import com.lianlian.ew.open.response.PayeeDetailRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.ew.open.service.PayeeReadService;
import com.lianlian.osc.gateway.client.ApiException;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

/**
 * FIXME:delete this menthod
 *
 * @author xujs002
 */
public class PayeeReadServiceQueryDemo implements Constants {


    public static void main(String[] args) {
        try {
            PayeeReadService service = GatewayProxyFactory.getInstance().create(PayeeReadService.class, config);
            PayeeQueryReq req = new PayeeQueryReq();
            req.setPageNumber(1);
            req.setPageSize(10);
            PageRes<PayeeDetailRes> res = service.query(req);
            System.out.println(res);
            System.out.println(res.getPageList().get(0).getBaseInfo().getEmail());
        } catch (ApiException e) {
            //if invoke failed handle the exception
            System.err.println("invoke failed \nhttpStatusCode:" + e.getHttpStatusCode() + "\ncode:" + e.getCode() + "\nmessage:" + e.getMessage() + "\nhttpReasonPhrase:" + e.getHttpReasonPhrase());
        }
    }


}

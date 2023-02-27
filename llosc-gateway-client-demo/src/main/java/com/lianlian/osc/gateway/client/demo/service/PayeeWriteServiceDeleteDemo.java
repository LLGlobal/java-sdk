package com.lianlian.osc.gateway.client.demo.service;

import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.ResTypeReference;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.ew.open.service.FileInfoWriteService;
import com.lianlian.ew.open.service.PayeeWriteService;
import com.lianlian.osc.gateway.client.GatewayConfig;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

/**
 * Demo for 'Delete a Payee'
 * <p>
 * API doc: https://developer.lianlianglobal.com/docs/e-wallet-openapi/460ee9c64a12b-delete-a-payee
 *
 * @author xujs002
 */
public class PayeeWriteServiceDeleteDemo implements Constants {


    public static void main(String[] args) {
        PayeeWriteService service = GatewayProxyFactory.getInstance().create(PayeeWriteService.class, config);
        OpenApiIdReq req = new OpenApiIdReq();
        req.setId("910036479658086044672");
        RichOpenRes<String> res = service.delete(req);
        System.out.println(res);
    }

}

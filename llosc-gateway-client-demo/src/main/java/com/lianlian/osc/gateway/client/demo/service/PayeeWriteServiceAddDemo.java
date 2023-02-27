package com.lianlian.osc.gateway.client.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.lianlian.ew.open.request.PayeeAddReq;
import com.lianlian.ew.open.response.PayeeDetailRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.ew.open.service.PayeeWriteService;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

/**
 * Demo for 'Create a new payee'
 * <p>
 * API doc: https://developer.lianlianglobal.com/docs/e-wallet-openapi/f83d932bd42a6-create-a-new-payee
 *
 * @author xujs002
 */
public class PayeeWriteServiceAddDemo implements Constants {

    public static void main(String[] args) {
        PayeeWriteService service = GatewayProxyFactory.getInstance().create(PayeeWriteService.class, config);
        String payee = "{\"baseInfo\":{\"corporateName\":\"safsd\",\"countryCode\":\"US\",\"email\":\"idra@foxmai.cc\"},\"bankInfo\":{\"holderName\":\"safs\",\"bankCountryCode\":\"US\",\"routingInfo\":[{\"bankRoutingType\":\"ABA\",\"bankRoutingNumber\":\"234243324\"}],\"accountCurrency\":\"USD\",\"swiftCode\":\"safsafsdfss\",\"accountNumber\":\"TlgeNFc6LHRobq0e2QE09Q==\",\"bankAddress\":\"US\",\"holderType\":\"CORPORATE\"},\"address\":{\"city\":\"sdf\",\"countryCode\":\"US\",\"postcode\":\"21312\",\"state\":\"CO\",\"line2\":\"asdf\",\"line1\":\"sadf\"},\"id\":\"910036369024035263488\",\"type\":\"CORPORATE\",\"userId\":\"2022042512674869\",\"status\":\"ACCEPTED\"}";
        PayeeAddReq req = JSONObject.parseObject(payee, PayeeAddReq.class);
        req.getBaseInfo().setEmail("x@xxx112.com");
        req.setFileId(null);
        System.out.println(req);
        RichOpenRes<PayeeDetailRes> res = service.add(req);
        System.out.println(res);
        System.out.println(res.getData().getBaseInfo().getEmail());
    }


}

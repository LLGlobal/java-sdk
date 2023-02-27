package com.lianlian.osc.gateway.client.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.lianlian.ew.open.domain.AdditionalInfo;
import com.lianlian.ew.open.request.PayoutWriteReq;
import com.lianlian.ew.open.response.PayoutDetailRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.ew.open.service.PayoutWriteService;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo for 'Create a Payout'
 * <p>
 * API doc: https://developer.lianlianglobal.com/docs/e-wallet-openapi/250278a0df071-create-a-payout
 *
 * @author xujs002
 */
public class PayoutWriteServiceCreateDemo implements Constants {

    public static final String PAYMENT_PRODUCT_NAME = "productName";
    public static final String PAYMENT_QUANTITY = "quantity";
    public static final String PAYMENT_UNIT_PRICE = "unitPrice";
    public static final String PAYMENT_UNITPRICE_CURRENCY = "unitPriceCurrency";

    public static void main(String[] args) {
        PayoutWriteService service = GatewayProxyFactory.getInstance().create(PayoutWriteService.class, config);
        String payee = "{\"baseInfo\":{\"corporateName\":\"safsd\",\"countryCode\":\"US\",\"email\":\"idra@foxmai.cc\"},\"bankInfo\":{\"holderName\":\"safs\",\"bankCountryCode\":\"US\",\"routingInfo\":[{\"bankRoutingType\":\"ABA\",\"bankRoutingNumber\":\"234243324\"}],\"accountCurrency\":\"USD\",\"swiftCode\":\"safsafsdfss\",\"accountNumber\":\"TlgeNFc6LHRobq0e2QE09Q==\",\"bankAddress\":\"US\",\"holderType\":\"CORPORATE\"},\"address\":{\"city\":\"sdf\",\"countryCode\":\"US\",\"postcode\":\"21312\",\"state\":\"CO\",\"line2\":\"asdf\",\"line1\":\"sadf\"},\"id\":\"910036369024035263488\",\"type\":\"CORPORATE\",\"userId\":\"2022042512674869\",\"status\":\"ACCEPTED\"}";
        PayoutWriteReq req = new PayoutWriteReq();
        List<AdditionalInfo> additionalInfo = new ArrayList<>();
        additionalInfo.add(new AdditionalInfo(PAYMENT_PRODUCT_NAME, "productName"));
        additionalInfo.add(new AdditionalInfo(PAYMENT_QUANTITY, "2"));
        additionalInfo.add(new AdditionalInfo(PAYMENT_UNIT_PRICE, "12.33"));
        additionalInfo.add(new AdditionalInfo(PAYMENT_UNITPRICE_CURRENCY, "USD"));
        req.setFileId("8635689170162671616");
        req.setPayCurrency("USD");
        req.setPayeeId("910035958611893752832");
        req.setPurpose("PURPOSE");
        req.setReference("REFERENCE");
        req.setRateId("202205310000824932");
        req.setRequestId("A001002002");
        req.setPayCurrency("USD");
        req.setSendCurrency("CNH");
        req.setSendAmount("66.66");
        req.setAdditionalInfo(additionalInfo);
        System.out.println(req);
        PayoutDetailRes res = service.create(req);
        System.out.println(res);
        System.out.println(JSONObject.toJSONString(res));
        System.out.println(res.getPayAmount());
    }
}

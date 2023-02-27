package com.lianlian.osc.gateway.webhook.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.lianlian.ew.open.domain.Constants;
import com.lianlian.ew.open.response.ConversionDetailRes;
import com.lianlian.osc.gateway.client.GatewayConfig;
import com.lianlian.osc.gateway.client.util.GatewayConstants;
import com.lianlian.osc.gateway.client.util.RSA;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(path = "/webhooks/")
public class WebhookController {
    private static final long ALLOWED_EPOCH_INTERVAL_SECONDS = 600L;
    private static final String LIANLIAN_RSA_PUBLIC_KEY = "xxxxx";
    public static final String CONCAT_STR = "&";


    /**
     * this is an example for how to receiving 'payout.success' evnet that you'v subscribed in 'Developer Center'
     * <p>
     * if your return httpcode = 200 means received the message succeed
     * <p>
     * for other httpcodes, LianLian Global webhook server will resend the message to your application 6 times till succeed
     *
     * @param requestBody the requestBody from LianLian Global webhook server send
     * @param headers     http headers include Sign infomation
     * @return
     */
    @PostMapping(value = "/payout/success")
    public Object testPost(@RequestBody(required = false) String requestBody, @RequestHeader HttpHeaders headers) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return this.doWebhook(request, requestBody, headers);
    }

    /**
     * do request verify、deserialization requestBody and do your business after get the conversion Object
     *
     * @param request
     * @param requestBody
     * @param headers
     * @return
     */
    private Object doWebhook(HttpServletRequest request, String requestBody, HttpHeaders headers) {
        String signature = request.getHeader(GatewayConstants.SIGNATURE_HEADER);
        String eventId = request.getHeader(GatewayConstants.WEBHOOK_EVENT_ID);
        if (this.verifyRequest(signature, requestBody)) {
            System.out.println("receive a valid webhook message eventId=" + eventId);
            ConversionDetailRes conversion = JSONObject.parseObject(requestBody, ConversionDetailRes.class);
            //do your business here
            boolean succeed = this.doYourBusinessHere(conversion);
            if (succeed) {
                return "OK";
            } else {
                throw new RuntimeException("your error");
            }
        } else {
            throw new RuntimeException("signature is invalid");
        }
    }

    /**
     * do your business here
     *
     * @param conversion the conversion Object
     * @return
     */
    private boolean doYourBusinessHere(ConversionDetailRes conversion) {
        boolean succeed = Boolean.TRUE;
        //do your business here
        return succeed;
    }


    private boolean verifyRequest(String signature, String body) {
        if (signature == null || signature.length() == 0) {
            throw new RuntimeException("no signature");
        }
        String[] ss = signature.trim().split(",");
        if (ss.length != 2) {
            throw new RuntimeException("signature length is not 2");
        }
        String epoch = validEpoch(ss[0]);
        String sign = validSign(ss[1]);
        //TODO:RSA CHECK
        return verifySign(sign, epoch, body);
    }

    private String validEpoch(String s) {
        String[] ss = s.split("=");
        if (ss.length != 2 || !"t".equalsIgnoreCase(ss[0])) {
            throw new RuntimeException("epoch not found");
        }
        long t = Long.valueOf(ss[1]);
        if (Math.abs(System.currentTimeMillis() / 1000 - t) >= ALLOWED_EPOCH_INTERVAL_SECONDS) {
            throw new RuntimeException("epoch is invalid");
        }
        return ss[1];
    }

    private String validSign(String s) {
        String[] ss = s.split("=");
        if (ss.length != 2 || !"v".equalsIgnoreCase(ss[0])) {
            throw new RuntimeException("signature not found");
        }
        return ss[1];
    }

    private static boolean verifySign(String sign, String epoch, String body) {
        try {
            StringBuilder sBuilder = new StringBuilder("");
            sBuilder.append(epoch).append(CONCAT_STR).append(body);
            return RSA.verify(RSA.Mode.SHA256withRSA, sBuilder.toString(), sign, LIANLIAN_RSA_PUBLIC_KEY);
        } catch (Exception e) {
            return false;
        }
    }


    //t=1653557910,v=MnxV6QsaGQoDzI3J2BkM0fjlexE2fscwSu1ZftCDElI2IfEdJBaWdfRl+Dvz7KwZlzzjtCyk36omGLaTujOESCY7rWXk2FJlSBABBdL4TmzfEN+5FBQ27c69+KF+71izTCVB5kC5CeIu2KBO4BOH6XEtLf010PnriC3CgXN8j7k=


}

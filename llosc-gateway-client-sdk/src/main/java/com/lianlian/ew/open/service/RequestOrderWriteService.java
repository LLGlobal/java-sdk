package com.lianlian.ew.open.service;

import com.lianlian.ew.open.request.RequestPayUrlReq;
import com.lianlian.ew.open.response.RequestPayUrlRes;
import com.lianlian.osc.gateway.client.request.ApiMenthod;
import com.lianlian.osc.gateway.client.request.ApiTypeReference;
import com.lianlian.osc.gateway.client.request.ApiUriType;
import com.lianlian.osc.gateway.client.request.RequestConfig;

/**
 * The Request Order Write Service can be used to create a new request payment.
 *
 * @author xujs002
 */
public interface RequestOrderWriteService {


    /**
     * openapi url: https://developer.lianlianglobal.com/docs/e-wallet-openapi/7fde175ea79a5-request-payment-url
     * <p>
     * Create a Request Payment URL for a Payer.
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/v1/ew-request-payments/url", type = ApiUriType.NORMAL, menthod = ApiMenthod.POST, reference = ApiTypeReference.RequestOrderWriteService_requestPayUrl)
    RequestPayUrlRes requestPayUrl(RequestPayUrlReq req);

}

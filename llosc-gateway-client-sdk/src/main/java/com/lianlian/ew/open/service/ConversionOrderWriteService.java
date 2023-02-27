package com.lianlian.ew.open.service;

import com.lianlian.ew.open.request.ConversionWriteReq;
import com.lianlian.ew.open.response.ConversionDetailRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.osc.gateway.client.request.ApiMenthod;
import com.lianlian.osc.gateway.client.request.ApiTypeReference;
import com.lianlian.osc.gateway.client.request.ApiUriType;
import com.lianlian.osc.gateway.client.request.RequestConfig;

/**
 * conversion order write service
 *
 * @author xujs002
 */
public interface ConversionOrderWriteService {


    /**
     * Create a new conversion to be executed. To associate a conversion with a payout, use the Payout API.
     * Note: On a conversion, both buy_currency and sell_currency will be populated,
     * but define only one of either buy_amount or sell_amount.
     * <p>
     * /gateway/v1/ew-conversions POST
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/v1/ew-conversions", type = ApiUriType.NORMAL, menthod = ApiMenthod.POST, reference = ApiTypeReference.ConversionOrderWriteService_create)
    ConversionDetailRes create(ConversionWriteReq req);

}

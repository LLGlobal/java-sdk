/**
 *
 */
package com.lianlian.ew.open.service;

import com.lianlian.ew.open.request.ExchangeRateLockReq;
import com.lianlian.ew.open.response.ConversionRateLockRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.osc.gateway.client.request.ApiMenthod;
import com.lianlian.osc.gateway.client.request.ApiTypeReference;
import com.lianlian.osc.gateway.client.request.ApiUriType;
import com.lianlian.osc.gateway.client.request.RequestConfig;

/**
 * conversion rate lock service
 *
 * This Quote API can be used to create a quote that can be used in a subsequent Exchange request during the requested validity period.
 *
 * @author xujs002
 *
 */
public interface ConversionRateLockService {

    /**
     * This Quote API can be used to create a quote that can be used in a subsequent Exchange request during the requested validity period.
     *
     * /gateway/v1/ew-conversions/lockfx POST
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/v1/ew-conversions/lockfx", type = ApiUriType.NORMAL, menthod = ApiMenthod.POST, reference = ApiTypeReference.ConversionRateLockService_lock)
    ConversionRateLockRes lockFxQuote(ExchangeRateLockReq req);
}

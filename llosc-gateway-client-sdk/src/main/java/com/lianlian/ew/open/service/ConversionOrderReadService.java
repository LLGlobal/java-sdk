/**
 *
 */
package com.lianlian.ew.open.service;

import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.ConversionDetailRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.osc.gateway.client.request.ApiMenthod;
import com.lianlian.osc.gateway.client.request.ApiTypeReference;
import com.lianlian.osc.gateway.client.request.ApiUriType;
import com.lianlian.osc.gateway.client.request.RequestConfig;

/**
 * Conversion Order Read Service
 *
 * @author xujs002
 *
 */
public interface ConversionOrderReadService {

    /**
     * Get detail of an exchange transaction.
     *
     * /gateway/v1/ew-conversions/{id} GET
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/v1/ew-conversions/${id}", type = ApiUriType.REGULAR, menthod = ApiMenthod.GET, reference = ApiTypeReference.ConversionOrderReadService_load)
    ConversionDetailRes load(OpenApiIdReq req);

}

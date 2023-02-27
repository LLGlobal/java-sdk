/**
 *
 */
package com.lianlian.ew.open.service;

import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.PayoutDetailRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.osc.gateway.client.request.ApiMenthod;
import com.lianlian.osc.gateway.client.request.ApiTypeReference;
import com.lianlian.osc.gateway.client.request.ApiUriType;
import com.lianlian.osc.gateway.client.request.RequestConfig;

/**
 * payout
 *
 * @author xujs002
 *
 */
public interface PayoutReadService {

    /**
     * Get detail of a payout transaction.
     * /gateway/v1/ew-payouts/{id}
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/v1/ew-payouts/${id}", type = ApiUriType.REGULAR, menthod = ApiMenthod.GET, reference = ApiTypeReference.PayoutReadService_load)
    PayoutDetailRes load(OpenApiIdReq req);

}

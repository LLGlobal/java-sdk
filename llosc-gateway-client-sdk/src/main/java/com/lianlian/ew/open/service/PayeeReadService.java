package com.lianlian.ew.open.service;

import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.request.PayeeQueryReq;
import com.lianlian.ew.open.response.PageRes;
import com.lianlian.ew.open.response.PayeeDetailRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.osc.gateway.client.request.ApiMenthod;
import com.lianlian.osc.gateway.client.request.ApiTypeReference;
import com.lianlian.osc.gateway.client.request.ApiUriType;
import com.lianlian.osc.gateway.client.request.RequestConfig;

/**
 * A payee needs to be created before a payout can be made, the payee notes the individual or corporate being paid along with the bank details.
 *
 * @author xujs002
 */
public interface PayeeReadService {


    /**
     * get list of payee
     *
     * @param req
     * @return
     */

    @RequestConfig(uri = "/gateway/v1/ew-payees", type = ApiUriType.NORMAL, menthod = ApiMenthod.GET, reference = ApiTypeReference.PayeeReadService_query)
    PageRes<PayeeDetailRes> query(PayeeQueryReq req);

    /**
     * Get a specific payee by the payee_id
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/v1/ew-payees/${id}", type = ApiUriType.REGULAR, menthod = ApiMenthod.GET, reference = ApiTypeReference.PayeeReadService_load)
    PayeeDetailRes load(OpenApiIdReq req);


}

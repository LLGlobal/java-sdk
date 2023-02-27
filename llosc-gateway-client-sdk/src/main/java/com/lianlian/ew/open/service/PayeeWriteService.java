package com.lianlian.ew.open.service;

import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.request.PayeeAddReq;
import com.lianlian.ew.open.response.PayeeDetailRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.osc.gateway.client.request.ApiMenthod;
import com.lianlian.osc.gateway.client.request.ApiTypeReference;
import com.lianlian.osc.gateway.client.request.ApiUriType;
import com.lianlian.osc.gateway.client.request.RequestConfig;

/**
 * payee write service
 *
 * @author xujs002
 */
public interface PayeeWriteService {


    /**
     * create a new payee which will be audited by LianLian Global before that can be used in payout transaction.
     * <p>
     * A notification of the audit result will be sent by Webhook after subscribing the Payee related event Payee.
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/v1/ew-payees", type = ApiUriType.REGULAR, menthod = ApiMenthod.POST, reference = ApiTypeReference.PayeeReadService_load)
    RichOpenRes<PayeeDetailRes> add(PayeeAddReq req);

    /**
     * Delete a specific payee by the payee_id
     * <p>
     * /gateway/v1/ew-payees/{id} DELETE
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/v1/ew-payees/${id}", type = ApiUriType.REGULAR, menthod = ApiMenthod.DELETE, reference = ApiTypeReference.DEFAULT)
    RichOpenRes<String> delete(OpenApiIdReq req);

}

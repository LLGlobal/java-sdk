package com.lianlian.ew.open.service;

import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.ReceivingTransactionRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.osc.gateway.client.request.ApiMenthod;
import com.lianlian.osc.gateway.client.request.ApiUriType;
import com.lianlian.osc.gateway.client.request.RequestConfig;

/**
 * receiving transaction read service
 *
 * @author xujs002
 */
public interface ReceivingTransactionReadService {

    /**
     * Get receiving transaction by LianLian Global receiving id.
     * <p>
     * uri:/gateway/v1/ew-receiving/transaction/{id} GET
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/v1/ew-receiving/transaction/${id}", type = ApiUriType.REGULAR, menthod = ApiMenthod.GET)
    RichOpenRes<ReceivingTransactionRes> load(OpenApiIdReq req);


}

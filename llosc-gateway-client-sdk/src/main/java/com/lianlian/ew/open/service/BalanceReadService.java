/**
 *
 */
package com.lianlian.ew.open.service;

import com.lianlian.ew.open.request.BaseOpenApiReq;
import com.lianlian.ew.open.response.BalanceDetailRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.osc.gateway.client.request.ApiMenthod;
import com.lianlian.osc.gateway.client.request.ApiTypeReference;
import com.lianlian.osc.gateway.client.request.ApiUriType;
import com.lianlian.osc.gateway.client.request.RequestConfig;

import java.util.List;

/**
 * The Balance API can be used to get available balances in each currency.
 *
 * Different currency of available balances at present under your LianLian Global account .
 *
 * @author xujs002
 *
 */
public interface BalanceReadService {

    /**
     * list balances
     *
     * /gateway/v1/ew-balances
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/v1/ew-balances", type = ApiUriType.NORMAL, menthod = ApiMenthod.GET, reference = ApiTypeReference.BalanceReadService_list)
    List<BalanceDetailRes> list(BaseOpenApiReq req);


    /**
     * list balances
     *
     * /gateway/v1/ew-balances
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/v1/ew-balances-with-settings", type = ApiUriType.NORMAL, menthod = ApiMenthod.GET, reference = ApiTypeReference.BalanceReadService_list)
    List<BalanceDetailRes> listWithConfig(BaseOpenApiReq req);

}

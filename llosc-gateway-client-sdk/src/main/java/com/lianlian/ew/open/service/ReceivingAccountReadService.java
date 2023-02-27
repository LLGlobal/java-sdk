package com.lianlian.ew.open.service;

import com.lianlian.ew.open.request.BaseOpenApiReq;
import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.ReceivingAccountDetailRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.osc.gateway.client.request.ApiMenthod;
import com.lianlian.osc.gateway.client.request.ApiUriType;
import com.lianlian.osc.gateway.client.request.RequestConfig;

import java.util.List;

/**
 * Receiving Accounts are accounts that function as local bank accounts.
 * They can be used to collect funds from around the world. You get account details that enable you to collect funds from various platforms such as Amazon,Esty,etc.
 * <p>
 * You can apply Receiving Accounts on LianLian Global's website,
 * and by using Receiving API you can query your Receiving Accounts and Receiving transaction detail information.
 * <p>
 * Receiving Account Read Service
 *
 * @author xujs002
 */
public interface ReceivingAccountReadService {


    /**
     * Get list of receiving accounts created by your LianLian Global account.
     * <p>
     * /gateway/v1/ew-receiving GET
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/v1/ew-receiving/accounts", type = ApiUriType.NORMAL, menthod = ApiMenthod.GET)
    RichOpenRes<List<ReceivingAccountDetailRes>> list(BaseOpenApiReq req);

    /**
     * Get receiving account by an LianLian Global receiving account id.
     * <p>
     * /gateway/v1/ew-receiving/{id} GET
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/v1/ew-receiving/accounts/${id}", type = ApiUriType.REGULAR, menthod = ApiMenthod.GET)
    RichOpenRes<ReceivingAccountDetailRes> load(OpenApiIdReq req);
}

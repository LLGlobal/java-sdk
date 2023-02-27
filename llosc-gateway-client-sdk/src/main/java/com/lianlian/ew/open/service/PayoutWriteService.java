package com.lianlian.ew.open.service;

import com.lianlian.ew.open.request.PayoutToAppReq;
import com.lianlian.ew.open.request.PayoutWriteReq;
import com.lianlian.ew.open.response.PayoutDetailRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.osc.gateway.client.request.ApiMenthod;
import com.lianlian.osc.gateway.client.request.ApiTypeReference;
import com.lianlian.osc.gateway.client.request.ApiUriType;
import com.lianlian.osc.gateway.client.request.RequestConfig;

/**
 * Payout write service
 * <p>
 * A payment resource is created when you send funds to a bank account beneficiary.
 * You should create the payment by using the payee ID which was previously created using Beneficiary resource.
 *
 * @author xujs002
 */
public interface PayoutWriteService {

    /**
     * Create a payout to a payee.
     * The successful creation only represents the successful receipt of the distribution order by LianLian Global ,not means the transaction succeed. You can use Get payout API to obtain transaction results.
     * <p>
     * If you want to receive notification of transaction results, you can subscribe to payout related event Payout.
     * <p>
     * [Note] Payment can include exchange when send_currency and pay_currency are different, and conversion is not included when send_currency matches pay_currency.
     * <p>
     * Payer is responsible for the payment fee.
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/v1/ew-payouts", type = ApiUriType.NORMAL, menthod = ApiMenthod.POST, reference = ApiTypeReference.PayoutReadService_load)
    PayoutDetailRes create(PayoutWriteReq req);


    /**
     * Create a payout to an APP owner payee.
     * The successful creation only represents the successful receipt of the distribution order by LianLian Global ,not means the transaction succeed. You can use Get payout API to obtain transaction results.
     * <p>
     * If you want to receive notification of transaction results, you can subscribe to payout related event Payout.
     * <p>
     * [Note] Payment can include exchange when send_currency and pay_currency are different, and conversion is not included when send_currency matches pay_currency.
     * <p>
     * Payer is responsible for the payment fee.
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/v1/ew-payouts-to-app", type = ApiUriType.NORMAL, menthod = ApiMenthod.POST, reference = ApiTypeReference.PayoutReadService_load)
    PayoutDetailRes createToApp(PayoutToAppReq req);


}

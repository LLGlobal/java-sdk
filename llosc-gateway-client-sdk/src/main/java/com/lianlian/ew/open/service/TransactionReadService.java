//package com.lianlian.ew.open.service;
//
//import com.lianlian.ew.open.request.OpenApiIdReq;
//import com.lianlian.ew.open.request.TransactionQueryReq;
//import com.lianlian.ew.open.response.*;
//
///**
// * 业务单据查询服务<br></>
// * 对应 @see com.lianlian.cb.cbewbizgateway.controller.TransactionQueryController<br></>
// * <p>
// * 付款单详情，下游依赖迁移到payment service 项目
// * 参考 @see com.lianlian.cb.cbewpayout.service.facade.PaymentQueryFacade#detail
// *
// * @author xujs002
// */
//public interface TransactionReadService {
//
//
//    //search TransactionQueryReq
//
//    /**
//     * 付款单据详情服务<br>
//     * openapi url:
//     *
//     * @param req
//     * @return
//     * @see com.lianlian.cb.cbewbizgateway.controller.TransactionQueryController#search
//     */
//    RichOpenRes<PageRes<TransactionOrderDetail>> search(TransactionQueryReq req);
//
//    /**
//     * 付款单据详情服务<br>
//     * openapi url:
//     *
//     * @param req
//     * @return
//     * @see com.lianlian.cb.cbewpayout.service.facade.PaymentQueryFacade#detail
//     */
//    RichOpenRes<PayoutDetailRes> loadPaymentOrder(OpenApiIdReq req);
//
//
//    /**
//     * 汇兑单据详情服务<br>
//     * openapi url:
//     *
//     * @param req
//     * @return
//     * @see com.lianlian.cb.cbewbizgateway.controller.TransactionQueryController.exchangeDetail
//     */
//    RichOpenRes<ConversionDetailRes> loadExchangeOrder(OpenApiIdReq req);
//}

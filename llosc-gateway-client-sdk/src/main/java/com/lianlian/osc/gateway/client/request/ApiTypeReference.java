package com.lianlian.osc.gateway.client.request;

import com.alibaba.fastjson.TypeReference;
import com.lianlian.ew.open.response.AppGrantRes;
import com.lianlian.ew.open.response.ResTypeReference;

/**
 * API return Reference type
 *
 * @author xujs002
 */
public enum ApiTypeReference {

    DEFAULT(ResTypeReference.DEFAULT),
    AttachmentReadService_query(ResTypeReference.AttachmentReadService_query),
    AttachmentReadService_load(ResTypeReference.AttachmentReadService_load),
    AttachmentReadService_download(ResTypeReference.AttachmentReadService_download),


    FileReadService_load(ResTypeReference.FileReadService_load),
    BalanceReadService_list(ResTypeReference.BalanceReadService_list),
    PayeeReadService_query(ResTypeReference.PayeeReadService_query),
    PayeeReadService_load(ResTypeReference.PayeeReadService_load),
    ReceivingTransactionReadService_load(ResTypeReference.ReceivingTransactionReadService_load),
    ConversionOrderReadService_load(ResTypeReference.ConversionOrderReadService_load),
    ConversionOrderWriteService_create(ResTypeReference.ConversionOrderWriteService_create),
    ConversionRateLockService_lock(ResTypeReference.ConversionRateLockService_lock),
    FileInfoWriteService_create(ResTypeReference.FileInfoWriteService_create),
    PayoutReadService_load(ResTypeReference.PayoutReadService_load),
    ReceivingAccountReadService_list(ResTypeReference.ReceivingAccountReadService_list),
    ReceivingAccountReadService_load(ResTypeReference.ReceivingAccountReadService_load),

    RequestOrderWriteService_requestPayUrl(ResTypeReference.RequestOrderWriteService_requestPayUrl),

    TypeReference_SigningUrlRes(ResTypeReference.TypeReference_SigningUrlRes),


    TypeReference_ApiAuthInfoData(ResTypeReference.ApiAuthInfoData),

    TypeReference_AppGrantRes(ResTypeReference.AppGrantRes),


    TypeReference_RequestOrderDetailRes(ResTypeReference.RequestOrderDetailRes),


    ;





    private final TypeReference ref;


    ApiTypeReference(TypeReference ref) {
        this.ref = ref;
    }

    public TypeReference getRef() {
        return ref;
    }
}

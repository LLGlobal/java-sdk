package com.lianlian.ew.open.response;

import com.alibaba.fastjson.TypeReference;
import com.lianlian.ew.open.domain.ApiAuthInfoData;

import java.util.List;

/**
 * fastjson deserialize TypeReference
 *
 * @author xujs002
 */
public interface ResTypeReference {

    TypeReference AttachmentReadService_query = new TypeReference<PageRes<FileDetail>>() {
    };
    TypeReference AttachmentReadService_load = new TypeReference<FileDetail>() {
    };
    TypeReference AttachmentReadService_download = new TypeReference<FileContent>() {
    };


    TypeReference FileReadService_load = new TypeReference<FileFolderDetail>() {
    };

    TypeReference BalanceReadService_list = new TypeReference<List<BalanceDetailRes>>() {
    };

    TypeReference PayeeReadService_query = new TypeReference<PageRes<PayeeDetailRes>>() {
    };

    TypeReference PayeeReadService_load = new TypeReference<PayeeDetailRes>() {
    };

    TypeReference ReceivingTransactionReadService_load = new TypeReference<ReceivingTransactionRes>() {
    };

    TypeReference ConversionOrderReadService_load = new TypeReference<ConversionDetailRes>() {
    };

    TypeReference ConversionOrderWriteService_create = new TypeReference<ConversionDetailRes>() {
    };


    TypeReference ConversionRateLockService_lock = new TypeReference<ConversionRateLockRes>() {
    };

    TypeReference FileInfoWriteService_create = new TypeReference<FileFolderDetail>() {
    };


    TypeReference PayoutReadService_load = new TypeReference<PayoutDetailRes>() {
    };

    TypeReference ReceivingAccountReadService_list = new TypeReference<List<ReceivingAccountDetailRes>>() {
    };


    TypeReference ReceivingAccountReadService_load = new TypeReference<ReceivingAccountDetailRes>() {
    };

    TypeReference RequestOrderWriteService_requestPayUrl = new TypeReference<RequestPayUrlRes>() {
    };

    TypeReference TypeReference_SigningUrlRes = new TypeReference<SigningUrlRes>() {
    };


    TypeReference ApiAuthInfoData = new TypeReference<ApiAuthInfoData>() {
    };

    TypeReference AppGrantRes = new TypeReference<AppGrantRes>() {
    };


    TypeReference RequestOrderDetailRes = new TypeReference<RequestOrderDetailRes>() {
    };


    TypeReference DEFAULT = new TypeReference<String>() {
    };


}

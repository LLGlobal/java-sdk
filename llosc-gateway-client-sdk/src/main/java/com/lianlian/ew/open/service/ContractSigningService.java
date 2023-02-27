package com.lianlian.ew.open.service;

import com.lianlian.ew.open.domain.ApiAuthInfoData;
import com.lianlian.ew.open.request.AppGrantReq;
import com.lianlian.ew.open.request.ContractSigningReq;
import com.lianlian.ew.open.request.SigningDataLoadExtReq;
import com.lianlian.ew.open.response.ApiAuthInfoRes;
import com.lianlian.ew.open.response.AppGrantRes;
import com.lianlian.ew.open.response.SigningUrlRes;
import com.lianlian.osc.gateway.client.request.ApiMenthod;
import com.lianlian.osc.gateway.client.request.ApiTypeReference;
import com.lianlian.osc.gateway.client.request.ApiUriType;
import com.lianlian.osc.gateway.client.request.RequestConfig;

public interface ContractSigningService {




    @RequestConfig(uri = "/gateway/v1/ew-agreements/signing", type = ApiUriType.NORMAL, menthod = ApiMenthod.POST, reference = ApiTypeReference.TypeReference_SigningUrlRes)
    SigningUrlRes generateSigningnUrl(ContractSigningReq req);



    @RequestConfig(uri = "/gateway/v1/ew-agreements/app-grant", type = ApiUriType.NORMAL, menthod = ApiMenthod.POST, reference = ApiTypeReference.TypeReference_AppGrantRes)
    AppGrantRes generateAppGrantUrl(AppGrantReq req);


    @RequestConfig(uri = "/gateway/v1/ew-agreements/app-auth-info", type = ApiUriType.NORMAL, menthod = ApiMenthod.GET, reference = ApiTypeReference.TypeReference_ApiAuthInfoData)
    ApiAuthInfoData loadApiAuthInfo(AppGrantReq req);





}

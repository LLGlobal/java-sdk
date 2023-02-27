package com.lianlian.ew.open.service;

import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.RequestOrderDetailRes;
import com.lianlian.osc.gateway.client.request.ApiMenthod;
import com.lianlian.osc.gateway.client.request.ApiTypeReference;
import com.lianlian.osc.gateway.client.request.ApiUriType;
import com.lianlian.osc.gateway.client.request.RequestConfig;

public interface RequestOrderReadService {


    /**
     * load a Request Order Detail by request_id
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/v1/ew-request-payments/${id}", type = ApiUriType.REGULAR, menthod = ApiMenthod.GET, reference = ApiTypeReference.TypeReference_RequestOrderDetailRes)
    RequestOrderDetailRes loadByExtId(OpenApiIdReq req);


}

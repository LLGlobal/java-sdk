package com.lianlian.ew.open.service;

import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.FileFolderDetail;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.osc.gateway.client.request.ApiMenthod;
import com.lianlian.osc.gateway.client.request.ApiTypeReference;
import com.lianlian.osc.gateway.client.request.ApiUriType;
import com.lianlian.osc.gateway.client.request.RequestConfig;

/**
 * File read service
 * <p>
 * The files are used for purpose of payout, payee, etc.
 *
 * @author xujs002
 */
public interface FileFolderReadService {
    /**
     * Get File Info by File ID.
     * <p>
     * /gateway/v1/ew-files/{id} GET
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/v1/ew-folders/${id}", type = ApiUriType.REGULAR, menthod = ApiMenthod.GET, reference = ApiTypeReference.FileReadService_load)
    FileFolderDetail load(OpenApiIdReq req);


}

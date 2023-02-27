package com.lianlian.ew.open.service;

import com.lianlian.ew.open.request.FileInfoCreateReq;
import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.FileFolderDetail;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.osc.gateway.client.request.ApiMenthod;
import com.lianlian.osc.gateway.client.request.ApiTypeReference;
import com.lianlian.osc.gateway.client.request.ApiUriType;
import com.lianlian.osc.gateway.client.request.RequestConfig;

/**
 * File write service
 *
 * @author xujs002
 */
public interface FileInfoWriteService {

    /**
     * create a new File with multiple Attachment refrence.
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/v1/ew-folders", type = ApiUriType.NORMAL, menthod = ApiMenthod.POST, reference = ApiTypeReference.FileInfoWriteService_create)
    FileFolderDetail create(FileInfoCreateReq req);

    /**
     * Delete File Info by File ID. This method only delete file object, not the attachments associated with it.
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/v1/ew-folders/${id}", type = ApiUriType.REGULAR, menthod = ApiMenthod.DELETE, reference = ApiTypeReference.DEFAULT)
    String delete(OpenApiIdReq req);
}

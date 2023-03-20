package com.lianlian.ew.open.service;

import com.lianlian.ew.open.request.AttachmentUploadReq;
import com.lianlian.ew.open.response.FileDetail;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.osc.gateway.client.request.ApiMenthod;
import com.lianlian.osc.gateway.client.request.ApiTypeReference;
import com.lianlian.osc.gateway.client.request.ApiUriType;
import com.lianlian.osc.gateway.client.request.RequestConfig;

/**
 * Attachment Write Service
 *
 * @author xujs002
 */
public interface FileWriteService {
    /**
     * upload an attachment to LianLian Global server
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/file/upload", type = ApiUriType.NORMAL, menthod = ApiMenthod.POST,reference = ApiTypeReference.AttachmentReadService_load)
    FileDetail upload(AttachmentUploadReq req);
}

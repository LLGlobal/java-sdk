package com.lianlian.ew.open.service;

import com.lianlian.ew.open.request.AttachmentQueryReq;
import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.FileContent;
import com.lianlian.ew.open.response.FileDetail;
import com.lianlian.ew.open.response.PageRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.osc.gateway.client.request.ApiMenthod;
import com.lianlian.osc.gateway.client.request.ApiTypeReference;
import com.lianlian.osc.gateway.client.request.ApiUriType;
import com.lianlian.osc.gateway.client.request.RequestConfig;

/**
 * attachment read service
 *
 * @author xujs002
 */
public interface FileReadService {


    /**
     * Get page list of attachments.
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/v1/ew-files", type = ApiUriType.NORMAL, menthod = ApiMenthod.GET, reference = ApiTypeReference.AttachmentReadService_query)
    PageRes<FileDetail> query(AttachmentQueryReq req);


    /**
     * Download Attachment Info by attachment_id.
     *
     * @param req
     * @return
     */
    @RequestConfig(uri = "/gateway/file/${id}", type = ApiUriType.REGULAR, menthod = ApiMenthod.GET, reference = ApiTypeReference.AttachmentReadService_download)
    FileContent download(OpenApiIdReq req);


}

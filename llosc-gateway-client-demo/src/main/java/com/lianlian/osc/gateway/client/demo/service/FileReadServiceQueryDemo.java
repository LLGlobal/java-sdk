package com.lianlian.osc.gateway.client.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.lianlian.ew.open.request.AttachmentQueryReq;
import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.FileDetail;
import com.lianlian.ew.open.response.PageRes;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.ew.open.service.FileInfoWriteService;
import com.lianlian.ew.open.service.FileReadService;
import com.lianlian.osc.gateway.client.ApiException;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

/**
 * Demo for 'Get list of Attachment Info'
 * <p>
 * API doc: https://developer.lianlianglobal.com/docs/e-wallet-openapi/4db10d5c639a4-get-list-of-attachment-info
 *
 * @author xujs002
 */
public class FileReadServiceQueryDemo implements Constants {

    public static void main(String[] args) {
        try {
            FileReadService service = GatewayProxyFactory.getInstance().create(FileReadService.class, config);
            AttachmentQueryReq req = new AttachmentQueryReq();
            req.setPageNumber(1);
            req.setPageSize(2);
            req.setName("yyzz.png");
            PageRes<FileDetail> res = service.query(req);
            System.out.println(res);
            if (res != null && res.getPageList() != null && res.getPageList().size() > 0) {
                for (FileDetail fileDetail : res.getPageList()) {
                    System.out.println(JSONObject.toJSONString(fileDetail));
                }
            }
        } catch (ApiException e) {
            //if invoke failed handle the exception
            System.err.println("invoke failed \nhttpStatusCode:" + e.getHttpStatusCode() + "\ncode:" + e.getCode() + "\nmessage:" + e.getMessage() + "\nhttpReasonPhrase:" + e.getHttpReasonPhrase());
        }
    }

}

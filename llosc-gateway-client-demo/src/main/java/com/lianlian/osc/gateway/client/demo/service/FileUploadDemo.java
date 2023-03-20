package com.lianlian.osc.gateway.client.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.lianlian.ew.open.domain.AttachmentExtensionInfo;
import com.lianlian.ew.open.request.AttachmentUploadReq;
import com.lianlian.ew.open.response.FileDetail;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.ew.open.service.FileWriteService;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

import java.io.File;

/**
 * Demo for 'Upload Attachment'
 * <p>
 * API doc: https://developer.lianlianglobal.com/docs/e-wallet-openapi/3c6143d0a9228-upload-attachment
 *
 * @author xujs002
 */
public class FileUploadDemo implements Constants {

    public static void main(String[] args) {
        try {
            FileWriteService service = GatewayProxyFactory.getInstance().create(FileWriteService.class, config);
            AttachmentUploadReq req = new AttachmentUploadReq(new File("D:/yyzz.png"), new AttachmentExtensionInfo("ymt__GJhbjqsGdntCvBwSohDVLIUXWmfOXvJDAUnFMMBhTiKhU_WAWnVABKsvpW`eSHL\\Qv\\ViMOqKxX[MWcsFiDb]WRhuWosOX]JRNFZ[Mj\\RVGo^c^DurlkICnVDgX", "testTitle_a"));
            FileDetail res = service.upload(req);
            System.out.println(res);
            System.out.println(JSONObject.toJSON(res));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

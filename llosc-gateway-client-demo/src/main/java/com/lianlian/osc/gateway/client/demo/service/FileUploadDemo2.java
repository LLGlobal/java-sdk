package com.lianlian.osc.gateway.client.demo.service;

import com.lianlian.ew.open.domain.AttachmentExtensionInfo;
import com.lianlian.ew.open.request.AttachmentUploadReq;
import com.lianlian.osc.gateway.client.request.ApiAuthorizationType;
import com.lianlian.osc.gateway.client.demo.Constants;
import com.lianlian.osc.gateway.client.http.GatewayHttpInvoker;

import java.io.File;
import java.io.IOException;

/**
 * Demo for 'Upload Attachment'
 * <p>
 * API doc: https://developer.lianlianglobal.com/docs/e-wallet-openapi/3c6143d0a9228-upload-attachment
 *
 * @author xujs002
 */
public class FileUploadDemo2 implements Constants {

    public static void main(String[] args) throws IOException {
        AttachmentUploadReq req = new AttachmentUploadReq(new File("D:/yyzz.png"), new AttachmentExtensionInfo("testNotes", "testTitle"));
        String URI = "/gateway/file/upload";
        String result = GatewayHttpInvoker.upload(GATEWAY_SERVER_URL + URI, ApiAuthorizationType.Basic.getType(), DEVELOPER_ID, TOKEN, req);
        System.out.println(result);
    }

}

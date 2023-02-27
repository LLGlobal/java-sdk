package com.lianlian.osc.gateway.client.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.FileContent;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.ew.open.service.FileReadService;
import com.lianlian.osc.gateway.client.ApiException;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

import java.io.*;

/**
 * Demo for 'Download Attachment'
 * <p>
 * API doc: https://developer.lianlianglobal.com/docs/e-wallet-openapi/a26f63c8a4510-download-attachment
 *
 * @author xujs002
 */
public class FileDownloadDemo implements Constants {

    public static void main(String[] args) throws IOException {
        try {
            FileReadService service = GatewayProxyFactory.getInstance().create(FileReadService.class, config);
            String id = "8536482754528665600";
            OpenApiIdReq req = new OpenApiIdReq(id);
            FileContent res = service.download(req);
            if (res != null) {
                OutputStream out = new FileOutputStream("D:/" + id + "_" + res.getName().toString());
                InputStream is = new ByteArrayInputStream(res.getContent());
                byte[] buff = new byte[1024];
                int len = 0;
                while ((len = is.read(buff)) != -1) {
                    out.write(buff, 0, len);
                }
            }
            System.out.println(res);
            System.out.println(JSONObject.toJSON(res));
        } catch (ApiException e) {
            //if invoke failed handle the exception
            System.out.println("invoke failed \nhttpStatusCode:" + e.getHttpStatusCode() + "\ncode:" + e.getCode() + "\nmessage:" + e.getMessage() + "\nhttpReasonPhrase:" + e.getHttpReasonPhrase());
        }
    }


}

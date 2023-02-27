package com.lianlian.osc.gateway.client.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.ConversionDetailRes;
import com.lianlian.ew.open.response.FileContent;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.ew.open.service.ConversionOrderReadService;
import com.lianlian.osc.gateway.client.ApiException;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.request.ApiAuthorizationType;
import com.lianlian.osc.gateway.client.demo.Constants;
import com.lianlian.osc.gateway.client.http.GatewayHttpInvoker;

import java.io.*;

/**
 * Demo for 'Download Attachment'
 * <p>
 * API doc: https://developer.lianlianglobal.com/docs/e-wallet-openapi/a26f63c8a4510-download-attachment
 *
 * @author xujs002
 */
public class FileDownloadDemo2 implements Constants {

    public static void main(String[] args) throws IOException {
        try {
            String URI = "/gateway/file/8536482754528665600";
            FileContent res = GatewayHttpInvoker.downLoad(GATEWAY_SERVER_URL + URI, ApiAuthorizationType.Basic.getType(), DEVELOPER_ID, TOKEN);
            System.out.println(res);
            if (res != null) {
                OutputStream out = new FileOutputStream("D:/" + res.getName().toString());
                InputStream is = new ByteArrayInputStream(res.getContent());
                byte[] buff = new byte[1024];
                int len = 0;
                while ((len = is.read(buff)) != -1) {
                    out.write(buff, 0, len);
                }
            }
        } catch (ApiException e) {
            //if invoke failed handle the exception
            System.err.println("invoke failed \nhttpStatusCode:" + e.getHttpStatusCode() + "\ncode:" + e.getCode() + "\nmessage:" + e.getMessage() + "\nhttpReasonPhrase:" + e.getHttpReasonPhrase());
        }
    }

}

package com.lianlian.osc.gateway.client.demo.service;

import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.FileFolderDetail;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.ew.open.service.FileFolderReadService;
import com.lianlian.osc.gateway.client.ApiException;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

/**
 * Demo for 'Get File Info by File ID'
 * <p>
 * API doc: https://developer.lianlianglobal.com/docs/e-wallet-openapi/1d0ad304f13b1-get-file-info-by-file-id
 *
 * @author xujs002
 */
public class FileFolderReadServiceLoadDemo implements Constants {

    public static void main(String[] args) {
        try {
            FileFolderReadService service = GatewayProxyFactory.getInstance().create(FileFolderReadService.class, config);
            OpenApiIdReq req = new OpenApiIdReq();
            req.setId("8635689170162671616");
            FileFolderDetail res = service.load(req);
            System.out.println(res);
            System.out.println(res.getFileFolderName());
        } catch (ApiException e) {
            //if invoke failed handle the exception
            System.out.println("invoke failed \nhttpStatusCode:" + e.getHttpStatusCode() + "\ncode:" + e.getCode() + "\nmessage:" + e.getMessage() + "\nhttpReasonPhrase:" + e.getHttpReasonPhrase());
        }

    }


}

package com.lianlian.osc.gateway.client.demo.service;

import com.lianlian.ew.open.request.FileInfoCreateReq;
import com.lianlian.ew.open.request.OpenApiIdReq;
import com.lianlian.ew.open.response.FileFolderDetail;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.ew.open.service.FileInfoWriteService;
import com.lianlian.osc.gateway.client.ApiException;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo for 'Delete File Info by File ID'
 * <p>
 * API doc: https://developer.lianlianglobal.com/docs/e-wallet-openapi/cf322db0b4838-delete-file-info-by-file-id
 *
 * @author xujs002
 */
public class FileFolderWriteServiceDeleteDemo implements Constants {


    public static void main(String[] args) {
        try {
            FileInfoWriteService service = GatewayProxyFactory.getInstance().create(FileInfoWriteService.class, config);
            OpenApiIdReq req = new OpenApiIdReq();
            req.setId("8637204253983105024");
            String res = service.delete(req);
            System.out.println(res);
        } catch (ApiException e) {
            //if invoke failed handle the exception
            System.err.println("invoke failed \nhttpStatusCode:" + e.getHttpStatusCode() + "\ncode:" + e.getCode() + "\nmessage:" + e.getMessage() + "\nhttpReasonPhrase:" + e.getHttpReasonPhrase());
        }

    }
}

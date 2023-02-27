package com.lianlian.osc.gateway.client.demo.service;

import com.lianlian.ew.open.request.FileInfoCreateReq;
import com.lianlian.ew.open.response.FileFolderDetail;
import com.lianlian.ew.open.response.RichOpenRes;
import com.lianlian.ew.open.service.FileInfoWriteService;
import com.lianlian.osc.gateway.client.ApiException;
import com.lianlian.osc.gateway.client.GatewayProxyFactory;
import com.lianlian.osc.gateway.client.demo.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo for 'Create File Info'
 * <p>
 * API doc: https://developer.lianlianglobal.com/docs/e-wallet-openapi/b9fd424c330fd-create-file-info
 *
 * @author xujs002
 */
public class FileFolderWriteServiceCreateDemo implements Constants {


    public static void main(String[] args) {
        try {
            FileInfoWriteService service = GatewayProxyFactory.getInstance().create(FileInfoWriteService.class, config);
            FileInfoCreateReq req = new FileInfoCreateReq();
            List<String> attIds = new ArrayList<>();
            attIds.add("8535689170155593728");
            req.setFileFolderName("TestFileName");
            req.setPurpose("PAYOUT");
            req.setFileIds(attIds);
            FileFolderDetail res = service.create(req);
            System.out.println(res);
            System.out.println(res.getFileFolderName());
        } catch (ApiException e) {
            //if invoke failed handle the exception
            System.err.println("invoke failed \nhttpStatusCode:" + e.getHttpStatusCode() + "\ncode:" + e.getCode() + "\nmessage:" + e.getMessage() + "\nhttpReasonPhrase:" + e.getHttpReasonPhrase());
        }

    }
}

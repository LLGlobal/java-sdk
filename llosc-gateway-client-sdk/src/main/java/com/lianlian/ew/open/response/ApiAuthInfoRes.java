package com.lianlian.ew.open.response;

import com.lianlian.ew.open.domain.ApiAuthInfoData;
import com.lianlian.ew.open.domain.SigningDataInfo;

import java.io.Serializable;

public class ApiAuthInfoRes implements Serializable {
    private static final long serialVersionUID = -3463521747682811071L;


    public ApiAuthInfoRes() {
    }

    public ApiAuthInfoRes(SigningDataInfo signingInfo, ApiAuthInfoData appAuthInfo) {
        this.signingInfo = signingInfo;
        this.appAuthInfo = appAuthInfo;
    }

    private SigningDataInfo signingInfo;

    private ApiAuthInfoData appAuthInfo;
}

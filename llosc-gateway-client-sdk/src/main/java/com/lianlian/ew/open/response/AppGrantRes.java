package com.lianlian.ew.open.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * APP授权返回结果
 *
 * @author xujs002
 */
@Getter
@Setter
@ToString
public class AppGrantRes implements Serializable {


    private static final long serialVersionUID = -7005890630267943868L;

    private String merchantClientId;

    private String grantUrl;

    private boolean grantComplete;

}

package com.lianlian.ew.open.response;

import com.lianlian.ew.open.domain.AdditionalInfo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
public class SigningUrlRes implements Serializable {


    private static final long serialVersionUID = -385099357080996088L;

    /**
     * 钱包侧联系人ID
     */
    private String id;


    /**
     * 合同编号
     */
    private String agreementNo;

    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 电商侧，店铺卖家标识，钱包联系人外部ID，钱包签约外部ID
     */
    private String merchantClientId;


    /**
     * 电商侧，店铺卖家名称
     */
    private String merchantClientName;

    /**
     * 注册签约地址
     */
    private String signingUrl;

    /**
     * 店铺地址
     */
    private String shopUrl;

    /**
     * 扩展信息
     */
    private List<AdditionalInfo> additionalInfo;

    /**
     * 注册时候完成
     */
    private boolean signingComplete;


}
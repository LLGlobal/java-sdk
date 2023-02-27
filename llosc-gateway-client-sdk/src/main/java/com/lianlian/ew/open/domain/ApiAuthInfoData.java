package com.lianlian.ew.open.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author xujs002
 */
@Getter
@Setter
@ToString
public class ApiAuthInfoData implements Serializable {

    private static final long serialVersionUID = -4272320233639974870L;

    /**
     * base url of api server
     */
    private String apiBaseUrl;

    /**
     * App client ID.
     */
    private String appClientId;


    /**
     * App name.
     */
    private String appName;


    /**
     * Token be used toaccess user's auth API.
     */
    private String accessToken;

    /**
     * Token be used to refresh access token.
     */
    private String refreshToken;


    /**
     * ID of this user .
     */
    private String userId;


}

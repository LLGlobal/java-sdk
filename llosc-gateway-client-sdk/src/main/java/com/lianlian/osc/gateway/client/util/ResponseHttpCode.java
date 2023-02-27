package com.lianlian.osc.gateway.client.util;

/**
 * GatewayConstants of response http code
 *
 * @author xujs002
 */
public interface ResponseHttpCode {

    /**
     * success
     */
    int OK = 200;

    /**
     * bad request
     */
    int BAD_REQUEST = 400;

    /**
     * unauthorized
     */
    int UNAUTHORIZED = 401;

    /**
     * data not found
     */
    int NOT_FOUND = 404;

    /**
     * not allowed
     */
    int METHOD_NOT_ALLOWED = 405;

    /**
     * internal server error
     */
    int INTERNAL_SERVER_ERROR = 500;
}

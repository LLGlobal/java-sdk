package com.lianlian.osc.gateway.client;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.lianlian.ew.open.request.AttachmentUploadReq;
import com.lianlian.osc.gateway.client.http.GatewayHttpInvoker;
import com.lianlian.osc.gateway.client.request.*;
import com.lianlian.osc.gateway.client.util.FltTemplateHolder;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Proxy implementation for Gateway clients.  Applications will generally
 * use GatewayProxyFactory to create proxy clients.
 *
 * @author xujs002
 */
public class GatewayProxy implements InvocationHandler, Serializable {

    private static final Logger log = Logger.getLogger(GatewayProxy.class.getName());


    private static final SerializeConfig serializeConfig = new SerializeConfig();

    static {
        serializeConfig.propertyNamingStrategy = PropertyNamingStrategy.SnakeCase;
    }


    private GatewayConfig _config;

    /**
     * Protected constructor for subclassing
     */
    protected GatewayProxy(GatewayConfig config) {
        _config = config;
    }


    /**
     * Returns the proxy's Config.
     */
    public GatewayConfig getConfig() {
        return _config;
    }

    /**
     * Handles the object invocation.
     *
     * @param proxy  the proxy object to invoke
     * @param method the method to call
     * @param args   the arguments to the proxy object
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        if (method.getReturnType().equals(Void.TYPE)) {
            return null;
        }
        if (!Object.class.equals(method.getDeclaringClass())) {
            return doApiCall(method, args);
        } else {
            return method.invoke(this, args);
        }
    }


    //private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");


    private Object doApiCall(Method method, Object[] args) throws IOException {
        RequestConfig requestConfig = method.getAnnotation(RequestConfig.class);
        String uri = requestConfig.uri();
        ApiMenthod apiMenthod = requestConfig.menthod();
        ApiUriType uriType = requestConfig.type();
        TypeReference reference = requestConfig.reference().getRef();
        String mothodName = method.getName();
        //fix url
        String realUri = this.getRealUri(mothodName, uri, uriType, args);
        String fullUri = this.getFullUri(realUri);
        String responseBody = null;
        String requestBody = null;
        if (args == null || args.length == 0) {

        } else if (args.length == 1) {
            requestBody = JSONObject.toJSONString(args[0], serializeConfig);
        } else {
            requestBody = JSONObject.toJSONString(args, serializeConfig);
        }
        //download
        if (ApiTypeReference.AttachmentReadService_download.equals(requestConfig.reference())) {
            return GatewayHttpInvoker.downLoad(fullUri, getAuthorizationType(), _config.getDeveloperId(), _config.getToken());
            //upload
        } else if (args != null && args.length == 1 && args[0] != null && args[0] instanceof AttachmentUploadReq) {
            AttachmentUploadReq req = (AttachmentUploadReq) args[0];
            responseBody = GatewayHttpInvoker.upload(fullUri, getAuthorizationType(), _config.getDeveloperId(), _config.getToken(), req);
            //nomal http invoke
        } else {
            responseBody = GatewayHttpInvoker.httpInvoke(fullUri, realUri, apiMenthod, requestBody, getAuthorizationType(), getTokenString(), _config.getPrivateKey(), _config.isNeedSign(), _config.isNeedVerifyResponse(), _config.getLianlianPublicKey());
        }

        if (method.getReturnType().equals(Void.TYPE)) {
//            System.out.println("VOID");
        } else if (method.getReturnType().equals(String.class)) {
            return responseBody;
        } else {
            Object a = JSONObject.parseObject(responseBody, reference);
            return a;
        }
        //header

        return responseBody;
    }

    private String getAuthorizationType() {
        return _config.getAuthorizationType().getType();
    }

    private String getTokenString() {
        if(ApiAuthorizationType.Basic.equals(_config.getAuthorizationType())){
            return Base64.getEncoder().encodeToString((_config.getDeveloperId() + ":" + _config.getToken()).getBytes());
        }else{
            return _config.getToken();
        }
    }


    private String getRealUri(String mothodName, String uri, ApiUriType uriType, Object[] args) {
        String realUri = null;
        if (ApiUriType.NORMAL.equals(uriType) || args == null) {//nomal uri
            return uri;
        } else {// reg uri
            Map<String, Object> params = new HashMap<>();
            if (args != null) {
                if (args.length == 1) {
                    realUri = FltTemplateHolder.getParsedString(mothodName, uri, args[0]);
                } else {
                    for (int i = 0; i < args.length; i++) {
                        params.put("arg" + i, args[i]);
                    }
                    realUri = FltTemplateHolder.getParsedString(mothodName, uri, params);
                }
            }
            return realUri;
        }
    }

    private String getFullUri(String realUri) {
        if (_config == null || _config.getUrl() == null) {
            //Exception
        }
        String serverUrl = _config.getUrl().trim();
        if (serverUrl.endsWith("/") || realUri.startsWith("/")) {
            return serverUrl + realUri;
        }
        return serverUrl + "/" + realUri;
    }

}


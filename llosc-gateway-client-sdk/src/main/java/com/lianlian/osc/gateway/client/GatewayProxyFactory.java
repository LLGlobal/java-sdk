package com.lianlian.osc.gateway.client;


import com.alibaba.fastjson.TypeReference;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.net.MalformedURLException;
import java.util.logging.Logger;

/**
 * API service proxy factory
 *
 * @author xujs002
 */
public class GatewayProxyFactory {
    protected static Logger log = Logger.getLogger(GatewayProxyFactory.class.getName());


    private static class SingletonHolder {
        private static final GatewayProxyFactory INSTANCE = new GatewayProxyFactory();
    }

    /**
     * singleton ConverterRegistry
     *
     * @return ConverterRegistry
     */
    public static GatewayProxyFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }


    private final ClassLoader _loader;


    /**
     * Creates the new proxy factory.
     */
    private GatewayProxyFactory() {
        this(Thread.currentThread().getContextClassLoader());
    }

    /**
     * Creates the new proxy factory.
     */
    private GatewayProxyFactory(ClassLoader loader) {
        _loader = loader;
    }


    /**
     * Creates a new proxy with the specified URL.  The returned object
     * is a proxy with the interface specified by api.
     *
     * <pre>
     * AccountWriteService accountWriteService = (AccountWriteService) factory.create(AccountWriteService.class, config ...);
     * </pre>
     *
     * @param api    the interface the proxy class needs to implement
     * @param config the GatewayConfig where the client object is located.
     * @return a proxy to the object with the specified interface.
     */
    public <T> T create(Class<T> api, GatewayConfig config) {
        return create(api, config, _loader);
    }


    /**
     * Creates a new proxy with the specified GatewayConfig.  The returned object
     * is a proxy with the interface specified by api.
     *
     * <pre>
     * AccountWriteService accountWriteService = (AccountWriteService) factory.create(AccountWriteService.class, config ...);
     * </pre>
     *
     * @param api    the interface the proxy class needs to implement
     * @param config the GatewayConfig where the client object is located.
     * @param loader the ClassLoader
     * @return a proxy to the object with the specified interface.
     */
    public <T> T create(Class<T> api, GatewayConfig config, ClassLoader loader) {
        if (api == null) {
            throw new NullPointerException("api must not be null for GatewayProxyFactory.create()");
        }
        if (config == null) {
            throw new NullPointerException("config must not be null for GatewayProxyFactory.create()");
        }
        //InvocationHandler handler = new GatewayProxy(config, this, api, typeReference);
        InvocationHandler handler = new GatewayProxy(config);
        return (T) Proxy.newProxyInstance(loader, new Class[]{api}, handler);
    }


}



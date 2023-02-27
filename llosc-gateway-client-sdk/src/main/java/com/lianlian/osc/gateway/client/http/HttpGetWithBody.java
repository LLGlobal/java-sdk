package com.lianlian.osc.gateway.client.http;

import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;

import java.net.URI;

/**
 * http get menthod allows with body
 */
public class HttpGetWithBody extends HttpEntityEnclosingRequestBase {

    public HttpGetWithBody(String uri) {
        super();
        setURI(URI.create(uri));
    }

    @Override
    public String getMethod() {
        return HttpGet.METHOD_NAME;
    }


}

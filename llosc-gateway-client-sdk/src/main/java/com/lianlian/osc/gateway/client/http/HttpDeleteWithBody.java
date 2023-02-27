package com.lianlian.osc.gateway.client.http;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;

import java.net.URI;

public class HttpDeleteWithBody extends HttpEntityEnclosingRequestBase {

    public HttpDeleteWithBody(String uri) {
        super();
        setURI(URI.create(uri));
    }

    @Override
    public String getMethod() {
        return HttpDelete.METHOD_NAME;
    }


}
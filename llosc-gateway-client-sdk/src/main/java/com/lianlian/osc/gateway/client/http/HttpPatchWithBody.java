package com.lianlian.osc.gateway.client.http;

import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpPatch;

import java.net.URI;

public class HttpPatchWithBody extends HttpEntityEnclosingRequestBase {

    public HttpPatchWithBody(String uri) {
        super();
        setURI(URI.create(uri));
    }

    @Override
    public String getMethod() {
        return HttpPatch.METHOD_NAME;
    }


}

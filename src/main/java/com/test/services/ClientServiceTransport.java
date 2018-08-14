package com.test.services;


import com.transport.lib.common.ApiClient;
import com.transport.lib.common.RequestInterface;

@ApiClient
public interface ClientServiceTransport {

    public RequestInterface<Void> lol3(String message);

    public RequestInterface<Void> lol4(String message);
}


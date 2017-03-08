package com.softgroup.common.router.impl;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractHandlerFactory;
import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.common.router.api.Handler;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by polev on 04.03.2017.
 */
public class MainRouterHandler implements Handler{

    public String getName() {
        return "main handler";
    }
    @Autowired
    AbstractHandlerFactory<AbstractRouterHandler> routerHandlerFactory; //whyy

    public Response<?> handle(Request<?> msg) {
        return routerHandlerFactory.getHandler(msg).handle(msg);
    }
}

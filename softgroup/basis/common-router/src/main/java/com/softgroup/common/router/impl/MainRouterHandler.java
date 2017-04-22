package com.softgroup.common.router.impl;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.*;
import com.softgroup.common.router.api.factory.HandlerFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by polev on 04.03.2017.
 */
@Component
public class MainRouterHandler implements Handler{

    public String getName() {
        return "main_handler";
    }

    @Autowired
    HandlerFactoryImpl<AbstractRouterHandler> routerHandlerFactory;

    @Override
    public Response<?> handle(Request<?> msg) {
        return routerHandlerFactory.getHandler(msg).handle(msg);
    }

}

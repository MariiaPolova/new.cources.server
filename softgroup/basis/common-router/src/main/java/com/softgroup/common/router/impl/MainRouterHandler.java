package com.softgroup.common.router.impl;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.*;
import com.softgroup.common.router.api.factory.HandlerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by polev on 04.03.2017.
 */
@Component
public class MainRouterHandler extends AbstractRouterHandler implements Handler{

    public String getName() {
        return "main_handler";
    }

}

package com.softgroup.common.router.api.factory;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.common.router.api.CommonRouterHandler;
import org.springframework.stereotype.Component;

/**
 * Created by polev on 15.03.2017.
 */
@Component
public class MainRouterFactory <T extends CommonRouterHandler> extends HandlerFactory<T>{

    @Override
    public String getCommand(Request<?> msg) {
        return msg.getHeader().getCommand();
    }
}

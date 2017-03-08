package com.softgroup.common.router.api.factory;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.common.router.api.RouterHandler;
import org.springframework.stereotype.Component;

/**
 * Created by polev on 02.03.2017.
 */
@Component
public class RouterHandlerFactory <T extends AbstractRouterHandler> extends HandlerFactory<T> {
    @Override
    public String getCommand(Request<?> msg) {
        return msg.getHeader().getType();
    }
}

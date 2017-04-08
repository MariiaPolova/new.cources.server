package com.softgroup.common.router.api.factory;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.AbstractRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by polev on 02.03.2017.
 */
@Component
public class RequestHandlerFactory <T extends AbstractRequestHandler> extends HandlerFactoryImpl<T> {

    public String getCommand(Request<?> msg) {
        return msg.getHeader().getCommand();
    }
}

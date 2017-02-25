package com.softgroup.authorization.impl.handler;

import com.softgroup.authorization.api.router.AuthorizationRouterHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import org.springframework.stereotype.Component;

/**
 * Created by polev on 25.02.2017.
 */

@Component
public class AuthorizationRouterHandlerLogin implements AuthorizationRouterHandler {
    public String getRouteKey(Request<?> msg) {
        return null;
    }

    public String getName() {
        return "login";
    }

    public Response<?> handle(Request<?> msg) {
        return null;
    }
}

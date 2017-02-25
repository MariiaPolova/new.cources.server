package com.softgroup.authorization.api.router;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;

/**
 * Created by polev on 25.02.2017.
 */
public class AuthorizationRouter extends HandleRouter<AuthorizationRouterHandler> {
    public String getRouteKey(Request<?> msg) {
        return null; //  what for??
    }

    public String getName() {
        return "authorization";
    }

    public Response<?> handle(Request<?> msg) {
        return null;
    }
}

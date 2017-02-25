package com.softgroup.authorization.api.router;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.RouterHandler;

/**
 * Created by polev on 25.02.2017.
 */
public class AuthorizationRouterHandlerSmsmConfirm implements RouterHandler {
    public String getRouteKey(Request<?> msg) {
        return null;
    }

    public String getName() {
        return "sms_confirm";
    }

    public Response<?> handle(Request<?> msg) {
        return null;
    }
}

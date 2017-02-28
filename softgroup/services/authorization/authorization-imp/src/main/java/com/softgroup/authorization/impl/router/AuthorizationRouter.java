package com.softgroup.authorization.impl.router;

import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.authorization.api.router.AuthorizationRouterHandler;
import com.softgroup.common.router.api.AbstractRouterHandler;
import org.springframework.stereotype.Component;

/**
 * Created by polev on 24.02.2017.
 */
@Component
public class AuthorizationRouter extends AbstractRouterHandler<AuthorizationRequestHandler>
        implements AuthorizationRouterHandler {
    @Override
    public String getName() {
        return "authorization";
    }
}

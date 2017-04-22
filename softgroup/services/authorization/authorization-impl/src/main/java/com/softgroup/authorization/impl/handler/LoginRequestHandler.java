package com.softgroup.authorization.impl.handler;

import com.softgroup.authorization.api.message.LoginRequest;
import com.softgroup.authorization.api.message.LoginResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.*;
import com.softgroup.common.router.api.AbstractRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by polev on 25.02.2017.
 */

@Component
public class LoginRequestHandler
        extends AbstractRequestHandler<LoginRequest, LoginResponse>
        implements AuthorizationRequestHandler {

    @Override
    public String getName() {
        return "login";
    }

    @Override
    public Response<LoginResponse> doHandle(Request<LoginRequest> requestObj) {

        Response<LoginResponse> response = new Response<>();
        response.setHeader(requestObj.getHeader());

        ResponseStatus status = new ResponseStatus();
        status.setCode(HTTPStatusCode.NOT_IMPLEMENTED.getId());
        status.setMessage(HTTPStatusCode.NOT_IMPLEMENTED.getStr());

        response.setStatus(status);
        return response;
    }
}

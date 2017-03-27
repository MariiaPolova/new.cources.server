package com.softgroup.authorization.impl.handler;

import com.softgroup.authorization.api.message.LoginRequest;
import com.softgroup.authorization.api.message.LoginResponse;
import com.softgroup.authorization.api.message.RegisterRequest;
import com.softgroup.authorization.api.message.RegisterResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseStatus;
import com.softgroup.common.router.api.AbstractRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by polev on 25.02.2017.
 */

@Component
public class RegisterRequestHandler
        extends AbstractRequestHandler<RegisterRequest, RegisterResponse>
        implements AuthorizationRequestHandler {

    @Override
    public String getName() {
        return "register";
    }

    @Override
    public Response<RegisterResponse> doHandle(Request<RegisterRequest> requestObj) {
        RegisterRequest requestData = requestObj.getData();
        RegisterResponse regResponse = new RegisterResponse();
        regResponse.setAuthCode("111");
        regResponse.setRegistrationRequestUuid("uiiii");
        regResponse.setRegistrationTimeoutSec("-1");

        Response<RegisterResponse> response = new Response<>();
        response.setHeader(requestObj.getHeader());
        response.setData(regResponse);

        ResponseStatus status = new ResponseStatus();
        status.setCode(200);
        status.setMessage("OK");

        response.setStatus(status);
        return response;
    }
}
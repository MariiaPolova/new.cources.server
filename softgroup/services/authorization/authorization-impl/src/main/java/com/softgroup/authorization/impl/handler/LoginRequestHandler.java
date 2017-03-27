package com.softgroup.authorization.impl.handler;

import com.softgroup.authorization.api.message.LoginRequest;
import com.softgroup.authorization.api.message.LoginResponse;
import com.softgroup.authorization.api.message.SmsConfirmResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.ActionHeader;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseStatus;
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

        LoginRequest requestData = requestObj.getData();
        LoginResponse loginResponse = new LoginResponse();
       // loginResponse.setToken(requestData.getDeviceToken());
        loginResponse.setToken("login_token");
        Response<LoginResponse> response = new Response<>();
        response.setHeader(requestObj.getHeader());
        response.setData(loginResponse);

        ResponseStatus status = new ResponseStatus();
        status.setCode(200);
        status.setMessage("OK");

        response.setStatus(status);
        return response;
    }
}

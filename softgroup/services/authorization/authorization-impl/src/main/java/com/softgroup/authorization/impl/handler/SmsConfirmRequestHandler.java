package com.softgroup.authorization.impl.handler;

import com.softgroup.authorization.api.message.LoginResponse;
import com.softgroup.authorization.api.message.SmsConfirmRequest;
import com.softgroup.authorization.api.message.SmsConfirmResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseStatus;
import com.softgroup.common.protocol.Status;
import com.softgroup.common.router.api.AbstractRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by polev on 25.02.2017.
 */

@Component
public class SmsConfirmRequestHandler
        extends AbstractRequestHandler<SmsConfirmRequest, SmsConfirmResponse>
        implements AuthorizationRequestHandler {

    @Override
    public String getName() {
        return "sms_confirm";
    }

    @Override
    public Response<SmsConfirmResponse> doHandle(Request<SmsConfirmRequest> requestObj) {
        Response<SmsConfirmResponse> response = new Response<>();
        response.setHeader(requestObj.getHeader());
        response.setData(null);

        ResponseStatus status = new ResponseStatus();
        status.setCode(Status.not_implemented.getId());
        status.setMessage(Status.not_implemented.toString());

        response.setStatus(status);
        return response;
    }
}

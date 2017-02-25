package handler;

import com.softgroup.authorization.api.message.SmsConfirmRequest;
import com.softgroup.authorization.api.message.SmsConfirmResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.common.router.api.RouterHandler;
import org.springframework.stereotype.Component;

/**
 * Created by polev on 25.02.2017.
 */

@Component
public class AuthorizationRequestSmsConfirmHandler
        extends AbstractRequestHandler<SmsConfirmRequest, SmsConfirmResponse>
        implements AuthorizationRequestHandler {

    public String getName() {
        return "sms_confirm";
    }

    public Response<SmsConfirmResponse> doHandle(Request<?> requestObj) {
        return null;
    }
}

package com.softgroup.authorization.api.message;

import com.softgroup.common.protocol.RequestData;

/**
 * Created by polev on 24.02.2017.
 */
public class SmsConfirmRequest implements RequestData {

    private String registrationRequestUuid;
    private String authCode;

    public String getRegistrationRequestUuid() {
        return registrationRequestUuid;
    }

    public void setRegistrationRequestUuid(String registrationRequestUuid) {
        this.registrationRequestUuid = registrationRequestUuid;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }
}

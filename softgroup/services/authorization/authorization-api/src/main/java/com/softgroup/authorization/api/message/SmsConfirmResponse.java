package com.softgroup.authorization.api.message;

import com.softgroup.common.protocol.ResponseData;

/**
 * Created by polev on 24.02.2017.
 */
public class SmsConfirmResponse implements ResponseData  {

    private String deviceToken;

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }
}

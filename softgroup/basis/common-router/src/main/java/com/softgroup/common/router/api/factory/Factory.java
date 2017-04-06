package com.softgroup.common.router.api.factory;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;

/**
 * Created by polev on 06.04.2017.
 */
public interface Factory<T extends Handler> {

     String getCommand(Request<?> msg);

    T getHandler(Request<?> msg);
}

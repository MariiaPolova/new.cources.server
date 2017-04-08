package com.softgroup.common.router.api.factory;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;

/**
 * Created by polev on 07.04.2017.
 */
public interface HandlerFactory<T extends Handler> {

    T getHandler(Request<?> msg);
}

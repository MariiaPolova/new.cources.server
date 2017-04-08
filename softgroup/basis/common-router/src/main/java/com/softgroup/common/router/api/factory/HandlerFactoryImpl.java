package com.softgroup.common.router.api.factory;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by polev on 15.03.2017.
 */

public abstract class HandlerFactoryImpl<T extends Handler> implements HandlerFactory<T> {

    private Map<String, T> handlerMap = new HashMap<>();

    @Autowired
    private List<T> handlers;

    @PostConstruct
    public void init(){
        for(T handler : handlers) {
            handlerMap.put(handler.getName(), handler);
        }
    }

    public abstract String getCommand(Request<?> msg);

    public T getHandler(Request<?> msg) {
        String command = getCommand(msg);
        return handlerMap.get(command);
    }

}
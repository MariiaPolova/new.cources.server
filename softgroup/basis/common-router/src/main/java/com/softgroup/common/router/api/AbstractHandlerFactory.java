package com.softgroup.common.router.api;

import com.softgroup.common.protocol.Request;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by polev on 02.03.2017.
 */
public abstract class AbstractHandlerFactory<T extends Handler> {

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

package com.softgroup.authorization.impl.router;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.Handler;
import com.softgroup.common.router.api.RouterHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by polev on 24.02.2017.
 */
@Component
public class AuthorizationRouter<T extends RouterHandler> implements RouterHandler {

    private Map<String, T> handlerMap;

    @Autowired
    private List<T> handlers;

    @PostConstruct
    public void init(){
        for(T handler : handlers)
            handlerMap.put(handler.getName(), handler);
    }

    public String getName() {
        return null;
    }

    public Response<?> handle(Request<?> msg) {
        String command = msg.getHeader().getCommand();
        return handlerMap.get(command).handle(msg);
    }

    public String getRouteKey(Request<?> msg) {
        return null;
    }
}

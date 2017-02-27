package com.softgroup.common.router.api;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractRouterHandler<T extends Handler> implements RouterHandler {

	private Map<String, T> handlerMap = new HashMap();

	@Autowired
	private List<T> handlers;

	@PostConstruct
	public void init(){
		for(T handler : handlers) {
			handlerMap.put(handler.getName(), handler);
		}
	}

	public String getName() {
		return null;
	}

	public Response<?> handle(Request<?> msg) {
		//String command = msg.getHeader().getCommand();
		return handlerMap.get(getRouteKey(msg)).handle(msg);
	}

	public String getRouteKey(Request<?> msg) {
		return msg.getHeader().getCommand();
	}

}

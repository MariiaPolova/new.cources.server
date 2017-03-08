package com.softgroup.common.router.api;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.factory.RouterHandlerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractRouterHandler<T extends RouterHandler>
		extends RouterHandlerFactory<T> implements RouterHandler {

	@Autowired
	private AbstractHandlerFactory  requestHandlerFactory;

	public AbstractHandlerFactory getHandlers() {
		return requestHandlerFactory;
	}

	public Response<?> handle(Request<?> msg) {
		Handler handler = getHandlers().getHandler(msg);
		return handler.handle(msg);
	}

	public String getRouteKey(Request<?> msg) {
		return msg.getHeader().getCommand();
	}

}

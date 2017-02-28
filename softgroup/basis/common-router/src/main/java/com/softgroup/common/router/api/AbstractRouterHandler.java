package com.softgroup.common.router.api;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.factory.HandlerFactory;
import com.softgroup.common.router.api.factory.RouterHandlerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractRouterHandler<T extends AbstractRequestHandler> implements RouterHandler,
		CommonRouterHandler  {

	@Autowired
	private HandlerFactory<T> requestHandlerFactory;

	@Override
	public Response<?> handle(Request<?> msg) {
		Handler handler = requestHandlerFactory.getHandler(msg);
		return handler.handle(msg);
	}


}

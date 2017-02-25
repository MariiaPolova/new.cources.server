package com.softgroup.common.router.api;


import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.RequestData;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseData;

public abstract class AbstractRequestHandler<T extends RequestData, R extends ResponseData>
		implements RequestHandler {
//	@Override
//	public String getName() {
//		return null;
//	}

	@Override
	public Response<R> handle(Request<?> msg) {
		Request<T> requestObj = new Request<T>();
		requestObj.setHeader(msg.getHeader());

		//requestObj is created after Jackson mapper conversion
		return doHandle(requestObj);
	}

	public abstract Response<R> doHandle(Request<?> requestObj);

}

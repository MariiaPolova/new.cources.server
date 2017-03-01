package com.softgroup.common.router.api;


import com.softgroup.common.datamapper.JacksonDataMapper;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.RequestData;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseData;

import java.lang.reflect.ParameterizedType;
import java.util.Map;

public abstract class AbstractRequestHandler<T extends RequestData, R extends ResponseData> implements RequestHandler {

	private JacksonDataMapper dataMapper;

	@Override
	public Response<R> handle(Request<?> msg) {
		Request<T> requestObj = new Request<T>();
		requestObj.setHeader(msg.getHeader());


		Class<T> persistentClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass())
						.getActualTypeArguments()[0];
		T object = dataMapper.convert((Map<String, Object>)msg.getData(), persistentClass);
		requestObj.setData(object);

		return doHandle(requestObj);
	}

	public abstract String getName();

	public abstract Response<R> doHandle(Request<T> requestObj);

}

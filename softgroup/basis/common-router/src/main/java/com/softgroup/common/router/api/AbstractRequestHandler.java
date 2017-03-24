package com.softgroup.common.router.api;


import com.softgroup.common.datamapper.DataMapper;
import com.softgroup.common.datamapper.JacksonDataMapper;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.RequestData;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseData;
import com.softgroup.common.router.api.factory.RequestHandlerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.util.Map;

public abstract class AbstractRequestHandler<T extends RequestData, R extends ResponseData>
		implements RequestHandler {

	@Autowired
	private DataMapper jacksonDataMapper;

	private final Class<T> persistentClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass())
			.getActualTypeArguments()[0];

	@Override
	public Response<R> handle(Request<?> msg) {
		Request<T> requestObj = new Request<>();
		requestObj.setHeader(msg.getHeader());

		T object = jacksonDataMapper.convert((Map<String, Object>)msg.getData(), persistentClass);
		requestObj.setData(object);

		return doHandle(requestObj);
	}

	public abstract Response<R> doHandle(Request<T> requestObj);

}

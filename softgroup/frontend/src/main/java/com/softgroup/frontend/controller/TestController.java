package com.softgroup.frontend.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.softgroup.common.datamapper.DataMapper;
import com.softgroup.common.datamapper.JacksonDataMapper;
import com.softgroup.common.protocol.CommonRequest;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;
import com.softgroup.common.router.impl.MainRouterHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;

/**
 * Created by polev on 05.03.2017.
 */
@RestController
@RequestMapping(path = "/test", method = RequestMethod.GET)
public class TestController {

    @Autowired
    Handler mainRouterHandler;

    @Autowired
    DataMapper jacksonDataMapper;

    @RequestMapping(path = "/route", method = RequestMethod.POST)
    public String handleRequest(@RequestBody String body){
        CommonRequest msg = jacksonDataMapper.mapData(body.getBytes(StandardCharsets.UTF_8),
                CommonRequest.class);
        return jacksonDataMapper.objectToString(mainRouterHandler.handle(msg));

    }

    @RequestMapping(path = "/str")
    public String testRequest() {
        return "test";
    }

}

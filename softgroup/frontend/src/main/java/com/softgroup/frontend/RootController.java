package com.softgroup.frontend;

import com.softgroup.common.datamapper.JacksonDataMapper;
import com.softgroup.common.protocol.Request;
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
@RequestMapping(path = "/root",
        method = RequestMethod.POST)
public class RootController {
    @Autowired
    MainRouterHandler dispatcher;

    @Autowired
    JacksonDataMapper dataMapper;

    @RequestMapping(path = "/router")
    public String publicMessage(@RequestBody final String requestStr) {
        Request request = dataMapper.mapData(requestStr.getBytes(StandardCharsets.UTF_8),
                Request.class);
        return dataMapper.dataToString(dispatcher.handle(request));
    }
}

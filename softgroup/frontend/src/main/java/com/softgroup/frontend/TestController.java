package com.softgroup.frontend;

import com.softgroup.common.router.impl.MainRouterHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by polev on 05.03.2017.
 */
@RestController
@RequestMapping(path = "/test",method= RequestMethod.GET)
public class TestController {

    @Autowired
    MainRouterHandler router;
    @RequestMapping(path = "/str")
    public String testMessage() {
        return "test";
    }
}

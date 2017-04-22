package com.softgroup.frontend.configuration;

import com.softgroup.authorization.impl.configuration.AuthorizationImplConfig;
import com.softgroup.common.datamapper.configuration.DataMapperAppCfg;
import com.softgroup.common.router.configuration.CommonRouterConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by polev on 06.03.2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.softgroup.frontend.controller",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Configuration.class))
public class AppConfiguration extends WebMvcConfigurerAdapter {

}

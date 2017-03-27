package com.softgroup.frontend.configuration;

import com.softgroup.authorization.impl.configuration.AuthorizationImplConfig;
import com.softgroup.common.datamapper.configuration.DataMapperAppCfg;
import com.softgroup.common.router.configuration.CommonRouterConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;

/**
 * Created by polev on 10.03.2017.
 */

@Configuration
@ComponentScan(basePackages = "com.softgroup.frontend",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Configuration.class))
@Import(value = {
        DataMapperAppCfg.class,
        AuthorizationImplConfig.class,
        CommonRouterConfig.class})
public class RestConfiguration {
}

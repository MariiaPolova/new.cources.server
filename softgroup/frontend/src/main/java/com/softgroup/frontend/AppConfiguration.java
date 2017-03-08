package com.softgroup.frontend;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by polev on 06.03.2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.softgroup")
public class AppConfiguration extends WebMvcConfigurerAdapter {

}

package com.miao.springboot.configFile;

import com.miao.springboot.controller.filter.MyPFilter;
import com.miao.springboot.controller.servlet.SomeXmlServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //当前类为 config类  相当于spring容器
public class MyApplicationContext {
    @Bean
    public ServletRegistrationBean<SomeXmlServlet> getServletBean() {
        SomeXmlServlet ss = new SomeXmlServlet();
        //注册servlet
        return new ServletRegistrationBean<>(ss, "/someXmlServlet");
    }

    @Bean
    public FilterRegistrationBean<MyPFilter> getFilterBean() {
        MyPFilter ss = new MyPFilter();
        //注册servlet
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean<>(ss);
        filterRegistrationBean.addUrlPatterns("/mybaitsController/*");
        return filterRegistrationBean;
    }
}

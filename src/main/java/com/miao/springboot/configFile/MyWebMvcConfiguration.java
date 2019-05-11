package com.miao.springboot.configFile;

import com.miao.springboot.interceptor.SomeInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
@Configuration  //当前类为 config类  相当于spring容器
public class MyWebMvcConfiguration extends WebMvcConfigurationSupport {
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        SomeInterceptor sm = new SomeInterceptor();
        registry.addInterceptor(sm).addPathPatterns("/redisController/**").excludePathPatterns("/mybaitsController/**");

    }
}

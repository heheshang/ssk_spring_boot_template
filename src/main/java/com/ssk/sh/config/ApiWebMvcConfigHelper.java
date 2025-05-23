package com.ssk.sh.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

/**
 * @author : T0130063
 * @subject : WebMvcConfigHelper.java
 * @description :
 * <p>
 * WebMvcConfigHelper
 * </p>
 * @date : 2024/4/25 8:35 ------------------- History -------------------
 * <date> <author> <description>
 * 2024/4/25 T0130063 Initial creation -----------------------------------------------
 */
@Slf4j
public class ApiWebMvcConfigHelper {

    /**
     * 重构 InterceptorRegistry
     *
     * @param registry           InterceptorRegistry
     * @param handlerInterceptor HandlerInterceptor
     */
    public static void rebuildInterceptorRegistry(InterceptorRegistry registry,
            HandlerInterceptor handlerInterceptor) {
        registry.addInterceptor(handlerInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/check-health")
                .excludePathPatterns("/doc/**")
                .excludePathPatterns("/error/**");
    }

    /**
     * 重构 ResourceHandlerRegistry
     *
     * @param registry ResourceHandlerRegistry
     */
    public static void rebuildResourceHandlerRegistry(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/doc/swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("doc.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}

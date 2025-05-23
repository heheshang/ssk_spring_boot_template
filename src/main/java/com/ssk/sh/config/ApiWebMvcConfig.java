package com.ssk.sh.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author : T0130063
 * @subject : ApiWebMvcConfig.java
 * @description :
 * <p>
 * ApiWebMvcConfig
 * </p>
 * @date : 2024/4/23 15:40 ------------------- History -------------------
 * <date> <author> <description>
 * 2024/4/23 T0130063 Initial creation -----------------------------------------------
 */
@Configuration
public class ApiWebMvcConfig implements WebMvcConfigurer {

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // 按顺序执行拦截
//        ApiWebMvcConfigHelper.rebuildInterceptorRegistry(registry);
//        ApiWebMvcConfigHelper.rebuildInterceptorRegistry(registry);
//    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        ApiWebMvcConfigHelper.rebuildResourceHandlerRegistry(registry);
    }
}

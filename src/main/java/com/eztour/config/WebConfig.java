package com.eztour.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        int cacheMaxAge = 5 * 60;
        registry
                .addResourceHandler("/css/**")
                .addResourceLocations("classpath:/static/css/")
                .setCacheControl(CacheControl.maxAge(cacheMaxAge, TimeUnit.SECONDS)
                        .mustRevalidate());
        registry
                .addResourceHandler("/pics/**")
                .addResourceLocations("classpath:/static/pics/")
                .setCacheControl(CacheControl.maxAge(cacheMaxAge, TimeUnit.SECONDS)
                        .mustRevalidate());

    }
}

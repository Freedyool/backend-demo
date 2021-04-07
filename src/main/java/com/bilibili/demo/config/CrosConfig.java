package com.bilibili.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author :U-ain't
 * @version :$
 * @date :Created in 2021/3/30 2:07
 * @description :配置跨域问题
 * @modified By :
 */
@Configuration
public class CrosConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowCredentials(false).allowedMethods("POST", "GET", "PUT", "OPTION", "DELETE").allowedOrigins("*");
            }
        };
    }

}

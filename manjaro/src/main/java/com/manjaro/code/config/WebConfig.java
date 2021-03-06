package com.manjaro.code.config;

import com.manjaro.code.filter.JacksonManualHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * created by iriwen on 2020/10/20.
 */


@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
   /* MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setJsonPrefix("aaa>>>");
        return converter;
    }*/
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        JacksonManualHttpMessageConverter jacksonMessageConverter = new JacksonManualHttpMessageConverter();
        //jacksonMessageConverter.setJsonPrefix("aaa>>>");
        return jacksonMessageConverter;

    }
}


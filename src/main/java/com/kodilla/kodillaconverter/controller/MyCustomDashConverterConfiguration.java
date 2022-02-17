package com.kodilla.kodillaconverter.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Component;

@Component
public class MyCustomDashConverterConfiguration {
    @Bean
    public HttpMessageConverter<Object> createMyCustomDashConverterBean(){
        return new MyCustomDashConverter();
    }
}

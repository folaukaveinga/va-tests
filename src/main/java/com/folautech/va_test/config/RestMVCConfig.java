package com.folautech.va_test.config;

import com.folautech.va_test.utils.HttpRequestInterceptor;
import com.folautech.va_test.utils.HttpResponseErrorHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestMVCConfig {

    @Value("${resttemplate.timeout:100000}")
    private int restTemplateTimeout;


    @Bean
    public RestTemplate getRestTemplate() {
        final SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(restTemplateTimeout);
        requestFactory.setReadTimeout(restTemplateTimeout);
        RestTemplate restTemplate = new RestTemplate(new BufferingClientHttpRequestFactory(requestFactory));
        restTemplate.getInterceptors().add(new HttpRequestInterceptor());
        restTemplate.setErrorHandler(new HttpResponseErrorHandler());
        return restTemplate;
    }


}

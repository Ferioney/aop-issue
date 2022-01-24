package com.example.issue.aopissue.aspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class AspectConfig {

    @Bean
    public TestAspect testAspect() {
        return new TestAspect();
    }
}

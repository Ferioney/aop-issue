package com.example.issue.aopissue.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class IssueConfiguration {

    @Bean
    @ConditionalOnProperty(value = "class.implementation.enabled", havingValue = "true")
    public Supplier<String> testService() {
        return new TestSupplierService();
    }

    @Bean
    @ConditionalOnProperty(value = "class.implementation.enabled", havingValue = "false")
    public Supplier<String> stringSupplier() {
        return () -> "lambda supplier value";
    }
}

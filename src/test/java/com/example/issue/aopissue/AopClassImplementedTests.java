package com.example.issue.aopissue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(properties = "class.implementation.enabled=true")
class AopClassImplementedTests {

    @Autowired
    private Supplier<String> stringSupplier;

    @Test
    void test() {
        assertThat(stringSupplier.get()).isEqualTo("class supplier value");
    }
}

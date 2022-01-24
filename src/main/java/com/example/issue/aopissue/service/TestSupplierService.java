package com.example.issue.aopissue.service;

import java.util.function.Supplier;


public class TestSupplierService implements Supplier<String> {

    @Override
    public String get() {
        return "class supplier value";
    }
}

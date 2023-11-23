package com.zqc.pattern.builder.general;

import lombok.Data;

@Data
public class Product {
    private String name;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}

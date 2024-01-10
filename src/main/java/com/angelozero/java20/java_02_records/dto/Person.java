package com.angelozero.java20.java_02_records.dto;

public class Person {

    public Person(String name) {
        this.name = name;
    }

    private final String name;

    public String getName() {
        return name;
    }
}

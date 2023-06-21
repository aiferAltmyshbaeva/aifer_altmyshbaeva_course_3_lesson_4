package com.example.c3lesson4hw4.entity;

import java.io.Serializable;

public class Country implements Serializable {
    private String name;
    private String flag;

    public Country(String name, String flag) {
        this.name = name;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public String getFlag() {
        return flag;
    }
}

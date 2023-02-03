package com.ruavsva.spring;

import org.springframework.stereotype.Component;

public class Dog implements Pet{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(){
        System.out.println("Dog bean is created");

    }

    @Override
    public void Say() {
        System.out.println("Bow-Wow");
    }
}

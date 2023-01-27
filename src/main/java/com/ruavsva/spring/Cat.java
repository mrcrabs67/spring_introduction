package com.ruavsva.spring;

public class Cat implements Pet{
    public Cat(){
        System.out.println("Cat bean is created");
    }
    @Override
    public void Say() {
        System.out.println("Meow-Meow");
    }
}

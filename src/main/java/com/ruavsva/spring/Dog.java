package com.ruavsva.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
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

//    @PostConstruct
//    protected void init() {
//        System.out.println("Class dog: init");
//    }
//
//    @PreDestroy
//    protected void destroy(){
//        System.out.println("Class dog: destroy");
//    }

}

package com.ruavsva.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = context.getBean("dog", Dog.class);
        myDog.Say();
//        Dog yourDog = context.getBean("dog", Dog.class);

//        System.out.println("Переменные ссылаются на один объект? "+ (myDog==yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);
        context.close();

    }
}


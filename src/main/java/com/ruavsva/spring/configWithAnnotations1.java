package com.ruavsva.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class configWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

//        Cat myCat = context.getBean("cat", Cat.class);
//        myCat.Say();
        Person person = context.getBean("personBean", Person.class);
        person.CallYourPet();

        context.close();
    }
}

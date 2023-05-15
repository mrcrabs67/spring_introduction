package com.ruavsva.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
         AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

         Person person = context.getBean("personBean", Person.class);
         person.CallYourPet();
//        Pet cat1 = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        cat1.Say();

         context.close();
    }
}

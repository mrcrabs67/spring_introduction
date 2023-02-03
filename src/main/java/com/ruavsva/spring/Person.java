package com.ruavsva.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    //@Autowired
    //@Qualifier("dog")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: Set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: Set age");
        this.age = age;
    }
    @Autowired
//    @Qualifier("cat")
    public Person(@Qualifier("dog") Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }


//    public Person(){
//        System.out.println("Person bean is created");
//    }
    //pet ->setPet
//    @Autowired
//    @Qualifier("cat")
    public void setPet(Pet pet){
        System.out.println("Class person: set Pet");
        this.pet = pet;
    }

    public void CallYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.Say();
    }
}

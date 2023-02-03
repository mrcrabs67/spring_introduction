package com.ruavsva.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Pet pet;
    private String surname;
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
        public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }


//    public Person(){
//        System.out.println("Person bean is created");
//    }
    //pet ->setPet
    public void setPet(Pet pet){
        System.out.println("Class person: set Pet");
        this.pet = pet;
    }

    public void CallYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.Say();
    }
}

package spring.config.purejava.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Person {

    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Person(Pet pet) {
        this.pet = pet;
    }

//    public void setPet(Pet pet) {
//        this.pet = pet;
//    }
//
//    public void setSurname(String surname) { this.surname = surname; }
//
//    public void setAge(int age) { this.age = age; }

    public void say() {
        System.out.println("Hi, my name is " + surname + ", my age is " + age);
        pet.say();
    }

}

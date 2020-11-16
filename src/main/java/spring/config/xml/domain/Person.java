package spring.config.xml.domain;

public class Person {

    private Pet pet;
    private String surname;
    private int age;

//    public Person(Pet pet) {
//        this.pet = pet;
//    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setSurname(String surname) { this.surname = surname; }

    public void setAge(int age) { this.age = age; }

    public void say() {
        System.out.println("Hi, my name is " + surname + ", my age is " + age);
        pet.say();
    }

}

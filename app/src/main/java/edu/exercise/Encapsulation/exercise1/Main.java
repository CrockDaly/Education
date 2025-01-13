package edu.exercise.Encapsulation.exercise1;


public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(22);
        person.setCountry("Canada");

        System.out.println("Name: " + person.getName() + ", age: " + person.getAge() + ", country: " + person.getCountry());

    }
}

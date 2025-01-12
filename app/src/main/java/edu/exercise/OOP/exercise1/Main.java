package edu.exercise.OOP.exercise1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Vasya", 14);
        Person person2 = new Person("Kolya", 18);

        System.out.println("Name: " + person1.getName() +", Age: " + person1.getAge());
        System.out.println("Name: " + person2.getName() +", Age: " + person2.getAge());

        person1.setAge(25);
        person1.setName("Vasya Pupkin");
        person2.setAge(22);
        person2.setName("Kolya Pupkin");

        System.out.println("\nSet new age and name: ");
        System.out.println("New name is: " + person1.getName() +", New age is: " + person1.getAge());
        System.out.println("New name is: " + person2.getName() +", New age is: " + person2.getAge());
    }
}

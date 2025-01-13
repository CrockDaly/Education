package edu.exercise.Constructor.exercise2;

public class Dog {
    private String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static  void main(String[] args) {
        Dog dog = new Dog("Buddy", "Brown");
        System.out.println("Dog name is: " + dog.name + "\nColor is: " + dog.color);
    }
}

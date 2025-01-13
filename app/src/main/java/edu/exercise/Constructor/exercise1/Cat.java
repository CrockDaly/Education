package edu.exercise.Constructor.exercise1;

public class Cat {
    private String name;
    private int age;

    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("Сat's Name: " + cat.getName() + "\nCat's Age: " + cat.getAge());
    }

}

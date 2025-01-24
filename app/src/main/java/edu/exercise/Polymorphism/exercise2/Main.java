package edu.exercise.Polymorphism.exercise2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car motorcycle = new Motorcycle();

        System.out.println("Car inital speed: " + car.getSpeed());
        System.out.println("Motorcycle inital speed: " + motorcycle.getSpeed());

        car.speedUp();
        motorcycle.speedUp();

        System.out.println("\nCar speed after  speeding up: " + car.getSpeed());
        System.out.println("Motorcycle speed after  speeding up: " + motorcycle.getSpeed());
    }
}

package JavaOOP.Polymorphism.exercise2;

public class Car extends Vehicle {

    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("\nCar speeds up  by 20 units");
    }
}

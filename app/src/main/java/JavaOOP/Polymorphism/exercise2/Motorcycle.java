package JavaOOP.Polymorphism.exercise2;

public class Motorcycle extends Vehicle {

    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Motorcycle speeds up by 15 units");
    }
}

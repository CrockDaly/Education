package JavaOOP.OOP.exercise2;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Puppy", "Chihuahua");
        Dog dog2 = new Dog("Buddy", "Bulldog");

        System.out.println(dog1.getName() + " is a " + dog1.getBreed());
        System.out.println(dog2.getName() + " is a " + dog2.getBreed());

        dog1.setBreed("Saluki");
        dog2.setName("Bob");

        System.out.println("\nSet new breed for dog1 and new name for dog2:");

        System.out.println(dog1.getName() + " is now a " + dog1.getBreed());
        System.out.println(dog2.getName() + " is still " + dog2.getBreed());
    }
}

package JavaCollectionsFramework.JavaHashSet.exercise5;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Oleg");
        hashSet.add("Kolya");
        hashSet.add("Alina");
        hashSet.add("Olya");
        hashSet.add("Igor");
        hashSet.add("Vasya");

        System.out.println("The original HashSet is: " + hashSet);
        hashSetIsEmpty(hashSet);
        hashSet.clear();
        System.out.println("\nCleared HashSet: " + hashSet);
        hashSetIsEmpty(hashSet);



    }
    private static void hashSetIsEmpty (HashSet<String> hashSet) {
       System.out.println(hashSet.isEmpty() ? "HashSet is empty" : "HashSet is not empty");
    }
}

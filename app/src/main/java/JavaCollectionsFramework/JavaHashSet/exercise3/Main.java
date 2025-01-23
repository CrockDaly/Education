package JavaCollectionsFramework.JavaHashSet.exercise3;

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

        System.out.println("Original HashSet is: " + hashSet);
        System.out.println("Size of the  HashSet is: " + hashSet.size());
    }
}

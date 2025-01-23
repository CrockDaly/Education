package JavaCollectionsFramework.JavaHashSet.exercise2;

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

        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}

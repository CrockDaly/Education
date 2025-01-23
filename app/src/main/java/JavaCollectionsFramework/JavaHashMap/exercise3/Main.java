package JavaCollectionsFramework.JavaHashMap.exercise3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map.put("Vasya", 14);
        map.put("Oleg", 16);
        map.put("Katya", 19);
        map.put("Igor", 20);

        System.out.println("First HashMap is: " + map);
        map2.putAll(map);
        System.out.println("Second HashMap is: " + map2);

    }
}

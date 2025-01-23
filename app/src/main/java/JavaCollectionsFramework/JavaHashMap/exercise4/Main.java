package JavaCollectionsFramework.JavaHashMap.exercise4;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Vasya", 14);
        map.put("Oleg", 16);
        map.put("Katya", 19);
        map.put("Igor", 20);

        System.out.println("Map before remove all elements is: " + map);
        map.clear();
        System.out.println("Map after remove all elements is: " + map);
    }
}

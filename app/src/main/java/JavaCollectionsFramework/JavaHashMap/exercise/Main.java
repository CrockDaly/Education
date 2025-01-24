package JavaCollectionsFramework.JavaHashMap.exercise;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Vasya", 14);
        map.put("Oleg", 16);
        map.put("Katya", 19);
        map.put("Igor", 20);

        System.out.println(map);
    }
}

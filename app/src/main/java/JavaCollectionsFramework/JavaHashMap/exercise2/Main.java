package JavaCollectionsFramework.JavaHashMap.exercise2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Vasya", 14);
        map.put("Oleg", 16);
        map.put("Katya", 19);
        map.put("Igor", 20);

        System.out.println("Size of the HashMap: " + map.size());
    }
}

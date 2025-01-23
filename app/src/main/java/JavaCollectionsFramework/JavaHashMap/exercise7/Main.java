package JavaCollectionsFramework.JavaHashMap.exercise7;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Vasya", 14);
        map.put("Oleg", 16);
        map.put("Katya", 19);
        map.put("Igor", 20);

        System.out.println("The original map is: " + map);
        System.out.println("\nIs key Igor exist?");
        isMapContainsKey(map.containsKey("Igor"));
        System.out.println("\nIs key Egor exist?");
        isMapContainsKey(map.containsValue("Egor"));
    }
    private static void isMapContainsKey(boolean result ) {
        if (result) {
            System.out.println("Yes, this key is exist in the map");
        } else {
            System.out.println("No, this key is not exist in the map");
        }
    }
}

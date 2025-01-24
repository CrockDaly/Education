package JavaCollectionsFramework.JavaHashMap.exercise7;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
      Map<String, Integer> map = new HashMap<>();

        map.put("Vasya", 14);
        map.put("Oleg", 16);
        map.put("Katya", 19);
        map.put("Igor", 20);

        System.out.println("The original map is: " + map);
        System.out.println("\nIs key Igor exist?");
        processMapContainsKey("Igor", map);
        System.out.println("\nIs key Egor exist?");
        processMapContainsKey("Egor", map);
    }
    private static void processMapContainsKey(String key, Map<String, Integer> map) {
        if (map.containsKey(key)){
            System.out.println("Yes, key " + key +" is exist in the map");
        } else {
            System.out.println("No, this key " + key + " is not exist in the map");
        }
    }
}

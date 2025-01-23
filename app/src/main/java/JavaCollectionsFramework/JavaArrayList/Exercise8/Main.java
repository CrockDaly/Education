package JavaCollectionsFramework.JavaArrayList.Exercise8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Original array is: " + list);
        list.sort(null);
        System.out.println("Sorted array is: " + list);

    }
}

package JavaCollectionsFramework.JavaArrayList.Exercise3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        list.add(0, "Orange");
        list.add(5, "Violet");

        System.out.println(list);
    }
}

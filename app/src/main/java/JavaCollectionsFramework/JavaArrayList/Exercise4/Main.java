package JavaCollectionsFramework.JavaArrayList.Exercise4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println(list);
        System.out.println("Second element is: "+ list.get(1));
        System.out.println("Third element is: "+ list.get(2));
    }
}

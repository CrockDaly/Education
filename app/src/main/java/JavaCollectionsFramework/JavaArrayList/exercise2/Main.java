package JavaCollectionsFramework.JavaArrayList.exercise2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        for(String str : list){
            System.out.println(str);
        }
    }
}

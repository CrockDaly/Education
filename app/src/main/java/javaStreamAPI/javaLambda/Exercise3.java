package javaStreamAPI.javaLambda;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
public class Exercise3 {
    public static void main(String[] args) {
        List<String> newList = new ArrayList<>();
        newList.add("Red");
        newList.add("Blue");
        newList.add("green");
        newList.add("BLACK");
        newList.add("WHITE");

        System.out.println("The original list is: \n" + newList);

        newList.replaceAll(str -> str.toUpperCase());
            System.out.println("\nNew UpperCase list is: \n" + newList);

        newList.replaceAll(str -> str.toLowerCase());
        System.out.println("\nNew LowerCase list is: \n" + newList);
    }
}

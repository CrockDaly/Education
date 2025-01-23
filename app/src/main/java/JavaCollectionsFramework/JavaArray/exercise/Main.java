package JavaCollectionsFramework.JavaArray.exercise;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numArray = {5, 4, 2, 1, 9, 3, 16};
        String[] strArray = {"A", "C", "B", "D", "E", "F"};
        System.out.println("Original array: " + Arrays.toString(numArray));
        System.out.println("Original array: " + Arrays.toString(strArray));

         Arrays.sort(numArray);
         Arrays.sort(strArray);

        System.out.println("\nSorted array: " + Arrays.toString(numArray));
        System.out.println("Sorted array: " + Arrays.toString(strArray));
    }
}

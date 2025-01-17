package JavaBase.JavaGenericMethods.Exercise1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = {1,2,3,4,5};
        String[] arr3 = {"One", "Two"};
        String[] arr4 = {"Three", "Four"};

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("arr3: " + Arrays.toString(arr3));
        System.out.println("arr4: " + Arrays.toString(arr4));

        System.out.println("\nCompare arr1 and arr2: " + compareArrays(arr1, arr2));
        System.out.println("Compare arr3 and arr4: " + compareArrays(arr3, arr4));



    }
    public static <T> boolean compareArrays(T[] list1, T[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (!list1[i].equals(list2[i])) {
                return false;
            }
        }
        return true;
    }
}


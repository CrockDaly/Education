package javaStreamAPI.javaLambda;

public class Exercise2 {
    //2. Write a Java program to implement a lambda expression to check if a given string is empty.
    public static void main(String[] args) {
        EmptyChecker check = (s -> {
           boolean result = s.isEmpty();
            if (result) {
               return "This string is empty";
            } else {
                return "This string is not empty";
            }
        });


        System.out.println(check.isEmpty("Stroka"));
        System.out.println(check.isEmpty(""));
    }
}

interface EmptyChecker {
    String isEmpty(String s);
}


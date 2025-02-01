package javaStreamAPI.javaLambda;


//1. Write a Java program to implement a lambda expression to find the sum of two integers.
public class Exercise1 {
    public static void main(String[] args) {
        SumCalculator sumIntegers = (x, y) -> x + y;

        System.out.println("Sum result is: " + sumIntegers.sum(1, 2));
        System.out.print("Sum result is: " + sumIntegers.sum(10, -35));
    }
}

interface SumCalculator {
    int sum(int a, int b);
}
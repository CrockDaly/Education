package threads.javathread;


import java.util.stream.IntStream;

//2. Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.
public class Exercise2 {
    private static  final int MAX_NUMBER = 20;
    private static Object lock = new Object();
    private static boolean isEvenTurn = true;

    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> {
            IntStream.rangeClosed(2, MAX_NUMBER)
                    .filter(n -> n % 2 == 0)
                    .forEach(n -> {
                        synchronized (lock) {
                            while (!isEvenTurn) {
                                try {
                                    lock.wait();
                                }
                                catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                }
                            }
                            System.out.println("Even number: " + n);
                            isEvenTurn = false;
                            lock.notify();
                        }
                    });
        });

        Thread oddThread = new Thread(() -> {
            IntStream.rangeClosed(1, MAX_NUMBER)
                    .filter(n -> n % 2 != 0)
                    .forEach(n -> {
                        synchronized (lock) {
                            while (isEvenTurn) {
                                try {
                                    lock.wait();
                                }
                                catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                }
                            }
                            System.out.println("Odd number: " + n);
                            isEvenTurn = true;
                            lock.notify();
                        }
                    });
        });

        oddThread.start();
        evenThread.start();
    }

}

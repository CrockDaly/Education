package threads.javathread;


//1. Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.
public class Exercise1 {
    public static void main(String[] args){
        final Runnable hello = () -> System.out.println("Hello, world!");
        Thread thread = new Thread(hello);
        thread.start();

        HelloWorldThread thread2 = new HelloWorldThread();
        thread2.start();
    }
}
class HelloWorldThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello, world!");
    }
}

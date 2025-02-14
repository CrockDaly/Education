package threads.javamultithreading.exercise1;


//Write a Java program to create and start multiple threads that increment a shared counter variable concurrently.
public class Exercise1 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int numThreads = 6;
        int incrementPerThread = 10000;
        IncrementThread[] threads = new IncrementThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new IncrementThread(counter, incrementPerThread);
            threads[i].start();
        }
        try {
            for (IncrementThread thread : threads) {
                thread.join();
            }
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Final count: " + counter.getCount());
    }
}

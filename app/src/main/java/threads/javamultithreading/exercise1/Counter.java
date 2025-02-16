package threads.javamultithreading.exercise1;

public class Counter {
    private volatile int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

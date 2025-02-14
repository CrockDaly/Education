package threads.javathread;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Write a Java program that creates a bank account with concurrent deposits and withdrawals using threads.
public class Exercise7 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        Thread depositThread1 = new Thread(() -> bankAccount.deposit(1000));
        Thread depositThread2 = new Thread(() -> bankAccount.deposit(300));
        Thread withdrawalThread1 = new Thread(() -> bankAccount.withdraw(150));
        Thread withdrawalThread2 = new Thread(() -> bankAccount.withdraw(1200));

        depositThread1.start();
        depositThread2.start();
        withdrawalThread1.start();
        withdrawalThread2.start();
    }

}
class BankAccount {
    private double balance;
    private final  Lock lock = new ReentrantLock();


    public void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
            System.out.println("Deposit: " + amount + "\nCurrent balance: " + balance);

        }
        finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            if ( balance >= amount ) {
                balance -= amount;
                System.out.println("Withdraw: " + amount + "\nCurrent balance: " + balance);

            } else {
                System.out.println("Try to withdraw " + amount + "\nInsufficient funds. Withdrawal cancelled.");
            }
        }
        finally {
            lock.unlock();
        }
    }
}

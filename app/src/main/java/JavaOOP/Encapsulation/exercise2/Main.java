package JavaOOP.Encapsulation.exercise2;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(10250.45);
        bankAccount.setAccountNumber(12344321);

        System.out.println("Account Number: " + bankAccount.getAccountNumber() + " Balance: " + bankAccount.getBalance());
    }
}

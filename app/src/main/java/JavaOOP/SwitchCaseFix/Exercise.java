package JavaOOP.SwitchCaseFix;

import java.util.Scanner;

public class Exercise {
    public enum Day {
        Monday(1),
        Tuesday(2),
        Wednesday(3),
        Thursday(4),
        Friday(5),
        Saturday(6),
        Sunday(7);

        private final int number;

        Day(int number) {
            this.number = number;
        }

        public  int getNumber() {
            return number;
        }
    }

    public static Day getDayByNumber(int number) {
        for (Day day : Day.values()) {
            if (day.getNumber() == number) {
                return day;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        Day day = getDayByNumber(number);
        if (day == null) {
            System.out.println("Incorrect number of days!");
        } else {
            System.out.println(day);
        }
        scanner.close();
    }
}
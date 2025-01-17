package JavaBase.JavaEnumTypes.Exercise2;

public class Main {
    public static void main(String[] args) {
        Weekend day1 = Weekend.SATURDAY;
        Weekend day2 = Weekend.SUNDAY;

        System.out.println("First day of the weekend: " + day1);
        System.out.println("Second day of the weekend: " + day2);
    }
    public enum Weekend {
        SATURDAY, SUNDAY
    }
}

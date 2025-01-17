package JavaBase.JavaEnumTypes.Exercise1;

public class Main {
    public static void main(String[] args) {
       DaysOfWeek today  = DaysOfWeek.FRIDAY;
       System.out.println("Today is " + today);
    }

    public enum DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}

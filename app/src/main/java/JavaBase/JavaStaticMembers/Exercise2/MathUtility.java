package JavaBase.JavaStaticMembers.Exercise2;

public class MathUtility {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum1 = MathUtility.add(10, 12);
        int sum2 = MathUtility.add(48, 56);
        System.out.println("Sum1: " + sum1 + "; Sum2: " + sum2);
    }
}

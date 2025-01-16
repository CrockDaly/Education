package JavaOOP.AbstractClasses.exercise2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Perimeter of the circle: " + circle.calculatePerimeter());
        System.out.println("Area of the triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of the triangle: " + triangle.calculatePerimeter());

    }
}

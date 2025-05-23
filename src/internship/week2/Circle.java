package internship.week2;

import java.util.Scanner;

public class Circle {

    double radius;

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

        Circle circle = new Circle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");

        circle.radius = scanner.nextDouble();

        System.out.println("Area: " + circle.calculateArea());
        System.out.println();
        System.out.println("Circumference: " + circle.calculateCircumference());
    }
}

package internship.week2;

import java.util.Scanner;

public class Rectangle {
    double length;
    double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return (length * width);
    }

    public double calculateParameter() {
        return (length + width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

   public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 4);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length: ");
        rectangle.length = scanner.nextDouble();
        System.out.println("Width: ");
        rectangle.width = scanner.nextDouble();
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Parameter: " + rectangle.calculateParameter());
    }
}

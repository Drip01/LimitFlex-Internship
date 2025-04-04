package week_2.algorithm;

 class Shape {
    public double area() {
        return 0;
    }
}
class myRectangle extends Shape {
    double length;
    double width;
    public myRectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area() {
        return length * width;
    }
}
  class myCircle extends  Shape {
    double radius;
    public myCircle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}
public class ShapePolymorphism {
    public static void main (String[] args) {
        Shape rectangle = new myRectangle(5,3);
        Shape circle = new myCircle(4);

        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}

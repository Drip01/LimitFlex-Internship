package internship.week3;

public class Car {

    private String make = "Tesla";
    private String mode = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public void describeCar() {

        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                (convertible ? "Convertible" : " "));
    }
}

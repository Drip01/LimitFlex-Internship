package internship.week2;
import java.util.HashMap;
import java.util.Map;

class MyCarRental {
    String model;
    int year;
    double price;
    boolean availableForRent;

    public MyCarRental(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
        availableForRent = true;
    }
    public void rental() {
        if (availableForRent) {
            availableForRent = false;
            System.out.println("You have rented " + model + year);
        }
        else {
            System.out.println(model + " " + year + "is not available");
        }
    }
    public void returnCar() {
        if (!availableForRent) {
            availableForRent = true;
            System.out.println("You have returned " + model + " "+ year + " ");
        }
        else {
            System.out.println(model + " " + year + "was not rented.");
        }
    }
    public void displayCar() {
        System.out.println("Model: " + model + " | Year: " + year + " | Price: " + price + " | Availability: " + (availableForRent ? "yes" : "no"));
    }
}
public class CarRental {
    public static void main(String[] args) {
        MyCarRental carRental = new MyCarRental("Audi ", 2020, 150000);
        carRental.displayCar();
        carRental.rental();
        carRental.returnCar();
    }
}






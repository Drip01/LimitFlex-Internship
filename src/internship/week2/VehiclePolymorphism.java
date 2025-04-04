package week_2.algorithm;

class myVehiclePolymorphism {
    public void speed() {
        System.out.println("The speed of the vehicle. ");
    }
}
class Car extends myVehiclePolymorphism {
    public void speed() {
        System.out.println("The speed of the car is 120.");
    }
}
class Bike extends myVehiclePolymorphism {
    public void speed() {
        System.out.println("The speed of the bike is 70.");
    }
}
public class VehiclePolymorphism {
    public static void main (String[] args) {
        myVehiclePolymorphism myCar = new Car();
        myVehiclePolymorphism myBike = new Bike();
        myVehiclePolymorphism myVehiclePolymorphism = new myVehiclePolymorphism();
        myVehiclePolymorphism.speed();
        myCar.speed();
        myBike.speed();
    }
}

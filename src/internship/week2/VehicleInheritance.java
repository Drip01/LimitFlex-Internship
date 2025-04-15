package internship.week2;

    class Vehicle {
    String brand;

    public Vehicle (String brand) {
        this.brand = brand;
    }

    public void display() {
        System.out.println("Vehicle Brand: " + brand);
    }
}
    class Car extends Vehicle {
        int doors;

        public Car(String brand, int doors) {
            super(brand);
            this.doors = doors;
        }
        public void display() {
            super.display();
            System.out.println("Car has " + doors + " doors");
        }
    }

    class Truck extends Vehicle {
    double capacity;

    public Truck (String brand, double capacity) {
        super(brand);
        this.capacity = capacity;
    }
    public void display() {
        super.display();
        System.out.println("Truck capacity: " + capacity);
      }
    }

    public class VehicleInheritance {
        public static void main(String[] args) {
            Car1 car = new Car1("BMW", 2);
            Truck truck = new Truck("LAMBO", 18);

            car.display();
            System.out.println();
            truck.display();
    }
}






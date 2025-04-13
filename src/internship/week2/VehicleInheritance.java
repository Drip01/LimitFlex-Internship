package internship.week2;

public class VehicleInheritance {
    String car;
    String truck;

    public VehicleInheritance(String type1, String type2) {
        this.car = type1;
        this.truck = type2;
    }
    public void display() {
        System.out.println("Type 1 " + car);
        System.out.println("Type 2 " + truck);
    }
    public static void main(String[] args) {
        VehicleInheritance vehicle = new VehicleInheritance("Car ", "Truck");
        vehicle.display();
    }
    }




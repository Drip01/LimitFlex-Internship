package internship.week4.algorithm;

public class PolymorphismChallenge {
    public static void main(String[] args) {

        Car car = new Car ("2025 Black G63");
        runRace(car);

        Car g63 = new GasPoweredCar("2025 Black G63",
                15.4, 6);
        runRace(g63);

        Car tesla = new ElectricCar("2025 Red Telsa Model 5", 568,
                75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2025 Black Ferrari SF90 Stradale",
                16, 8, 8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}

class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }

    public void drive() {
        System.out.println("Car -> driving, type is " +
                getClass().getSimpleName());
        runEngine();
    }
}

class GasPoweredCar extends Car {

    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}

class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize = 6;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
    }
}

class HybridCar extends Car {

    private double avgKmPerLiter;
    private int cylinders = 6;
    private int batterySize;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLiter, int cylinders,
                     int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid-> All %d cylinders are fired up, Ready!%n", cylinders);
        System.out.printf("Hybrid-> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLiter);
    }
}
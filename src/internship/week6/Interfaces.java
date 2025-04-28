package internship.week6;

public class Interfaces {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal1 animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move();
//        tracked.move();

        flier.takeoff();
        flier.fly();
        tracked.track();
        flier.land();
    }
}

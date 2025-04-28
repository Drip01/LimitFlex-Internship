package internship.week6;

 interface FlightEnabled {

     double MILES_TO_KM = 1.60934;
     double KM_TO_MILES = 0.621371;

      void takeoff();
     void land();
     void fly();

 }

 interface Trackable {

     void track();
 }

public abstract class Animal1 {

     public abstract void move();
}

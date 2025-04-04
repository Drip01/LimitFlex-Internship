package internship.week2;

class Computer {
    static class Processor {
        public void ProcessorSpeed(int rpm) {
            System.out.println("The speed is: " + rpm + "rpm");
        }
    }
}
public class NestedClassExample {
    public static void main(String[] args) {
        Computer.Processor myProcessor = new Computer.Processor();
        myProcessor.ProcessorSpeed(580);
    }
}
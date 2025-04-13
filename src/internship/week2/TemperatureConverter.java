package internship.week2;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return  (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args){
        double celsius = 50;
        double fahrenheit = 90;
        System.out.println(celsius + " C is equal to " + celsiusToFahrenheit(celsius) + " F");
        System.out.println(fahrenheit + " F is equal to " + fahrenheitToCelsius(fahrenheit) + " C");

    }
}

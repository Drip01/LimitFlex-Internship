package internship.week3;

public class MethodOverLoading {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(65,145));
    }
    public static double convertToCentimeters(int inches) {
    return inches * 2.54;
    }
    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters((feet * 12) + inches);
    }
    public static String getDurationString (int seconds) {
        if (seconds < 0) {
            return "invalid data for seconds (" + seconds
                    + "), must be a positive integer value";
        }
        int minutes = seconds / 60;
       return getDurationString(minutes, seconds);
    }
    public static String getDurationString (int minutes, int seconds) {
        if (minutes < 0) {
            return "invalid data for minutes (" + minutes
                    + "), must be a positive integer value";
        }
        if (seconds < 0 || seconds > 59) {
            return "invalid data for seconds (" + seconds
                    + "), must be a between 0 and 59";
        }

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }
}

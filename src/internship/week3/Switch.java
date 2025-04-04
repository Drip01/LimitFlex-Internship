package internship.week3;


public class Switch {
    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was it a 3, a 4, a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2 or 3 or 4 or 5");
                break;
        }
        String month = "DRIP";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
     }


     public static String getQuarter (String month) {
         return switch (month) {
             case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
             case "APRIL", "MAY", "JUNE" -> "2nd";
             case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
             case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
             default -> {
                 String badResponse = month + " is bad";
                 yield badResponse;
             }
         };
     }
}

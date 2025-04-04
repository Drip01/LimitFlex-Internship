package internship.week1;

import java.util.stream.StreamSupport;

public class ReverseElement {
    public static void main(String[] args) {
        String orginalStr = "Drip";
        String reversedStr = "";
        System.out.println("Orignal string: " + orginalStr  );

        for (int i = 0; i < orginalStr.length(); i++) {
            reversedStr = orginalStr.charAt(i) + reversedStr;
        }
        System.out.println("Reversed String: "+ reversedStr );
    }
}

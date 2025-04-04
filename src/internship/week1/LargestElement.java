package internship.week1;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args){
        int[] numbers = new int[]{40, 50, 60, 36, 46, 809, 90};
        int largestNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }
        System.out.println("largest element " + (largestNumber));
    }
}

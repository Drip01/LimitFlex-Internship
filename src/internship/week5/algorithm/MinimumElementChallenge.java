package internship.week5.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {

    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

//        int returnedMin = findMin(returnedArray);
//        System.out.println("min = " + returnedMin);

//        reverse(returnedArray);
//        System.out.println("Final: " + Arrays.toString(returnedArray));

        int[] reversedCopy = reverseCopy(returnedArray);
        System.out.println("After reverse " + Arrays.toString(returnedArray));
        System.out.println("reversedCopy " + Arrays.toString(reversedCopy));
    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int [splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;
        for (int drip : array) {
            if (drip < min) {
                min = drip;
            }
        }
        return min;
    }

    private static void reverse(int[] array) {

        int maxIndex = array.length -1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("-->" + Arrays.toString(array));
        }
    }

    private static int[] reverseCopy(int[] array) {

        int[] reservedArray = new int[array.length];
        int maxIndex = array.length -1;
        for (int drip : array) {
            reservedArray[maxIndex--] = drip;
        }

        return reservedArray;
    }
}

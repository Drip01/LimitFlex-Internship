package internship.week5;

import java.util.Arrays;

public class ArrayReferences {

    public static void main(String[] args) {

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherArrays= " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        modifyArray(myIntArray);

        System.out.println("after change myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArrays= " + Arrays.toString(anotherArray));

    }

    private static  void modifyArray(int [] array) {

        array[1] = 2;
    }
}

package internship.week3.algorithm;

public class WhileLoopChallenge {
    public static void main(String[] args) {

        int number = 4;
        int finishedNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= finishedNumber) {
            number++;

            if (!isEvenNumber(number)) {
                oddCount++;
                continue;
            }

            System.out.println("Even number " + number);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }
        System.out.println("Total odd numbers found = " + oddCount);
        System.out.println("Total even numbers found = " + evenCount);
    }

    public static boolean isEvenNumber (int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

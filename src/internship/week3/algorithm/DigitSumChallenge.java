package internship.week3.algorithm;

public class DigitSumChallenge {
    public static void main(String[] args) {

        System.out.println("The sum of the digits in number 1234 is " + sumDigits(1234));
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(32123));
    }
    public static int sumDigits (int numbers) {

        if (numbers < 0) {
            return -1;
        }

        int sum = 0;

        while ( numbers > 9) {
            sum += (numbers % 10);
            numbers = numbers / 10;
        }

        sum += numbers;

        return sum;
    }
}

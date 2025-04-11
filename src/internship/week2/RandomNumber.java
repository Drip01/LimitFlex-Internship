package internship.week2;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        Random random = new Random();
        int randomInt = random.nextInt();
        System.out.println("Random integer: " + randomInt);

        int randomIntRange = random.nextInt(100);
        System.out.println("Random Integer between 0 and 99: " + randomIntRange);

        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random Boolean " + randomBoolean);
        }
    }


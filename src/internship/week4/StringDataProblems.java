package internship.week4;
import java.util.Scanner;

public class StringDataProblems {
        public static void main(String[] args) {
            String aName = "Carmen";
            String anotherName;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your name > ");
            anotherName = input.nextLine();
            if (aName.equals(anotherName))
                System.out.println(aName + " equals " + anotherName);
            else
                System.out.println(aName + " does not equal " + anotherName);

          /*  char aChar = 'C';
            System.out.println("The character is " + aChar);

            if(Character.isUpperCase(aChar))
                System.out.println(aChar + " is uppercase");
            else
                System.out.println(aChar + " is not uppercase");

            if(Character.isLowerCase(aChar))
                System.out.println(aChar + " is lowercase");
            else
                System.out.println(aChar + " is not lowercase");

            aChar = Character.toLowerCase(aChar);
            System.out.println("After tolowerCase(), aChar is " + aChar);

            aChar = Character.toUpperCase(aChar);
            System.out.println("After toUpperCase(), aChar is " + aChar);

            if(Character.isLetterOrDigit(aChar))
                System.out.println(aChar + " is a letter or digit");
            else
                System.out.println(aChar + " is neither a letter nor a digit");

            if(Character.isWhitespace(aChar))
                System.out.println(aChar + " is whitespace");
            else
                System.out.println(aChar + " is not whitespace");*/
        }
    }


package internship.week6.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class MethodReferenceChallenge {

    private static Random random = new Random();

    private record Person1(String first) {

        public String last (String s) {
            return first + " " + s.substring(0, s.indexOf(" "));
        }

    }

    public static void main(String[] args) {

        String[] names = {"Anna", "Bob", "Charlie", "Dan", "Eve", "Fred"};

        Person1 drip = new Person1("Drip");
        List<UnaryOperator<String>> list = new ArrayList<>(List.of(
                String::toUpperCase,
                s -> s += " " + getRandomChar('D', 'M') + '.',
                s-> s += " " + reverse(s, 0, s.indexOf(" ")),
                MethodReferenceChallenge::reverse,
                String::new,
//                s -> new String("Drip " + s),
                String::valueOf,
                drip::last,
                (new Person1("Mary"))::last

        ));

        applyChanges(names, list);
    }

    private static void applyChanges(String [] names,
                                       List<UnaryOperator<String>> stringFunctions) {

        List<String> backedByArray = Arrays.asList(names);
        for (var function : stringFunctions) {
            backedByArray.replaceAll(s -> s.transform(function));
            System.out.println(Arrays.toString(names));
        }
    }

    private static char getRandomChar(char startChar, char endChar) {
        return (char) random.nextInt ((int) startChar, (int) endChar + 1);
    }

    private static String reverse(String s) {
        return reverse(s, 0, s.length());
    }
    private static String reverse(String s, int start, int end) {
        return new StringBuilder(s.substring(start, end)).reverse().toString();
    }
}

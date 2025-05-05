package internship.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ChainingLambdas {

    public static void main(String[] args) {

        String name = "Mary";
        Function<String,String> uCase = String::toUpperCase;
        System.out.println(uCase.apply(name));

        Function<String,String> lastName = s -> s.concat(" Nneka");
        Function<String,String> uCaseLastName = uCase.andThen(lastName);
        System.out.println(uCaseLastName.apply(name));

        uCaseLastName = uCase.compose(lastName);
        System.out.println(uCaseLastName.apply(name));

        Function<String,String[]> f0 = uCase
                .andThen(s -> s.concat(" Nneka"))
                .andThen(s -> s.split(" "));
        System.out.println(Arrays.toString(f0.apply(name)));

        Function<String,String> f1 = uCase
                .andThen(s -> s.concat(" Nneka"))
                .andThen(s -> s.split(" "))
                .andThen(s -> s[1].toUpperCase() + ", " + s[0]);
        System.out.println(f1.apply(name));

        Function<String,Integer> f2 = uCase
                .andThen(s -> s.concat(" Nneka"))
                .andThen(s -> s.split(" "))
                .andThen(s -> String.join(", ", s))
                .andThen(String::length);
        System.out.println(f2.apply(name));

        String[] names = {"Jessica", "Cynthia", "Prudence"};
        Consumer<String> s0 = s -> System.out.print(s.charAt(0));
        Consumer<String> s1 = System.out::println;
        Arrays.asList(names).forEach(s0
                .andThen(s -> System.out.print(" - "))
                .andThen(s1));

        Predicate<String> p1 = s -> s.equals("Mary");
        Predicate<String> p2 = s -> s.equalsIgnoreCase("Mary");
        Predicate<String> p3 = s -> s.startsWith("M");
        Predicate<String> p4 = s -> s.endsWith("e");

        Predicate<String> combined = p1.or(p2);
        System.out.println("Combined1: " + combined.test(name));

        Predicate<String> combined2 = p3.and(p4);
        System.out.println("Combined2: " + combined2.test(name));

        Predicate<String> combined3 = p3.and(p4).negate();
        System.out.println("Combined3: " + combined3.test(name));

        record Person2(String firstName, String lastName) {}

        List<Person2> list = new ArrayList<>(Arrays.asList(
                new Person2("Peter", "Pan"),
                new Person2("Peter", "PumpkinEater"),
                new Person2("Minne", "Mouse"),
                new Person2("Mickey", "Mouse")
        ));

        list.sort((o1,o2) -> o1.lastName.compareTo(o2.lastName));
        list.forEach(System.out::println);

        System.out.println("-".repeat(30));
        list.sort(Comparator.comparing(Person2::lastName));
        list.forEach(System.out::println);

        System.out.println("-".repeat(30));
        list.sort(Comparator.comparing(Person2::lastName)
                        .thenComparing(Person2::firstName));
        list.forEach(System.out::println);

        System.out.println("-".repeat(30));
        list.sort(Comparator.comparing(Person2::lastName)
                .thenComparing(Person2::firstName).reversed());
        list.forEach(System.out::println);
    }
}

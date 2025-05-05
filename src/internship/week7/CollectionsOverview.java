package internship.week7;

import java.util.*;

public class CollectionsOverview {

    public static void main(String[] args) {

        Collection<String> list = new HashSet<>();

        String[] names = {"Mary", "Jane", "Bob", "Alice", "John"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);

        list.add("Fred");
        list.addAll(Arrays.asList("George", "Gary", "Grace"));
        System.out.println(list);
        System.out.println("Gary is in the list? " + list.contains("Gary"));

        list.removeIf(s -> s.charAt(0) == 'G');
        System.out.println(list);
        System.out.println("Gary is in the list? " + list.contains("Gary"));


    }
}

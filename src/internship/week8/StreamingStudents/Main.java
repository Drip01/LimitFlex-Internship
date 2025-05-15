package internship.week8.StreamingStudents;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Course pymc = new Course("PYMC", "Python Masterclass");
        Course jmc = new Course("JMC", "Java Masterclass");
//        Student drip = new Student("AU", 2019, 30, "M",
//                true, jmc, pymc);
//        System.out.println(drip);
//
//        drip.watchLecture("JMC", 10, 5, 2019);
//        drip.watchLecture("PYMC", 7, 7, 2020);
//        System.out.println(drip);

        Stream.generate(() -> Student.getRandomStudent(jmc, pymc))
                .limit(10)
                .forEach(System.out::println);

    }
}

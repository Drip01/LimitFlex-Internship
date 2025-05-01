package internship.week6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NestedClasses {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001, "Ralph", 2015),
                new Employee(10005, "Carole", 2021),
                new Employee(10022, "Jane", 2013),
                new Employee(13151, "Laura", 2020),
                new Employee(10050, "Jim", 2018) ));

//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);

       employees.sort(new Employee.EmployeeComparator<>("yearStarted")
               .reversed());

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}

class Employee {

    static class EmployeeComparator <T extends Employee>
            implements Comparator<Employee> {

        private String sortType;

        public EmployeeComparator() {
            this("name");
        }

        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(Employee o1, Employee o2) {
            if (sortType.equalsIgnoreCase("yearStarted")) {
                return o1.yearStarted - o2.yearStarted;
            }

            return o1.getName().compareTo(o2.getName());
        }
    }

    private int employeeId;
    private String name;
    private int yearStarted;

    public Employee() {
    }

    public Employee(int employeeId, String name, int yearStarted) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(employeeId, name, yearStarted);
    }
}

//class EmployeeComparator <T extends Employee> implements Comparator<Employee> {
//
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}

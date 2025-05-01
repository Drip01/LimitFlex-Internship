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

        System.out.println("Store Members");

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015, " Meg", 2019,
                        "Target"),
                new StoreEmployee(10515, " Joe", 2021,
                        "Walmart"),
                new StoreEmployee(10105, " Tom", 2020,
                        "Macys"),
                new StoreEmployee(10215, " Marty", 2018,
                        "Walmart"),
                new StoreEmployee(10322, " Bud", 2016,
                        "Target")));

        var genericEmployee = new StoreEmployee();
        var comparator = genericEmployee.new StoreComparator<>();
        storeEmployees.sort(comparator);

        for (StoreEmployee e : storeEmployees) {
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

class EmployeeComparator <T extends Employee> implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class StoreEmployee extends Employee {

    private String store;

    public StoreEmployee() {
    }

    public StoreEmployee(int employeeId, String name, int yearStarted, String store) {
        super(employeeId, name, yearStarted);
        this.store = store;
    }

    @Override
    public String toString() {
        return "%-8s%s".formatted(store, super.toString());
    }

    public class StoreComparator<T extends StoreEmployee>
            implements Comparator<StoreEmployee> {

        @Override
        public int compare(StoreEmployee o1, StoreEmployee o2) {

            int result = o1.store.compareTo(o2.store);
            if (result == 0) {
                return new Employee.EmployeeComparator<>(
                        "yearStarted").compare(o1, o2);
            }
            return result;
        }
    }
}

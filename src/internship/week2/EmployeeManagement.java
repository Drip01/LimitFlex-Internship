package internship.week2;

import java.util.Scanner;

public class EmployeeManagement {
    String name;
    int salary;
    String position;

    public EmployeeManagement() {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public void EmployeeDetails() {
        System.out.println("Name Of Business: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Position: " + position);
    }

    public static void main(String[] args) {
        System.out.println("Business Details: ");
        EmployeeManagement employeeManagement = new EmployeeManagement();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name Of Business: ");
        employeeManagement.name = scanner.nextLine();
        System.out.println("Salary: ");
        employeeManagement.salary = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Position: ");
        employeeManagement.position = scanner.nextLine();
        employeeManagement.EmployeeDetails();
    }
}

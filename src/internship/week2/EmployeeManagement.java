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

    public void EmployeeDetails() {
        System.out.println("Name: " + name+ " | Salary: $" + salary + " | Position: " + position);
    }

    public static void main(String[] args) {
        System.out.println("Employee Details: ");
        EmployeeManagement employeeManagement = new EmployeeManagement();
        Scanner scanner = new Scanner(System.in);
       System.out.println("Name: ");
        employeeManagement.name = scanner.nextLine();
        System.out.println("Salary: ");
        employeeManagement.salary = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Position: ");
        employeeManagement.position = scanner.nextLine();
        employeeManagement.EmployeeDetails();
    }
}

package week_2.algorithm;

 class School {
     static class Department {
         public void Course (String OperatingSystem) {
             System.out.println("I am learning " + OperatingSystem);
         }
     }
}
public class University {
    public static void main(String[] args) {
        School.Department department = new School.Department();
        department.Course("Date base Management");
    }
}

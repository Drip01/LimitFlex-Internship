package internship.week2;

 class School {
     String university = "Uni lag";

     static class Department {
         String deptName = "Computer Science";
         public void display () {
             System.out.println("Department: " + deptName);
         }
     }
}

public class University {
    public static void main(String[] args) {
        School uni = new School();
        System.out.println("University: " + uni.university);

        School.Department department = new School.Department();
        department.display();
    }
}

package internship.week3;

  class Student {

      private String id;
      private String name;
      private String dateOfBirth;
      private String classList;

      public Student(String id, String name, String dateOfBirth, String classList) {
          this.id = id;
          this.name = name;
          this.dateOfBirth = dateOfBirth;
          this.classList = classList;
      }

      @Override
      public String toString() {
          return "Student {" +
                  "id='" + id + '\'' +
                  ", name= '" + name + '\'' +
                  ", dateOfBirth= '" + dateOfBirth + '\'' +
                  ", classList= '" + classList + '\'' +
                  '}';
      }

      public String getId() {
          return id;
      }

      public void setId(String id) {
          this.id = id;
      }

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      public String getDateOfBirth() {
          return dateOfBirth;
      }

      public void setDateOfBirth(String dateOfBirth) {
          this.dateOfBirth = dateOfBirth;
      }

      public String getClassList() {
          return classList;
      }

      public void setClassList(String classList) {
          this.classList = classList;
      }
  }

      public class RecordProject {
          public static void main(String[] args) {

              for (int i = 1; i <=5; i++) {
                 LPAStudent  s = new LPAStudent("CS/2022/123" + i,
                         switch (i) {
                     case 1 -> "John Smith";
                     case 2 -> "John Miller";
                     case 3 -> "Mary Smith";
                     case 4 -> "Harry Larry";
                     case 5 -> "Ezinwa Lysa";
                             default -> "Anonymous";
                         },
                         "05/05/2003",
                         "Java Masterclass");
                 System.out.println(s);
              }

              Student pojoStudent = new Student("CS/2022/1236", "Ann Chinwe",
                      "05/05/2003", "Java Masterclass");
              LPAStudent recordStudent = new LPAStudent("CS/2022/1237", "Bill Gate",
                      "05/05/2003", "Java Masterclass");

              System.out.println(pojoStudent);
              System.out.println(recordStudent);

              pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//              recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");
              System.out.println(pojoStudent.getName() + " is taking " +
                      pojoStudent.getClassList());
              System.out.println(recordStudent.name() + " is taking " +
                      recordStudent.classList());
          }

          public record LPAStudent(String id, String name, String dateOfBirth, String classList) {

          }
      }


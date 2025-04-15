package internship.week2;

public class SubjectStores{
        String name;
        int RegNo;
        int score1, score2, score3;


        public SubjectStores(String name, int RegNo, int score1, int score2, int score3){
            this.name = name;
            this.RegNo = RegNo;
            this.score1 = score1;
            this.score2 = score2;
            this.score3 = score3;
        }

        public double calculateAverageScore(){
            return (score1 + score2 + score3) / 3.0;
        }
        public void revealDetails(){
            System.out.println("Average score: " + calculateAverageScore());
        }
        public void StudentDetails() {
            System.out.println("Name: " + name + ", RegNo: " + RegNo + ", Maths: " + score1 + ", English: " + score2 + ", Chemistry: " + score3);
        }

        public static void main(String[] args){
            SubjectStores student = new SubjectStores("Drip Anonymous", 1235, 67, 87, 20);
            student.StudentDetails();
            student.revealDetails();
        }
    }



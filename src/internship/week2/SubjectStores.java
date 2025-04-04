package internship.week2;

public class SubjectStores{
        String name;
        int RegNo;
        double score1;
        double score2;
        double score3;
        public SubjectStores(String name, int RegNo, double score1, double score2, double score3){
            this.name = name;
            this.RegNo = RegNo;
            this.score1 = score1;
            this.score2 = score2;
            this.score3 = score3;
        }
        public String getName(){
            return name;
        }
        public int getRegNo(){
            return RegNo;
        }
        public double getScore1(){
            return score1;
        }
        public double getScore2(){
            return score2;
        }
        public double getScore3(){
            return score3;
        }
        public double calculateAverageScore(){
            return (score1 + score2 + score3) / 3;
        }
        public void revealDetails(){
            //System.out.println("Name: " + name);
            // System.out.println("RegNo: " + RegNo);
            System.out.println("Average score: " + calculateAverageScore());
        }
        public void StudentDetails() {
            System.out.println("Name: " + name);
            System.out.println("RegNo: " + RegNo);
            System.out.println("Maths score:" + score1);
            System.out.println("English score: " + score2);
            System.out.println("Chemistry score: " + score3);
        }
        public static void main(String[] args){
            SubjectStores student = new SubjectStores("Drip Anonymous", 1235, 67, 87, 20);
            student.StudentDetails();
            student.revealDetails();
        }
    }



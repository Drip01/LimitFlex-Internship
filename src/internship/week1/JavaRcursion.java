package internship.week1;

public class JavaRcursion {
    public static void main(String[] args) {
        int num = 5;

        int answer = sum(num);
        System.out.println(answer);
    }
    public static int sum(int num) {
        if (num >= 1){
       return num + sum(num - 1);
        } else {
            return 0;
        }
    }
}

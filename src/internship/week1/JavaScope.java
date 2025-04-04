package internship.week1;

public class JavaScope {
     static int global = 100;
    public static void main(String[] args){
        int local = 200;
        System.out.println(local);
        System.out.println(global);
    }
}

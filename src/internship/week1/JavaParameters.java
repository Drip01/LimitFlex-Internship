package internship.week1;

public class JavaParameters {
    static void myMethod(String drip, String maduabuchi) {
        System.out.println("String 1:" + drip);
        System.out.println("String 2:" + maduabuchi);
    }
    public static void main(String[] args){

        myMethod("drip", "maduabuchi");
    }
}

package internship.week1;

public class JavaOverloading {
    static int plusMethodInt(int x, int y) {
        return x * y;
    }
    static double plusMethodDouble(double x, double y) {
        return x * y;
    }
    public static void main(String[] args){
        int myNum1 = plusMethodInt(4, 6);
        double myNum2 = plusMethodDouble(10.6, 8.5);
        System.out.println("int " + myNum1);
        System.out.println("double " + myNum2);

    }

}

package internship.week5;

public class VarArgs {

    public static void main(String... args) {

        System.out.println("Fuck the Government");

        String [] splitString = "Fuck the Government".split(" ");
        printText(splitString);

        System.out.println("_".repeat(20));
        printText("Drip");

        System.out.println("_".repeat(20));
        printText("Drip", "Pospy", "Daddy yo");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",",sArray));
    }

    private static void printText(String... textList) {

        for (String t : textList) {
            System.out.println(t);
        }
    }
}

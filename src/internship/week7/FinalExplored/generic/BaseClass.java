package internship.week7.FinalExplored.generic;

public class BaseClass {

    public final void recommendedMethod() {

        System.out.println("[BaseClass.recommendedMethod]: Best Way to do it");
        optionalMethod();
        mandatoryMethod();
    }
    protected void optionalMethod() {
        System.out.println("[BaseClass.optionalMethod]: Customized Optional Method");
    }

    private void mandatoryMethod() {
        System.out.println("[BaseClass.mandatoryMethod]: NON-NEGOTIABLE!");
    }

    public static void recommendedStatic() {

        System.out.println("[BaseClass.recommendedStatic] BEST Way to Do it");
        optionalStatic();
        mandatoryStatic();
    }

    protected static void optionalStatic() {
        System.out.println("[BaseClass.optionalStatic]: Optional");
    }

    private static void mandatoryStatic() {
        System.out.println("[BaseClass.mandatoryStatic]: MANDATORY");
    }
}

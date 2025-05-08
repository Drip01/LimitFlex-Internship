package internship.week7.SetsAndMaps;


import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");
        printData("Phone List", phones);
        printData("Email List", emails);

        Set<Contact> emailContacts = new HashSet<>(emails);
        Set<Contact> phoneContacts = new HashSet<>(phones);
        printData("Phone Contacts", phoneContacts);
        printData("Email Contacts", emailContacts);

        int index = emails.indexOf(new Contact("Robin Hood"));
        Contact robinHood = emails.get(index);
        robinHood.addEmail("Drip Group & Co");
        robinHood.addEmail("Drip Group & Co");
        robinHood.replaceEmailIfExist("RHood@dripgroup&co.com", "RHood@dripgroup&co.org");
        System.out.println(robinHood);

        Set<Contact> unionAB = new HashSet<>();
        unionAB.addAll(emailContacts);
        unionAB.addAll(phoneContacts);
        printData("(A ∪ B) Union of emails (A) with phones (B)", unionAB);

        Set<Contact> intersetAB = new HashSet<>(emailContacts);
        intersetAB.retainAll(phoneContacts);
        printData("(A ∩ B) Intersect emails (A) and phones (B)",
                intersetAB);

        Set<Contact> intersetBA = new HashSet<>(phoneContacts);
        intersetBA.retainAll(emailContacts);
        printData("(B ∩ A) Intersect emails (B) and phones (A)",
                intersetBA);

        Set<Contact> AMinusB = new HashSet<>(emailContacts);
        AMinusB.removeAll(phoneContacts);
        printData("(A - B) emails (A) - phones (B)",
                AMinusB);

        Set<Contact> BMinusA = new HashSet<>(phoneContacts);
        BMinusA.removeAll(emailContacts);
        printData("(B - A) phones (B) - email (A)",
                BMinusA);

        Set<Contact> symmetricDiff = new HashSet<>(AMinusB);
        symmetricDiff.addAll(BMinusA);
        printData("Symmetric Difference: phones and emails", symmetricDiff);

        Set<Contact> symmetricDiff2 = new HashSet<>(unionAB);
        symmetricDiff2.removeAll(intersetAB);
        printData("Symmetric Difference: phones and emails", symmetricDiff2);

    }
        public static void printData(String header, Collection<Contact> contacts) {

            System.out.println("-".repeat(50));
            System.out.println(header);
            System.out.println("-".repeat(50));
           contacts.forEach(System.out::println);

    }
}

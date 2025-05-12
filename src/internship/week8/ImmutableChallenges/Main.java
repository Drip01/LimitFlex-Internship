package internship.week8.ImmutableChallenges;

import internship.week8.ImmutableChallenges.bank.BankAccount;
import internship.week8.ImmutableChallenges.bank.BankCustomer;

import java.util.List;

public class Main {

    public static void main(String[] args) {

//        BankAccount account =
//                new BankAccount(BankAccount.AccountType.CHECKING, 500);
//        System.out.println(account);

        BankCustomer joe = new BankCustomer("Joe", 500.00,
                10000.00);
        System.out.println(joe);

        List<BankAccount> accounts = joe.getAccounts();
        accounts.clear();
        System.out.println(joe);

    }
}

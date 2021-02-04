package udemeychallengeclasses;

import java.util.*;

public class UdemeyChallengeClasses {

    public static void main(String[] args) {

        BankAccount timsAccount = new BankAccount(12345, 00.0, "Tim Brown", "tim.Brown@gmail.com", "07410451649");

        timsAccount.withdrawal(100.00);

        timsAccount.deposit(50.00);
        timsAccount.withdrawal(100.00);

        timsAccount.deposit(51.00);
        timsAccount.withdrawal(100.00);

    }

}

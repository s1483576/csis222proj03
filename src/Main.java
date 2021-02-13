import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        double deposit;
        double withdraw;
        double balance;
        double newBalance;
        int decision;

        System.out.print("Enter your savings account current balance: ");
        balance = cin.nextDouble();

        System.out.print("Continue entering transactions? (1. Continue 2. Quit) ");
        decision = cin.nextInt();

        if (decision == 1);
        {
            System.out.print("Enter a type of transaction. (1. Deposit 2. Withdraw) ");
            decision = cin.nextInt();
        }

        if (decision == 2);
        {
            System.out.print("Have a good day");
        }

        if (decision == 1);
        {
            System.out.print("How much money would you like to put in as a deposit? ");
            deposit = cin.nextDouble();
            newBalance = deposit + balance;
        }

        if (decision == 2);
        {
            System.out.print("How much money would you like to withdraw? ");
            withdraw = cin.nextDouble();
            newBalance = withdraw - balance;
        }
        System.out.print("Do you wish to make another deposit/withdrawal or do you wish to quit? (1. Dep/With 2. Quit) ");
        decision = cin.nextInt();

        if (decision == 1);
        {
            System.out.print("Enter a type of transaction. (1. Deposit 2. Withdraw) ");
            decision = cin.nextInt();
        }
        if (decision == 2);
        {
            System.out.print("Your current balance is: " + newBalance);
        }

        if (decision == 1);
        {
            System.out.print("How much money would you like to put in as a deposit? ");
            deposit = cin.nextDouble();
            newBalance = deposit + balance;
        }

        if (decision == 2);
        {
            System.out.print("How much money would you like to withdraw? ");
            withdraw = cin.nextDouble();
            newBalance = withdraw - balance;
        }
        System.out.print("Your current balance is: " + newBalance);

    }


}

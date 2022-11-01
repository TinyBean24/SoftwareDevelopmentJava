package Ch8;

import java.util.Scanner;

public class SavingsAccountTest {
    public static void main( String[] args ) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter initial balance for saver1: ");
//        double bal1 = input.nextDouble();
//        System.out.print("Enter Annual Interest Rate for both savers: ");
//        double rate = input.nextDouble();
        double bal1 = 2000;
        double bal2 = 3000;
        double rate = .04;

        // create new SavingsAccount saver1 with $2000 balance
        SavingsAccount saver1 = new SavingsAccount(bal1, rate);
        // create new SavingsAccount saver2 with $3000 balance
//        System.out.print("Enter Initial balance for saver2: ");
//        double bal2 = input.nextDouble();
//        SavingsAccount saver2 = new SavingsAccount(bal2, rate);
        SavingsAccount saver2 = new SavingsAccount(bal2, rate);

        System.out.printf("\nSaver1 Bal: %.2f\n", saver1.getSavingsBalance());
        System.out.println(saver1.getAnnualInterestRate());

        double k = saver1.getMonthlyInterest();
        System.out.printf("%.2f\n", k);
        SavingsAccount.setAnnualInterestRate(.05);
        System.out.printf("Value of annual interest rate after change: %.2f\n", saver1.getAnnualInterestRate());

        System.out.println("\nMonthly balances for one year at .04\nBalances:\n ");
        System.out.printf("\t\t\tSaver 1\t  Saver 2\nBase:\t   $%.2f  $%.2f\n", bal1, bal2);
        for (int month = 1; month <= 12; month++) {
            System.out.printf("Month %s:\t  $%.2f\n", month, k);
        }

        //Set annual interest rate to 4%
        // Loop through 12 months
        // for both saver1 and saver 2
        //calculate monthly interest
        //print updated balance

        //Set annual interest rate to 5%
        // for both saver1 and saver 2
        //calculate monthly interest for 1 month
        //print updated balance

    } // end main
} // end class SavingsAccountTest

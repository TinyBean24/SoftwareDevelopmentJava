package Ch8;


public class SavingsAccount {
//Instance Variables
    // interest rate for all accounts, hint: static
    // balance for currrent account
    private static double annualInterestRate;
    private double savingsBalance;

// constructor
    // creates a new account with the specified balance
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public SavingsAccount(double savingsBalance, double rate) {
        this.savingsBalance = savingsBalance;
        annualInterestRate = rate;
    }

// methods
    //get account balance
    public void setSavingsBalance(double savingsBalance) {
        if (savingsBalance <= 0) {
            throw new IllegalArgumentException("Balance cannot be zero");
        }
        this.savingsBalance += savingsBalance;
    }
    // set account balance
    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    // calculate monthly interest, hint: need to update the balance
    public double getMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
        return monthlyInterest;
    }

    public double getMonthlyInterestRate() {
        return savingsBalance;
    }
    // set modify interest rate, hint: static
    public static void setAnnualInterestRate(double InterestRate){
        if ( annualInterestRate <= 0) {
            throw new IllegalArgumentException("invalid selection");
        }
        annualInterestRate = InterestRate;
    }
    // get annual interest rate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // display account info with balance
    public String toString() {
        return String.format("Balance: %.2f\n");
    }

} // end class SavingsAccount


//Ex 8.6 (Savings Account Class)
//        Create a class "SavingsAccount"
//        use a "static" variable "annualInterestRate" to store the annual intererst rate for all account holders
//        Each object of the class contains a "private" instance variable "savingsBalance" indicating the amount the saver currently has on deposit
//        Provide method "calculateMonthlyInterest" to calculate the monthly interesting by "multiplying" the savingsBalance by annualInterestRate
//        divided by 12 (monthlyInterest = savingsBalance * annualInterestRate / 12) then add to "savings-Balance".
//
//        Provide a "static" method "modifyInterestRate" that "sets" the annualInterestRate to a new value.
//        Write a program "SavingsAccountTest.java".
//        Instantiate TWO savingsAccount objects "saver1", and "saver2", with balances of $2000.00 and $3000.00 respectively.
//        Set "annualInterestRate" to "4%"
//        Calculate the monthly interest for each of 12 months
//        Print new balances for both savers.
//        Set the annualInterestRate to "%5" and calculate the next months interest
//        Print new balances for both savers.

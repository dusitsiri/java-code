package lesson3inheritance.bankaccount;

public class SavingsAccountBadDesign extends BankAccount {
    private double interest;

    // shadow variable -- DO NOT DECLARE SHADOW VARIABLE
    private double balance; // shadow variable
    // shadow variable -- DO NOT DECLARE SHADOW VARIABLE

    public SavingsAccountBadDesign(double interest) {
        this.interest = interest;
    }

    public void addInterest() {
        double amount = getBalance() * interest;
        deposit(amount);
    }

}

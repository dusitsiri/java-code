package lesson3inheritance.bankaccount;

public class CheckingAccount extends BankAccount {
    private int withdrawCount;

    private static final int LIMIT = 3;
    private static final int FEE = 10;

    // ---- override : adjust feature but still reuse code from superclass -----
    @Override
    public void withdraw(double amount) {
        withdrawCount++;

        double fee = 0;
        if (withdrawCount > LIMIT) {
            fee = FEE;
        }
        super.withdraw(amount + fee);
    }
}

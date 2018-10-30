package lesson9multithreading.multithread;

/**
   A bank account has a balance that can be changed by
   deposits and withdrawals.
 */
public class BankAccountNotSafe
{

	private double balance;
	private String id;

	/**
      Constructs a bank account with a zero balance.
	 */
	public BankAccountNotSafe()
	{
		balance = 0;
	}

	public String getID() {
		return id;
	}
	/**
      Deposits money into the bank account.
      @param amount the amount to deposit
	 */
	public void deposit(double amount)
	{
			System.out.print("Depositing " + amount);
			double newBalance = balance + amount;
			System.out.println(", new balance is " + newBalance);
			balance = newBalance;
	}

	/**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
	 * @throws InterruptedException 
	 */
	public void withdraw(double amount)
	{
			System.out.print("Withdrawing " + amount);
			double newBalance = balance - amount;
			System.out.println(", new balance is " + newBalance);
			balance = newBalance;
	}
	/**
      Gets the current balance of the bank account.
      @return the current balance
	 */
	public double getBalance()
	{
		return balance;
	}
}

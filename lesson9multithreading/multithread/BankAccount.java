package lesson9multithreading.multithread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
   A bank account has a balance that can be changed by
   deposits and withdrawals.
 */
public class BankAccount
{

	private double balance;
	private String id;
	private Lock balanceLock;
	private Condition sufficientCondition;

	/**
      Constructs a bank account with a zero balance.
	 */
	public BankAccount()
	{
		balance = 0;
		balanceLock = new ReentrantLock();
		sufficientCondition = balanceLock.newCondition();
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
		// avoid data race / race condition
		balanceLock.lock();

		try {
			System.out.print("Depositing " + amount);
			double newBalance = balance + amount;
			System.out.println(", new balance is " + newBalance);
			balance = newBalance;

			// avoid deadlock
			sufficientCondition.signalAll();

		} finally {
			balanceLock.unlock();
		}
	}

	/**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
	 * @throws InterruptedException 
	 */
	public void withdraw(double amount) throws InterruptedException
	{
		// avoid data race / race condition
		balanceLock.lock();

		try {
			// avoid deadlock
			while (balance < amount)
				sufficientCondition.await();

			System.out.print("Withdrawing " + amount);
			double newBalance = balance - amount;
			System.out.println(", new balance is " + newBalance);
			balance = newBalance;

		} finally {
			balanceLock.unlock();
		}

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

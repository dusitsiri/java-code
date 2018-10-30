package lesson7exception;

/**
 * This class represents a bank account.
 * @author usa
 *
 */
public class BankAccount {

	private double balance; 

	public BankAccount(double initialBalance) {  
		balance = initialBalance;
	}

	public void deposit(double amount) {  
		balance = balance + amount;
	}

	/**
	 * This method decreases amount of balance.
	 * @param amount Amount of money to be withdrawn.
	 * @throws InsufficientFundException
	 */
	public void withdraw(double amount) throws InsufficientFundException {  
		if (amount < 0)
			throw new IllegalArgumentException("amount " + amount + " < 0");

		if (balance < amount) 
			throw new InsufficientFundException();

		balance = balance - amount;
	}

	public double getBalance() {
		return balance; 
	}

}

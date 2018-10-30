package lesson1designatm.version2;

public class ATM {
	private Bank bank; // composition/association
	private Customer currentCustomer;      // composition/association
	private BankAccount currentAccount;    // composition/association
	private int state;

	public static final int START = 1;
	public static final int TRANSACT = 2;

	public ATM(Bank bank) {
		this.bank = bank;
		this.state = START;
	}

	public void reset() {
		currentCustomer = null;
		currentAccount = null;
		state = START;
	}

	public void validateCustomer(int custId, int pin) throws InvalidAccountException {
		assert state == START;

		if (bank.validateCustomer(custId, pin)) {
			currentCustomer = bank.findCustomer(custId);
			currentAccount = currentCustomer.getAccount();
			state = TRANSACT;
		} else {
			throw new InvalidAccountException("Id or Pin is incorrect.");
		}
	}

	public void withdraw(double value) {
		assert state == TRANSACT;
		currentAccount.withdraw(value);
	}

	public void deposit(double value) {
		assert state == TRANSACT;
		currentAccount.deposit(value);
	}

	public double getBalance() {
		assert state == TRANSACT;
		return currentAccount.getBalance();
	}

	public void transfer(int toCustId, double amount) {
		assert state == TRANSACT;

		Customer receivingCustomer = bank.findCustomer(toCustId);
		BankAccount receivingAccount = receivingCustomer.getAccount();

		currentAccount.withdraw(amount);
		receivingAccount.deposit(amount);
	}

	protected int getState() {
		return state;
	}
}

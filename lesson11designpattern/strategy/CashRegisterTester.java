package lesson11designpattern.strategy;

public class CashRegisterTester {

	public static void main(String[] args) {
		CashRegister registerCA = new CashRegister(new CATax());
		
		registerCA.recordPurchase(60);
		registerCA.recordPurchase(40);
		registerCA.calculateTax();
		registerCA.enterPayment(200);
		
		double change = registerCA.giveChange();
		System.out.println(change);

		CashRegister registerNY = new CashRegister(new NYTax());

		registerNY.recordPurchase(1000);
		registerNY.calculateTax();
		registerNY.enterPayment(1100);
		
		change = registerNY.giveChange();
		System.out.println(change);
	}
}

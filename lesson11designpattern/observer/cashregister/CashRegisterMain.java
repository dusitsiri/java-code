package lesson11designpattern.observer.cashregister;

import java.io.IOException;

public class CashRegisterMain {
    public static void main(String[] args) {
        CashRegister regis = new CashRegister();
        TotalObserver totalObs = new TotalObserver();
        SaleFileObserver fileObs = null;

        try {
            fileObs = new SaleFileObserver("sale.txt");
        } catch (IOException e) {
            System.err.println("Problem opening/reading sale.txt file");
        }

        regis.registerObserver(totalObs);
        regis.registerObserver(fileObs);

        regis.recordPurchase(80);
        regis.recordPurchase(30);
        regis.calculateTax();
        regis.enterPayment(200);
        double change = regis.giveChange();
        System.out.println("change: "+change);

        fileObs.close();
    }
}

package lesson1designatm.version1;

import java.util.Scanner;

public class ATMSimulator {

    private ATM theATM;

    public void setup() {
        Bank theBank = new Bank("SW Bank");
        theATM = new ATM(theBank);
        Customer cust1 = new Customer(1, 111, "James");
        Customer cust2 = new Customer(2, 222, "Kate");
        theBank.addCustomer(cust1);
        theBank.addCustomer(cust2);
    }

    public void run() {

        Scanner in = new Scanner(System.in);

        System.out.println("===== Welcome to SW Bank =====");

        while (true)
        {
            int state = theATM.getState();
            if (state == ATM.START)
            {
                System.out.print("Enter customer number: ");
                int number = in.nextInt();
                System.out.print("Enter PIN: ");
                int pin = in.nextInt();

                try {
                    theATM.validateCustomer(number, pin);
                } catch (InvalidAccountException e) {
                    System.out.println("Error: "+e.getMessage()+" Please try again.");
                }
            }
            else if (state == ATM.TRANSACT)
            {
                System.out.println("Balance=" + theATM.getBalance());
                System.out.print("A=Deposit, B=Withdrawal, C=Transfer, D=Logout: ");
                String command = in.next();
                if (command.equalsIgnoreCase("A"))
                {
                    System.out.print("Amount: ");
                    double amount = in.nextDouble();
                    theATM.deposit(amount);
                }
                else if (command.equalsIgnoreCase("B"))
                {
                    System.out.print("Amount: ");
                    double amount = in.nextDouble();
                    theATM.withdraw(amount);
                }
                else if (command.equalsIgnoreCase("C"))
                {
                    System.out.print("Transfer To: ");
                    int transferTo = in.nextInt();
                    System.out.print("Amount: ");
                    double amount = in.nextDouble();
                    theATM.transfer(transferTo, amount);
                }
                else if (command.equalsIgnoreCase("D")) {
                    theATM.reset();
                }
                else
                    System.out.println("Illegal input!");
            }
        }

    }
}

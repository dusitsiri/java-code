package lesson2static;

public class MainStatic {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(1000);
        BankAccount b2 = new BankAccount(2000);

        System.out.println("B1: "+b1.getId());
        System.out.println("B1: "+b1.getBalance());

        System.out.println("B2: "+b2.getId());
        System.out.println("B2: "+b2.getBalance());

        // เรียกใช้ static method จาก object หรือ class ก็ได้
        b1.getAccountCount();
        BankAccount.getAccountCount();

    }
}

package lesson2static;

public class BankAccount {

   private int id;         // instance variable (object variable)
   private double balance; // instance variable (object variable)

   private static int accountCount = 0; // static variable (class variable)

   // DRY --- DON'T REPEAT YOURSELF
   // ให้ใช้ public BankAccount() { this(0); } เพื่อลดความซ้ำซ้อนของโค้ด
   // แทนการเขียน constructor แบบที่ถูก comment ด้านล่าง
   //public BankAccount() {
   //   accountCount++;
   //   this.id = accountCount;
   //   balance = 0;
   //}
   public BankAccount() {
      this(0);
   }
   public BankAccount(double initialBalance) {
      accountCount++;
      this.id = accountCount;
      balance = initialBalance;
   }
   // static method
   public static int getAccountCount() {
      return accountCount;
   }
   public int getId() {
      return id;
   }
   public void deposit(double amount) {
      balance = balance + amount;
   }
   public void withdraw(double amount) {
      balance = balance - amount;
   }
   public double getBalance() {
      return balance; 
   }
}


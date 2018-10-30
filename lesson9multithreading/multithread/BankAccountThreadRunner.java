package lesson9multithreading.multithread;

/**
   This program runs threads that deposit and withdraw
   money from the same bank account. 
*/
public class BankAccountThreadRunner
{
   public static void main(String[] args)
   {
      BankAccount account = new BankAccount();
      final double AMOUNT = 100;
      final int REPETITIONS = 20;
      final int THREADS = 20;

      for (int i = 1; i <= THREADS; i++)
      {  Thread dt;
         DepositRunnable d = new DepositRunnable(
            account, AMOUNT, REPETITIONS);
          dt = new Thread(d);
          dt.start();
         WithdrawRunnable w = new WithdrawRunnable(
            account, AMOUNT, REPETITIONS);

         Thread wt = new Thread(w);
         
         wt.start();
      }
   }
}


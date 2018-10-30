package lesson9multithreading.multithread;

public class GreetMain {

	public static void main(String[] args) {
		GreetingRunnable r1 = new GreetingRunnable("Hello");
		GreetingRunnable r2 = new GreetingRunnable("Bye");

		// ---- sequential ----
//		r1.run();
//		r2.run();

		// ---- multithreading ----
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

	}

}

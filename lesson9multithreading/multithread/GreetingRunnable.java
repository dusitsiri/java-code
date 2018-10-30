package lesson9multithreading.multithread;

import java.util.Date;

public class GreetingRunnable implements Runnable {
	private String greet;

	public GreetingRunnable(String g) {
		greet = g;
	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				Date now = new Date();
				System.out.println(now + " " + greet);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(this+" is interrupted");
		}
	}


}

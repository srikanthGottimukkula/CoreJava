package multiThreading;

class User {
	double balance = 5000;

	public void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	synchronized void withdraw(int amount) {

		System.out.println("going to withdraw:" + amount);
		delay(300);
		if (balance < amount) {
			System.out.println("insufficient amount!!");
		}
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		balance -= amount;
		System.out.println("The remaining amount is:" + balance);

	
	}

	synchronized void deposite(int amount) {

		System.out.println("going to deposite:" + amount);
		delay(300);
		balance += amount;
		System.out.println("The total amount is:" + balance);
		notify();
	}

}

public class gfds {
	public static void main(String[] args) {

		User u = new User();
		new Thread() {
			public void run() {
				u.withdraw(6000);
			}
		}.start();
		new Thread() {
			public void run() {
				u.deposite(5000);
			}
		}.start();

	}
}

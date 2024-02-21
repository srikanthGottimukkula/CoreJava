package multiThreading;

class Customer {
	double balance = 1000;

	public void delay(int millis) {

		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void withdraw(int amount) {
		System.out.println("withdraw is happening with the amount" + amount);
		delay(300);
		if (balance < amount) {
			System.out.println("Insufficient balance");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("withdraw is successfull remaining balnce is " + balance);
	}

	public synchronized void deposite(int amount) {
		System.out.println("deposite is happening with the amount" + amount);
		delay(300);
		balance += amount;
		System.out.println("deposite successfull available balance is " + balance);
		notify();
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		Customer c = new Customer();
		Runnable obj = new Runnable() {

			@Override
			public void run() {
				c.withdraw(2000);
//				c.deposite(3000);

			}

		};
		Runnable obj1 = new Runnable() {

			@Override
			public void run() {
				c.deposite(2000);

			}

		};

		Thread t = new Thread(obj, "withdraw");
		Thread t1 = new Thread(obj1, "deposite");
		t.start();
		t1.start();
	}

}

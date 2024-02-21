package multiThreading;
//By implements Thread
class Thread2 implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(i);
		}

	}
}

public class MyThread2 {

	public static void main(String[] args) {

		// create the our class thread2
		Thread2 obj1 = new Thread2();
		Thread2 obj2 = new Thread2();

		// Create the new thread class object
		Thread t1 = new Thread(obj1, "one");
		Thread t2 = new Thread(obj2, "two");

		// Start the thread class
		t1.start();
		t2.start();

	}

}

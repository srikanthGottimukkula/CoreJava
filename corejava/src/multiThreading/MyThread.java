package multiThreading;
//How can create the threads in java

//2 ways 1. Extending thread class into our own class
//2.Implementing Runnable Interface

class Thread1 extends Thread {
	public void run() {

		// showing the current thread name
		System.out.println(Thread1.currentThread().getName());

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

public class MyThread {

	public static void main(String[] args) {

		// create thread class
		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();
		
		//set the names of the threads
		t1.setName("one");
		t2.setName("Two");
		
		// start the thread class
		t1.start();
		t2.start();

	}

}

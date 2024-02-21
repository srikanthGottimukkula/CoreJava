package multiThreading;

class DemoThread extends Thread {

	public void run() {

		for (int i = 1; i <= 5; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}

public class MethodsInThreads {

	public static void main(String[] args) {

		DemoThread d1 = new DemoThread();
		DemoThread d2 = new DemoThread();
		DemoThread d3 = new DemoThread();
		System.out.println("state of thread" + d1.getName() + "=" + d1.getState()); //new 
		d1.start();
		

		System.out.println("state of thread" + d1.getName() + "=" + d1.getState());//runnable
		try {
			d1.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		d2.start();

		System.out.println("state of thread" + d1.getName() + "=" + d1.getState());//terminated
		d3.start();
		System.out.println("t1 thread of pripority" + d1.getPriority()); //priority

	}

}

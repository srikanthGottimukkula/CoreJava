package multiThreading;
//By using runnable method 
//synchronized method
class Table {

	public void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void printTable(int num) {
		for (int i = 1; i < 10; i++) {
			delay(100);
			System.out.println(num * i);
		}

	}
}

public class SynchronizationMethod {

	public static void main(String[] args) {
		Table t = new Table();

		Runnable obj = new Runnable() {

			@Override
			public void run() {
				t.printTable(5);

			}

		};
		Runnable obj1 = new Runnable() {
			
			@Override
			public void run() {
				t.printTable(6);
				
			}
			
		};

		Thread t1 = new Thread(obj, "five table");
		Thread t2 = new Thread(obj1, "sixth table");
		t1.start();
		t2.start();

	}

}

package multiThreading;
//By using runnable method 
//synchronized block
class Table2 {
	

	public void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void printTable(int num) {
		synchronized (this) {
			delay(300);
			for (int i = 1; i < 11; i++) {
				System.out.println(num * i);
			}
		}
	}

}

public class synchronizedBlock {

	public static void main(String[] args) {
		Table2 t = new Table2();
		Runnable obj = new Runnable() {

			@Override
			public void run() {
				t.printTable(6);

			}

		};

		Thread t1 = new Thread(obj, "sixth table");
		t1.start();

	}

}

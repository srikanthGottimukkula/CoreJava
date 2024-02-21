package multiThreading;

class Tables {
//	public void delay(int millis) {
//		try {
//			Thread.sleep(millis);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//
//	}

	public void printTable(int num) {
		synchronized (this) {
			for (int i = 1; i < 10; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
//				delay(500);
				System.out.println(num * i);
			}

		}
	}

}

class Ithread extends Thread {
	Tables t;

	public Ithread(Tables t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread1 extends Thread {
	Tables t;

	public MyThread1(Tables t) {
		this.t = t;
	}

	public void run() {
		t.printTable(6);
	}

}

public class SB {

	public static void main(String[] args) {
		Tables t = new Tables();
		Ithread m = new Ithread(t);
		MyThread1 m1 = new MyThread1(t);

		m.start();
		m1.start();

	}

}

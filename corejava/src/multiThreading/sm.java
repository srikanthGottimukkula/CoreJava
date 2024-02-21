package multiThreading;

class Table1 {
	
	public void dealy(int millis) {
	try {
		Thread.sleep(millis);
	} catch (InterruptedException e) {	
		e.printStackTrace();
	}
	}
	
	public synchronized void printTable(int num) {
		for (int i = 1; i < 11; i++) {
			dealy(300);
			System.out.println(num*i);
		}
	}
	
}

public class sm {
public static void main(String[] args) {
	
	Table1 t = new Table1();
	
	Runnable obj = new Runnable(){

		@Override
		public void run() {
			t.printTable(4);
			
			
		}
		
	};
	
	Thread t1 = new Thread(obj,"four table");
	Thread t2 = new Thread(obj, "sixth table");
	
	t1.start();
	t2.start();
	
}
}

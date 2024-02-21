package abstraction;

interface Bank {
	void account();
}

class SBI implements Bank {
	public void account() {
		System.out.println("SBI account not working!!");
	}
}

class HDFC implements Bank{
	public void account() {
		System.out.println("HDFC account was working !!");
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.account();
		Bank b = new HDFC();
		b.account();	
	}

}

package statics_nonstatics;

public class NonStatic {
	
	int i ;
	{
		System.out.println("inside non static block !!");
	}
	public void nonStatic() {
		System.out.println("inside the non static method!!");
	}
	public static void static1() {
		System.out.println("inside the non static method!!");
	}
	public static void main(String[] args) {
		System.out.println("inside the main method!!");
		//non-static variables/methods we can access by using only objects reference
		NonStatic ns = new NonStatic();		
		System.out.println(ns.i=10);
		ns.nonStatic();	
	}	
}

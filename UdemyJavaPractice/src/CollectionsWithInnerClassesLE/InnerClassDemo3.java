package CollectionsWithInnerClassesLE;

interface Interfdemo1 {
	public void m1();
}

public class InnerClassDemo3 {

	int x = 10; // instance variable

	public void m2() {
		int y = 11; // LE local variable always final.
		Interfdemo1 d = () -> {
			System.out.println(x);
			System.out.println(y);
		};
		d.m1();
	}

	public static void main(String[] args) {
		InnerClassDemo3 icd = new InnerClassDemo3();
		icd.m2();
	}

}
//multiple local variable we can't create in the LE once we are calling the local variable.
//otherwise we will get CTE. 

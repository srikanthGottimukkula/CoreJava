package CollectionsWithInnerClassesLE;

interface Interf12 {
	public void m1();
}

public class InnerClassDemo2 {
	int x = 10;

	public void m2() {

		Interf12 i = () -> {
			int x = 11;
			System.out.println(this.x);
		};
		i.m1();

	}

	public static void main(String[] args) {
		InnerClassDemo2 d = new InnerClassDemo2();
		d.m2();
	}

}
//only we can access in outside instance variable only not in local variable.
//Inside LE whatever variable we declared i,e local variable only. 'this' refers outside instance variable only
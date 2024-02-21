package CollectionsWithInnerClassesLE;

interface Interf {
	public void m1();
}

public class InnerClassDemo1 {

	int x = 10;

	public void m2() {
		Interf i = new Interf() {
			int x = 19;

			public void m1() {
				System.out.println(this.x);
			}

		};
		i.m1();
	}
	public static void main(String[] args) {
		InnerClassDemo1 d = new InnerClassDemo1();
		d.m2();
		}
}

//inside inner class variable only access i,e instance variable. outside instance variable not access.
//'this' refers only inside variable only. not outside .
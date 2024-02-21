package CollectionsWithInnerClassesLE;

interface Interfdemo
{
	public void m1();
}

public class Demo {
	
	int x=10;
	
//	public void m2() {
//		Interfdemo i = new Interfdemo() {
//			
//			int x=11;
//			public void m1() {
//			System.out.println(this.x);
//				
//			}
//		};
//		i.m1();
//	}
	
	public void m2() {
		Interfdemo i = ()->{
			
			int x=12;
			
				System.out.println(this.x);
			
		};
		i.m1();
	}
	
	public static void main(String[] args) {
	Demo d = new Demo();
	d.m2();
	}

}

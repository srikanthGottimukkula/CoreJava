package CollectionsWithInnerClassesLE;

public class InnerClassesDemo {

	public static void main(String[] args) {
//		Runnable r = () -> {
//			for (int i = 0; i < 10; i++) {
//				System.out.println("child Thread!!");
//			}
//		};
		
		Thread t = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
			System.out.println("child Thread!!");
		}
		});
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread!!");
		}

	}
}

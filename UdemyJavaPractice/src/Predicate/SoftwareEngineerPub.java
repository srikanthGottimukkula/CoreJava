package Predicate;

import java.util.function.Predicate;

class SoftwareEngineer {

	String name;
	int age;
	boolean isHavingGF;

	public SoftwareEngineer(String name, int age, boolean isHavingGF) {
		super();
		this.name = name;
		this.age = age;
		this.isHavingGF = isHavingGF;
	}

	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", age=" + age + ", isHavingGF=" + isHavingGF + "]";
	}

}

public class SoftwareEngineerPub {
	public static void main(String[] args) {

		SoftwareEngineer[] list = { new SoftwareEngineer("Srikanth", 18, true),
				new SoftwareEngineer("Abhiram", 17, false), new SoftwareEngineer("Srikrishna", 24, true),
				new SoftwareEngineer("SriRam", 25, false), new SoftwareEngineer("Abhi", 16, true)

		};

		Predicate<SoftwareEngineer> allowed = se -> se.age >= 18 && se.isHavingGF == true;
		System.out.println("The Allowed members of pub!!");
		for (SoftwareEngineer swe : list) {
			if (allowed.test(swe)) {
				System.out.println(swe);
			}
		}

	}
}

package encapsulation;

public class encapsulation {

	private int i;
	private int j;
	private String name;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public static void main(String[] args) {
		encapsulation ep = new encapsulation();
		ep.setI(1);
		ep.setJ(2);
		ep.setName("srikanth");
		System.out.println(ep.getI());
		System.out.println(ep.getJ());
		System.out.println(ep.getName());
	}
}

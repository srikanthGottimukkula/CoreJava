package streams;

import java.util.Objects;

public class Student {

	private String name;
	private String id;
	private String address;
	private double fee;

	@Override
	public int hashCode() {
		return Objects.hash(address, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", address=" + address + ", fee=" + fee + "]";
	}

	public Student(String name, String id, String address, Double fee) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.fee=fee;
	}

	public Student() {
		super();
	}

}

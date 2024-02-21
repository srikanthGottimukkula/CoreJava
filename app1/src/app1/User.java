package app1;

public class User {
	
	int id;
	String name;
	public User(int id, String name) {

		this.id = id;
		this.name = name;
	}
	public User() {
		
	}
	
	public String sleep()
	{
		System.out.println("my name is :"+name);
		return name;
	}
}

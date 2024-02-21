package java8features;
//MethodRef by using constructor

interface Messageble {
	Message getMessage(String msg);
}

class Message {

	public Message(String msg) {
		System.out.println(msg);
	}
}

public class ConstructorReference {

	public static void main(String[] args) {
		Messageble ms = Message::new;
		ms.getMessage("Hello Constructor!!!");
	}

}

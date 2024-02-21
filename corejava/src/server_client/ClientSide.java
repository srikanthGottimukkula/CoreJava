package server_client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;

public class ClientSide {

	public static void main(String[] args) {
		System.out.println("Client is Started!!");

		try {
			Socket socket = new Socket(InetAddress.getLocalHost(), 5000);
			System.out.println("Client is sending the request!!");
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String s = dis.readUTF();
			System.out.println("Data From Server" + s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

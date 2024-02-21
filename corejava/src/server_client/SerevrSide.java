package server_client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SerevrSide {
	public static void main(String[] args) {
		System.out.println("Server is started!!");
		
		try (ServerSocket ss = new ServerSocket();){
			Socket s = ss.accept();
			System.out.println("Connected to the Client!!");
			
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF("Hello from the server side!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}

}

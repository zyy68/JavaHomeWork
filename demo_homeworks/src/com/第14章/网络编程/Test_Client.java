package com.��14��.������;
import java.net.*;
import java.io.*;
public class Test_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String serverName = "localhost";
	      int port = 6066;
	      try
	      {
	         System.out.println("���ӵ�������" + serverName + " ���˿ںţ�" + port);
	         Socket client = new Socket(serverName, port);
	         System.out.println("Զ��������ַ��" + client.getRemoteSocketAddress());
	         OutputStream outToServer = client.getOutputStream();
	         DataOutputStream out = new DataOutputStream(outToServer);
	 
	         out.writeUTF("Hello from " + client.getLocalSocketAddress());
	         InputStream inFromServer = client.getInputStream();
	         DataInputStream in = new DataInputStream(inFromServer);
	         System.out.println("��������Ӧ�� " + in.readUTF());
	         client.close();
	      }catch(IOException e)
	      {
	         e.printStackTrace();
	      }
	}

}

package com.��14��.������;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
public class Test_Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port = 6066;
		
		//1.TCP
	     try
	      {
	         Thread t = new GreetingServer(port);
	         t.run();

	      }catch(IOException e)
	      {
	         e.printStackTrace();
	      }
	      
		
		
	      //2.m tcp
		/*
		ServerSocket serverSocket = null;
		int clientNumber=0;
		try {
			 serverSocket = new ServerSocket(port);
		      serverSocket.setSoTimeout(100000);
		} 
		catch(IOException e){}
		
		while(true) {
			try
	         {
				 
			     
					 System.out.println("�ȴ�Զ�����ӣ��˿ں�Ϊ��" + serverSocket.getLocalPort() + "...");
			            //�ȴ��ͻ�������
			            Socket server = serverSocket.accept();
			            new MultiTalkServerThread(server, clientNumber).start();
			            clientNumber++;
			            System.out.println("�ͻ�������Ϊ:" + clientNumber);
			            //��ÿͻ��˵ĵ�ַ
			            System.out.println("Զ��������ַ��" + server.getRemoteSocketAddress());
			            //��ʼ���ܿͻ��˵���Ϣ
			            DataInputStream in = new DataInputStream(server.getInputStream());
			            System.out.println(in.readUTF());
			            //������Ϣ���ͻ���
			            DataOutputStream out = new DataOutputStream(server.getOutputStream());
			            out.writeUTF("лл�����ң�" + server.getLocalSocketAddress() + "\nGoodbye!");
			            //�ر�Socket
			            server.close();
	         }catch(SocketTimeoutException s)
	         {
	             System.out.println("Socket timed out!");
	             break;
	          }catch(IOException e)
	          {
	             e.printStackTrace();
	             break;
	          }
		}
		*/
	     
	}

}

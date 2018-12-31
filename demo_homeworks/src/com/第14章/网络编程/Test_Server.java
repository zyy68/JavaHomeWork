package com.第14章.网络编程;

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
				 
			     
					 System.out.println("等待远程连接，端口号为：" + serverSocket.getLocalPort() + "...");
			            //等待客户端连接
			            Socket server = serverSocket.accept();
			            new MultiTalkServerThread(server, clientNumber).start();
			            clientNumber++;
			            System.out.println("客户端数量为:" + clientNumber);
			            //获得客户端的地址
			            System.out.println("远程主机地址：" + server.getRemoteSocketAddress());
			            //开始接受客户端的信息
			            DataInputStream in = new DataInputStream(server.getInputStream());
			            System.out.println(in.readUTF());
			            //发送信息到客户端
			            DataOutputStream out = new DataOutputStream(server.getOutputStream());
			            out.writeUTF("谢谢连接我：" + server.getLocalSocketAddress() + "\nGoodbye!");
			            //关闭Socket
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

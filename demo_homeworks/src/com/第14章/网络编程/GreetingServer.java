package com.第14章.网络编程;


import java.net.*;
import java.io.*;
public class GreetingServer extends Thread
{
   private ServerSocket serverSocket;
   public int counte_num=0;
   public GreetingServer(int port) throws IOException
   {
      serverSocket = new ServerSocket(port);
      serverSocket.setSoTimeout(100000);
   }
 
   public void run()
   {
      while(true)
      {
         try
         {
            System.out.println("等待远程连接，端口号为：" + serverSocket.getLocalPort() + "...");
            //等待客户端连接
            counte_num++;// 客户端数量增加
            Socket server = serverSocket.accept();
            //counte_num++;// 客户端数量增加
            System.out.println("客户端数量为:" + counte_num);
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
   }
}
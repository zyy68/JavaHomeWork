package com.��14��.������;


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
            System.out.println("�ȴ�Զ�����ӣ��˿ں�Ϊ��" + serverSocket.getLocalPort() + "...");
            //�ȴ��ͻ�������
            counte_num++;// �ͻ�����������
            Socket server = serverSocket.accept();
            //counte_num++;// �ͻ�����������
            System.out.println("�ͻ�������Ϊ:" + counte_num);
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
   }
}
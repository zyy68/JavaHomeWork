package com.µÚ14ÕÂ.ÍøÂç±à³Ì;

import java.net.*;
public class MultiTalkServerThread extends Thread{
	public int clientNumber=0;
	public Socket socket;
    public MultiTalkServerThread(Socket socket, int clientNumber)    {
        this.socket = socket;
        this.clientNumber = clientNumber + 1;
    }
    public void run(){
        
    }
}


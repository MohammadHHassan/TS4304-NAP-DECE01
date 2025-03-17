package day12.spherecalcmulticlientapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server
{
	public static void main(String[] args)
	{
		try
		{
			// Creating server socket with port number 9101
			ServerSocket socketServer = new ServerSocket(9101);
			System.out.println("Server started at " + new Date());
			
			while(true)		// Forever loop to accept multiple clients
			{
				// Accepting socket request from client
				Socket socket = socketServer.accept();
				System.out.println("\nClient has been connected.");
				
				// Implement thread to accept inputs and to give outputs
				// from and to multiple clients at the same time.
				new Thread(new Runnable()
				{
					@Override
					public void run()
					{
						try
						{
							// Enable reading data from the client
							DataInputStream fromClient = new DataInputStream(socket.getInputStream());
							// Enable writing data to the client
							DataOutputStream toClient = new DataOutputStream(socket.getOutputStream());
							
							while(true)			// Forever loop for sphere calculator app
							{
								double radius = fromClient.readDouble();	// Read radius value from client
								
								double volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
								
								toClient.writeDouble(volume);		// Send volume value to the client
								
								System.out.println("\nReceived radius: " + radius);
								System.out.println("Sent volume: " + volume + "\n");
							}
						}
						catch (IOException e)
						{
							e.printStackTrace();
						}
						
					}
				}).start();
				
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}

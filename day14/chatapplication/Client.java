package day14.chatapplication;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			// Requesting socket to server with IP address and port number 9101
			Socket socket = new Socket("localhost", 9101);
			
			// Enable reading data from the server
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());
			// Enable writing data to the server
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
			
			Scanner scanner = new Scanner(System.in);		// Enable user's input
			
			System.out.print("Please enter your chat ID: ");
			String chatID = scanner.nextLine();			// Store user's chat ID
			toServer.writeUTF(chatID);					// Send chat ID to server
			
			// Display the name of other client
			System.out.println("You are connected with " + fromServer.readUTF());
			
			new Thread(new Runnable()
			{
				@Override
				public void run()
				{
					while(true)			// Forever loop to accept multiple messages simultaneously
					{
						try
						{
							if(fromServer.available()>0)	// If there is any incoming text from other client
							{
								String receivedMsg = fromServer.readUTF();	// Read the text
								System.out.println(">>> " + receivedMsg);	// Display the text
							}
						}
						catch (IOException e)
						{
							e.printStackTrace();
						}
					}
				}
			}).start();
			
			while(true)			// Forever loop to enable writing text anytime
			{
				String msg = scanner.nextLine();	// Store user's text
				toServer.writeUTF(msg);				// Send the message to the server
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}

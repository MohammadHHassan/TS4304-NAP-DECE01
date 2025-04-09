package day13.additionquizmulticlient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DecimalFormat;
import java.util.Date;

public class Server
{
	public static void main(String[] args)
	{
		try
		{
			// Declaration of server socket with port number 9101
			ServerSocket socketServer = new ServerSocket(9101);
			// Display the date and time when the server is started
			System.out.println("Server started at " + new Date());
			
			// Declaration of decimal format in 2 decimal places
			DecimalFormat df = new DecimalFormat("#.##");
			
			while(true)			// Forever loop to accept multiple clients
			{
				// Accepting socket request from client
				Socket socket = socketServer.accept();
				
				// Implement thread to serve multiple clients simultaneously
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
							
							String name = fromClient.readUTF();		// Receive the user's name from client
							System.out.println("\n" + name + " has been connected.\n");
							
							int questionNumber=0;
							
							while(true)		// Forever loop to send and receive data from client
							{
								questionNumber++;		// Increment the question number in sequence
								
								// Generate 2 random numbers between 10-99 and send to client
								int randomNumber1 = 10 + (int)(Math.random()*((99-10)+1));
								toClient.writeInt(randomNumber1);
								int randomNumber2 = 10 + (int)(Math.random()*((99-10)+1));
								toClient.writeInt(randomNumber2);
								
								int answer = fromClient.readInt();		// Receive answer from the client
								
								String text = "\n" + name + "'s Q" + questionNumber + ": " + randomNumber1 + " + " + randomNumber2 + "?";
								
								if(answer==(randomNumber1+randomNumber2))	// If the answer is correct
								{
									System.out.println(text + " Answered " + answer + " [CORRECT]");
								}
								else		// If the user answer incorrectly
								{
									System.out.println(text + " Answered " + answer + " [INCORRECT]");
								}
								
								double totalMarks = fromClient.readDouble();
								System.out.println(name + " current marks = " + df.format(totalMarks) + "%");
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

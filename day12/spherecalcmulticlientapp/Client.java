package day12.spherecalcmulticlientapp;

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
			// Requesting socket to server with port number 9101
			Socket socket = new Socket("localhost", 9101);
			
			// Enable reading data from the server
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());
			// Enable writing data to the server
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
			
			// Enable user's input for the client
			Scanner scanner = new Scanner(System.in);
			
			while(true)			// Forever loop for sphere calculator app
			{
				System.out.print("Please enter the radius value: ");
				double radius = scanner.nextDouble();
				
				toServer.writeDouble(radius);	// Sending the radius value to server
				
				double volume = fromServer.readDouble();	// Read volume value from server
				
				System.out.println("\nSent radius: " + radius);
				System.out.println("Received volume: " + volume + "\n");
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}

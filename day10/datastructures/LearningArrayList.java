package day10.datastructures;

import java.util.ArrayList;

public class LearningArrayList
{
	public static void main(String[] args)
	{
		// Declaration of ArrayList with String type
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("Mohammad");
		nameList.add("Haji");
		nameList.add("Hassan");
		
		for(String a : nameList)
		{
			System.out.print(a + " ");
		}
		
		nameList.add("Haji");
		nameList.add("Hashim");
		
		System.out.println();		// Create a new line
		
		for(String b : nameList)
		{
			System.out.print(b + " ");
		}
		
		nameList.remove(1);
		nameList.remove(3);
		
		System.out.println();
		
		for(String c : nameList)
		{
			System.out.print(c + " ");
		}
		
		nameList.add(1, "Bin");
		
		System.out.println();
		
		for(String d : nameList)
		{
			System.out.print(d + " ");
		}
		
		System.out.println("\n\nnameList[2] = " + nameList.get(2));
		System.out.println("Size of the nameList Array = " + nameList.size());
	}
}

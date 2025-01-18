package day2;

public class LearningIf
{
	public static void main(String[] args)
	{
		int a=1, b=3;
		
		if(a<b)				// The condition is if a is less than b
		{
			System.out.println("a is less than b");
		}
		else if(a>b)		// The condition is if a is greater than b
		{	
			System.out.println("a is greater than b");
		}
		else				// Else for a==b
		{
			System.out.println("a is equal to b");
		}
	}
}

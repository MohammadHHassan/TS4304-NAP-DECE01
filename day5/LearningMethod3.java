package day5;

public class LearningMethod3
{
	public static void main(String[] args)
	{
		displayName("Haji Mohammad");
		System.out.println(printName("Haji Hassan"));
	}
	
	public static void displayName(String name)
	{
		System.out.println("My name is " + name);
	}
	
	public static String printName(String name)
	{
		String text = "My name is " + name;
		return text;
	}
}

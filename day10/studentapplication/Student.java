package day10.studentapplication;

public class Student
{
	private int id;			// Instance variable id
	private String name;	// Instance variable name
	private int age;		// Instance variable age
	private static int numberOfStudents=0;		// Class variable
	
	public Student(String name, int age)		// Constructor for student class
	{
		this.name = name;
		editAge(age);
		numberOfStudents++;		// Increment numberOfStudents by 1 each time a student is created
		this.id = numberOfStudents;		// Store the numberOfStudents data in instance variable id
	}
	
	public int getId()		// Method to retrieve the id of the student (getter)
	{
		return id;
	}
	
	public String getName()		// Method to retrieve the name of the student (getter)
	{
		return name;
	}
	
	public int getAge()		// Method to retrieve the age of the student (getter)
	{
		return age;
	}
	
	public void editAge(int age)	// Method to edit the age of the existing student (setter)
	{
		this.age = age;
	}
}

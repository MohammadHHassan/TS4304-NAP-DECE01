package day10.studentapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Student student1 = new Student("Didi", 20);
		Student student2 = new Student("Jojo", 21);
		Student student3 = new Student("Nana", 22);
		Student student4 = new Student("Bingo", 23);
		Student student5 = new Student("Pak Atan", 24);
		Student student6 = new Student("Tatak", 25);
		
		Module module1 = new Module("TS4304", "Network Application Programming", 3);
		Module module2 = new Module("TS4302", "Microwave Systems", 5);
		
		System.out.println("Module: " + module1.getCode() + " " + module1.getName());
		printAddingStudent(module1, student1);
		printAddingStudent(module1, student2);
		printAddingStudent(module1, student3);
		printAddingStudent(module1, student4);
		
		System.out.println("\nModule: " + module2.getCode() + " " + module2.getName());
		printAddingStudent(module2, student5);
		printAddingStudent(module2, student5);
	}
	
	// Method to enroll the student in a module
	public static void printAddingStudent(Module module, Student student)
	{
		System.out.println("Adding student: " + student.getId() + ". " + student.getName());
		
		// Display successful/unsuccessful enrollment
		System.out.println("Successful? " + module.addStudent(student));
	}
}

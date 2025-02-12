package day9.shape2d3dapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Shape2D [] shapes2D = new Shape2D[5];
		
		shapes2D[0] = new Circle("Blue", 2.5);
		shapes2D[1] = new Rectangle("Black", 5.2, 3.3);
		shapes2D[2] = new Square("White", 10);
		shapes2D[3] = new Circle("Pink", 8.9);
		shapes2D[4] = new Square("Red", 5.55555);
		
		for(int i=0 ; i<shapes2D.length ; i++)
		{
			System.out.println("--- Shape [" + i + "] ---");
			System.out.println(shapes2D[i] + "\n");
		}
		
		int numberOfCircle=0, numberOfRectangle=0, numberOfSquare=0;
		
		for(int j=0 ; j<shapes2D.length ; j++)
		{
			if(shapes2D[j] instanceof Circle)
			{
				numberOfCircle++;
			}
			
			if(shapes2D[j] instanceof Rectangle)
			{
				numberOfRectangle++;
			}
			
			if(shapes2D[j] instanceof Square)
			{
				numberOfSquare++;
			}
		}
		
		System.out.println("Number of circle: " + numberOfCircle);
		System.out.println("Number of rectangle: " + numberOfRectangle);
		System.out.println("Number of square: " + numberOfSquare);
	}
}

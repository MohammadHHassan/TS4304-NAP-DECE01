package day7.shapeapplication;

public class Square extends Shape		// Square inherits from Shape
{
	double side;
	
	public Square(String colour, double side)
	{
		super(colour);
		this.side = side;		// Store the data from parameter to instance variable
	}
	
	public double getArea()
	{
		return side*side;
	}
	
	public double getPerimeter()
	{
		return 4*side;
	}
}

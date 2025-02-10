package day8.improvedshapeapplication;

public class Rectangle extends Shape
{
	double length, breadth;
	
	public Rectangle(String colour, double length, double breadth)
	{
		super(colour);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double getArea()
	{
		return length*breadth;
	}

	@Override
	public double getPerimeter()
	{
		return (2*length)+(2*breadth);
	}

	@Override
	public String toString() {
		return "Rectangle [ Length = " + length + ", Breadth = " + breadth + ", Colour = " + colour + ", Area = "
				+ getArea() + ", Perimeter = " + getPerimeter() + " ]";
	}
}

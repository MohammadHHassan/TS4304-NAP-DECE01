package day9.shape2d3dapplication;

public class Rectangle extends Shape implements Shape2D
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
		return "Rectangle [ Length = " + df.format(length) + ", Breadth = " + df.format(breadth) + ", Colour = " + colour + ", Area = "
				+ df.format(getArea()) + ", Perimeter = " + df.format(getPerimeter()) + " ]";
	}
}

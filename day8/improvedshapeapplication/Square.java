package day8.improvedshapeapplication;

public class Square extends Shape
{
	double side;
	
	public Square(String colour, double side)
	{
		super(colour);
		this.side = side;
	}

	@Override
	public double getArea()
	{
		return Math.pow(side, 2);
	}

	@Override
	public double getPerimeter()
	{
		return 4.0*side;
	}

	@Override
	public String toString() {
		return "Square [ Side = " + side + ", Colour = " + colour + ", Area = " + getArea() + ", Perimeter = "
				+ getPerimeter() + " ]";
	}
}

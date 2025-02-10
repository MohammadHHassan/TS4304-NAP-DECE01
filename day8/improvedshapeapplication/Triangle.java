package day8.improvedshapeapplication;

public class Triangle extends Shape
{
	double base, height;
	
	public Triangle(String colour, double base, double height)
	{
		super(colour);
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea()
	{
		return 0.5*base*height;
	}

	@Override
	public double getPerimeter()
	{
		double c = Math.sqrt((base*base)+(height*height));
		return c+base+height;
	}

	@Override
	public String toString() {
		return "Triangle [ Base = " + base + ", Height = " + height + ", Colour = " + colour + ", Area = " + df.format(getArea())
				+ ", Perimeter = " + df.format(getPerimeter()) + " ]";
	}
}

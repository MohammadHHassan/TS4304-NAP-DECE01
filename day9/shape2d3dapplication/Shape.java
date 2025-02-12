package day9.shape2d3dapplication;

import java.text.DecimalFormat;			// Library for decimal format

public abstract class Shape				// Abstract class Shape
{
	DecimalFormat df = new DecimalFormat("#.##");		// Declare decimal format in 2dp
	
	String colour;						// Shape attribute declaration

	public Shape(String colour)			// Shape constructor with colour parameter
	{
		this.colour = colour;			// Store parameter variable to instance variable
	}	
}

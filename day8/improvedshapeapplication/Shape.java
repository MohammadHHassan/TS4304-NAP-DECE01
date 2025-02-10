package day8.improvedshapeapplication;

import java.text.DecimalFormat;

public abstract class Shape		// Abstract class, cannot create object from this 
{
	DecimalFormat df = new DecimalFormat("#.##");	// Implement 2 d.p. decimal format
	
	String colour;				// Instance variable

	public Shape(String colour) 	// Shape constructor with colour parameter
	{
		editColour(colour);		// Store colour parameter to colour instance
	}
	
	public void editColour(String colour)	// Method to edit the existing shape's colour
	{
		this.colour = colour;
	}
	
	public abstract double getArea();			// Declare abstract method to get area
	public abstract double getPerimeter();		// Declare abstract method to get perimeter
}

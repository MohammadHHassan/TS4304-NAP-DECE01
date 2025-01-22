package day5;

import java.text.DecimalFormat;

public class LearningDecimalPlaces
{
	public static void main(String[] args)
	{
		double pi = 3.14159;
		
		System.out.println("Pi = " + pi);
		System.out.printf("Pi in 2 d.p = %.2f\n", pi);
		
		DecimalFormat a = new DecimalFormat("#.###");	// Declaration of Decimal Format in 3 d.p
		DecimalFormat b = new DecimalFormat("#.#");		// Declaration of Decimal Format in 1 d.p
		
		System.out.println("Pi in 3 d.p = " + a.format(pi));
		System.out.println("2.555555 in 3 d.p = " + a.format(2.555555));
		System.out.println("Math.PI in 3 d.p = " + a.format(Math.PI));
		
		System.out.println("190.88765 in 1 d.p = " + b.format(190.88765));
		System.out.println("Pi in 1 d.p = " + b.format(pi));
	}
}

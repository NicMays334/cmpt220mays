/**
 *	@author Nic Mays
 *	@version problem 11.1
 */

import java.util.Scanner;
abstract class GeometricObject 
{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/** Construct a default geometric object */
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	/** Construct a geometric object with specified color and filled value */
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	/** return color */
	public String getColor() {
		return color;
	}
	
	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}
	
	/** Return filled. Since filled is boolean, the method is called isFilled */
	public boolean isFilled() {
		return filled;
	}
	
	/** Set filled value */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	/** Get date created */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	@Override
	public String toString() {
		return "created on "+ dateCreated + "\ncolor: " + color +
		  " and filled: " + filled;
	}
	
	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();	
}

class Triangle extends GeometricObject
{
	private double side1;
	private double side2;
	private double side3;
	
	//no arg constructor
	Triangle()
	{
		this.side1=1;
		this.side2=1;
		this.side3=1;
	}

	Triangle(double s1, double s2, double s3)
	{
		this.side1=s1;
		this.side2=s2;
		this.side3=s3;
	}
	
	//accessor method for side1
	public double getSide1()
	{
		return(this.side1);
	}
	
	//accessor method for side2
	public double getSide2()
	{
		return(this.side2);
	}
	
	//accessor method for side3
	public double getSide3()
	{
		return(this.side3);
	}
	
	//returns area of the triangle
	@Override
	public double getArea()
	{
		double s = this.side1+this.side2+this.side3;
		double area = s*(s-side1)*(s-side2)*(s-side3);
		
		return(Math.sqrt(area));
	}

	//returns the perimeter of this triangle
	@Override
	public double getPerimeter()
	{
		return(this.side1+this.side2+this.side3);
	}
	
	//returns the fields in a string
	@Override
	public String toString()
	{
		String s = "Triangle: side1 = "+this.side1+
				"side2 = "+this.side2+
				"side3 = "+this.side3;
		return(s);
	}
}

public class prob11_1 
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		Triangle t1;
		double s1;
		double s2;
		double s3;
		String s=" ";
		boolean filled;
		
		System.out.print("Enter Side 1 for Triangle: ");
		s1=reader.nextDouble();
		System.out.print("Enter Side 2 for Triangle: ");
		s2=reader.nextDouble();
		System.out.print("Enter Side 3 for Triangle: ");
		s3=reader.nextDouble();
		t1 = new Triangle(s1, s2, s3);
		
		System.out.print("What color is the Triangle?: ");
		s=reader.next();
		t1.setColor(s);
		
		System.out.print("Is the triangle filled? (Y/N): ");
		s=reader.next();
		s=s.toLowerCase();
		if(s.charAt(0)=='y')
			filled=true;
		else
			filled=false;
		
		t1.setFilled(filled);
		
		System.out.println("\n\nTRIANGLE T1: \n");
		System.out.println("Area: \t\t"+t1.getArea());
		System.out.println("Perimeter: \t"+t1.getPerimeter());
		System.out.println("Color: \t\t"+t1.getColor());
		System.out.println("Filled?: \t"+t1.isFilled());
		reader.close();
	}
}

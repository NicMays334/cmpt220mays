import java.util.Scanner;
abstract class GeometricObject 
{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	protected GeometricObject() 
	{
		dateCreated = new java.util.Date();
	}

	/** Construct a geometric object with color and filled value */
	protected GeometricObject(String color, boolean filled) 
	{
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() 
	{
		return color;
	}

	/** Set a new color */
	public void setColor(String color) 
	{
		this.color = color;
	}

	/** Return filled. Since filled is boolean,
	 *  the get method is named isFilled */
	public boolean isFilled() 
	{
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) 
	{
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() 
	{
		return dateCreated;
	}

	@Override
	public String toString() 
	{
		return "created on " + dateCreated + "\ncolor: " + color +
			"\nfilled: " + filled;
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
	public Triangle()
	{
		this.side1=1;
		this.side2=1;
		this.side3=1;
	} 

	public Triangle(double side1, double side2, double side3) 
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle(double side1, double side2, double side3, String color, boolean filled) 
	{
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		this.setColor(color);
		this.setFilled(filled); 
	}

	//accessor for side1
	public double getSide1() 
	{
		return this.side1;
	}

	//mutator for side1
	public void setSide1(double side1) 
	{
		this.side1 = side1;
	}
	
	//accessor for side2
	public double getSide2() 
	{
		return this.side2;
	}

	//mutator for side 2
	public void setSide2(double side2) 
	{
		this.side2 = side2;
	}

	//acessor for side 3
	public double getSide3()
	{
		return this.side3;
	}

	//mutator for side 3
	public void setSide3(double side3)
	{
		this.side3 = side3;
	}

	@Override //returns area
	public double getArea() 
	{
		double sides = (side1+side2+side3)/2;
		return Math.sqrt(sides*(sides-side1)*(sides-side2)*(sides-side3));
	}

	@Override //returns perimeter
	public double getPerimeter() 
	{
		return this.side1 + this.side2 + this.side3;
	}

	@Override //returns string listing of fields
	public String toString() 
	{
		String listing = super.toString();
		listing+="\nArea: "+this.getArea();
		listing+="\nPerimeter: "+this.getPerimeter();
		
		return listing;
	}
}

public class prob13_1
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		String color = "";
		double s1, s2, s3;
		boolean filled;
		
		System.out.print("Enter side 1: ");
		s1=reader.nextDouble();
		System.out.print("Enter side 2: ");
		s2=reader.nextDouble();
		System.out.print("Enter side 3: ");
		s3=reader.nextDouble();
		
		System.out.print("Enter a color: ");
		color=reader.next();
		System.out.print("is it filled? (true/false): ");
		filled=reader.nextBoolean();
		
		Triangle t1 = new Triangle(s1, s2, s3, color, filled);
		System.out.println("\n"+t1.toString());
		
		reader.close();
	}
}
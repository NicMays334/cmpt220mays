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

class Circle extends GeometricObject implements Comparable<Circle> 
{
	private double radius;

	//no arg constructor
	public Circle() 
	{
		this.radius=1;
	}

	public Circle(double radius) 
	{
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) 
	{
		super(color, filled);
		this.radius = radius;
	}

	//accessor for radius
	public double getRadius() 
	{
		return radius;
	}

	//mutator for radius
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}

	@Override
	//returns Pi*r^2
	public double getArea() 
	{
		return radius * radius * Math.PI;
	}

	//returns 2*r
	public double getDiameter() 
	{
		return 2 * radius;
	}

	@Override
	//returns 2*pi*r
	public double getPerimeter() 
	{
		return 2 * radius * Math.PI;
	}

	@Override
	//true if radius is equal
	public boolean equals(Object o) 
	{
		return this.compareTo((Circle)o) == 0;
	}

	@Override
	//compare to. returns 1 if greater, -1 is less than, 0 if equal
	public int compareTo(Circle o) 
	{
		if (this.radius > o.radius)
			return 1;

		else if (this.radius < o.radius)
			return -1;

		else
			return 0;
	}

	@Override
	//returns listing of fields
	public String toString() 
	{
		String s ="";
		s+=super.toString();
		s+="Radius: "+this.radius;
		s+="Area: "+this.getArea();
		s+="Perimeter: "+this.getPerimeter();
		return s;
	}
}

public class prob13_9 
{
	public static void main( String[] args)
	{
		Circle c1 = new Circle(5, "red", true);
		Circle c2 = new Circle(5, "blue", false);
		Circle c3 = new Circle(9, "green", true);
		System.out.println("Test Results: \n");
		
		//equals or not block
		if(c1.compareTo(c2)==0)
		{
			System.out.print("The "+c1.getColor()+" circle is equal to");
			System.out.println("the "+c2.getColor()+" circle.");
		}
		else 
		{
			System.out.print("The "+c1.getColor()+" circle is not equal to ");
			System.out.println("the "+c2.getColor()+" circle.");
		}
		
		//greater than or not block
		if(c3.compareTo(c2)>0)
		{
			System.out.print("The "+c3.getColor()+" circle is greater than ");
			System.out.println("the "+c2.getColor()+" circle.");
		}
		
		else
		{
			System.out.print("The "+c3.getColor()+" circle is not greater than");
			System.out.println("the "+c2.getColor()+" circle.");
		}
	}
}

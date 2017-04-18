abstract class GeometricObject implements Comparable<GeometricObject>
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

	@Override
	//returns 1 if greater, -1 if less than, 0 if equal
	public int compareTo(GeometricObject go)
	{
		if(this.getArea()>go.getArea())
			return 1;

		else if(this.getArea()>go.getArea())
			return -1;

		else
			return 0;
	}

	public static GeometricObject max(GeometricObject o, GeometricObject o2) 
	{
		return o.compareTo(o2)==1 ? o:o2;
	}

	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();
}

class Rectangle extends GeometricObject 
{
	private double width;
	private double height;

	//no arg
	public Rectangle() 
	{
		this.width=1;
		this.height=1;
	}

	public Rectangle(double width, double height) 
	{
		this.width = width;
		this.height = height;
	}

	public Rectangle(double width, double height, String color, boolean filled) 
	{
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}

	//accessor for width
	public double getWidth() 
	{
		return width;
	}

	//mutator for width
	public void setWidth(double width) 
	{
		this. width = width;
	}

	//accessor for height
	public double getheight() {
		return height;
	}

	//mutator for height
	public void setheight(double height) 
	{
		this.height = height;
	}

	@Override 
	//return area
	public double getArea() {
		return width * height;
	}

	@Override 
	//return perimeter
	public double getPerimeter() 
	{
		return 2 * (width * height);
	}

	@Override //returns data field listing
	public String toString() 
	{
		String s = super.toString();
		s+="\nWidth: "+this.width;
		s+="\nHeight: "+this.height;
		s+="\nArea: "+this.getArea();
		s+="\nPerimeter: "+this.getPerimeter();
		return s;
	}
}

class Circle extends GeometricObject
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
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	//accessor for radius
	public double getRadius() {
		return radius;
	}

	//mutator for radius
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}

	@Override 
	//returns area
	public double getArea() 
	{
		return radius * radius * Math.PI;
	}

	//returns 2*radius
	public double getDiameter() 
	{
		return 2 * radius;
	}

	@Override
	//returns 2*pi*radius
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	@Override
	//returns listing of data fields;
	public String toString() 
	{
		String s = super.toString();
		s+="\nRadius: "+this.radius;
		s+="\nDiameter: "+this.getDiameter();
		s+="\nArea"+this.getArea();
		s+="\nPerimeter: "+this.getPerimeter();
		return s;
	}
}

public class prob13_5
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle(3, "Green", true);
		Circle c2 = new Circle(6, "Red", false);
		String s = "The ";
		
		Rectangle r1 = new Rectangle(4, 5, "Blue", true);
		Rectangle r2 = new Rectangle(6, 3, "Yellow", false);
		
		System.out.print("Test Results: \n\n");
		s+=Circle.max(c1, c2).getColor();
		s+=" circle is larger.";
		System.out.println(s);
		
		s="The "+Rectangle.max(r1, r2).getColor();
		s+=" rectangle is larger.";
		System.out.println(s);
	}
}
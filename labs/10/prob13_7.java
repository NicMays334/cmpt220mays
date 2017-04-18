interface Colorable 
{
	//coloring directons
	String howToColor();
}
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

class Square extends GeometricObject implements Colorable
{
	private double sideLength;
	
	//no arg constructor
	Square()
	{
		this.sideLength=1;
	}
	
	Square(double sideLength, String color, boolean filled)
	{
		super(color, filled);
		this.sideLength=sideLength;
	}
	
	//accessor for side length
	public double getSideLength()
	{
		return this.sideLength;
	}
	
	//mutator for side length
	public void setSideLength(double sideLength)
	{
		this.sideLength=sideLength;
	}
	
	@Override
	//returns area side*side
	public double getArea()
	{
		return (this.sideLength*this.sideLength);
	}
	
	@Override
	//returns perimeter side*4
	public double getPerimeter()
	{
		return this.sideLength*4;
	}
	
	@Override
	public String howToColor()
	{
		return "Color all four sides";
	}
	
	@Override
	public String toString()
	{
		String s="";
		s+=super.toString();
		s+="\nSide Length: "+this.getSideLength();
		s+="\nArea: "+this.getArea();
		s+="\nPerimeter: "+this.getPerimeter();
		return s;
	}
}

class prob13_7 
{
	public static void main(String[] args)
	{
		Square sq = new Square(5, "Green", false);
		System.out.println("Test Results: \n");
		System.out.println(sq.toString());
		System.out.println("How to Color: "+sq.howToColor());
	}
}

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

class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>
{
	private double side;
	
	//no arg
	Octagon()
	{
		this.side=1;
	}
	
	Octagon(double side)
	{
		this.side=side;
	}
	
	//accessor method for side
	public double getSide()
	{
		return this.side;
	}
	
	public void setSide(double side)
	{
		this.side=side;
	}
	
	@Override
	//returns area
	public double getArea()
	{
		return(2+4/Math.sqrt(2)) * side * side;
	}
	
	@Override 
	//return perimeter side*8
	public double getPerimeter()
	{
		return 8*side;
	}
	
	@Override
	//compare to 
	public int compareTo(Octagon o)
	{
		if(getArea() > o.getArea())
			return 1;
		
		if(getArea() < o.getArea())
			return -1;
		
		else
			return 0;
	}
	
	@Override
	//clone method
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	@Override
	//returns listing of field
	public String toString()
	{
		String s="";
		s+="\nSide Length: "+this.side;
		s+="\nArea: "+this.getArea();
		s+="\nPerimeter: "+this.getPerimeter();
		return s;
	}
}

public class prob13_11 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Octagon oc = new Octagon(5);
		Octagon oc2 = new Octagon();
		
		//cloning
		oc2 = (Octagon) oc.clone();
		
		System.out.println("Test Results: \n");
		
		if(oc.compareTo(oc2)==0)
			System.out.println("Clone Succesful.");
	}
}

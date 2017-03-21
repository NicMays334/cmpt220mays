/**
 * 	@author Nic Mays	
 *	@version problem 10.11
 */

class Circle2D
{
	private double x;
	private double y;
	double radius;
	
	//getter method for X point value
	public double getX()
	{
		return(this.x);
	}
	
	//getter method for Y point value
	public double getY()
	{
		return(this.y);
	}
	
	//getter method for radius data field
	public double getRadius()
	{
		return(this.radius);
	}
	
	//default constructor
	Circle2D()
	{
		this.x=0;
		this.y=0;
		this.radius=1;
	}
	
	//constructor arg1 = x point, arg2 = y point, rad = radius
	Circle2D(double arg1, double arg2, double rad)
	{
		this.x=arg1;
		this.y=arg2;
		this.radius=rad;
	}
	
	//returns the area of the circle
	public double getArea()
	{
		double area = radius*radius;
		area*=Math.PI;
		return(area);
	}
	
	//returns the perimeter of the circle
	public double getPerimeter()
	{
		return(2*Math.PI*radius);
	}
	
	//reutrns true if the specified point lies inside the circle
	public boolean contains(double x, double y)
	{
		double d = x - this.x;
		double d2 = y - this.y;
		double r = this.radius*this.radius;
		d = d*d;
		d2 = d2*d2;
		d = d+d2;
		if(d<r)
			return(true);
		return(false);
	}
	
	//returns true if the circle is contained in the specified circle
	public boolean contains(Circle2D circle)
	{
		double d;
		double d1 =  circle.x - this.x;
		double d2 = circle.y - this.y;
		d1 = d1*d1;
		d2 = d2*d2;
		d = d1+d2;
		d = Math.sqrt(d);
		if(this.radius > (d+circle.radius))
			return(true);
		
		return false;
	}
	
	//returns true if the circle overlaps the specified circle
	public boolean overlaps(Circle2D circle)
	{
		double r1 = Math.abs(this.radius-circle.radius);
		double r2 = this.radius+circle.radius;
		r1 = r1*r1;
		r2 = r2*r2;
		
		double d;
		double d1 =  circle.x - this.x;
		double d2 = circle.y - this.y;
		d1 = d1*d1;
		d2 = d2*d2;
		d = d1+d2;
		if(r1<=d&&d<=r2)
			return(true);
		return(false);
	}
}

public class prob10_11 
{
	public static void main(String[] args) 
	{
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		System.out.println("Area: "+c1.getArea());
		System.out.println("Perimeter: "+c1.getPerimeter());
		
		System.out.println("Contain Point Test: ");
		System.out.println(c1.contains(3,3)+"\n");
		
		System.out.println("Contain Circle Test: ");
		System.out.println(c1.contains(new Circle2D(4, 5, 10.5))+"\n");
		
		System.out.println("Overlap Circle Test: ");
		System.out.println(c1.contains(new Circle2D(3, 5, 2.3))+"\n");

	}
}

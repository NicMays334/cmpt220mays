/**
 * 	@author Nic Mays	
 *	@version problem 9.1
 */

class Rectangle 
{
	private double width;
	private double height;
	
	Rectangle()
	{
		this.width=1;
		this.height=1;
	}
	
	Rectangle(double myWidth, double myHeight)
	{
		this.width=myWidth;
		this.height=myHeight;
	}
	
	//accessor for width
	public double getWdith()
	{
		return(this.width);
	}
	
	public double getHeight()
	{
		return(this.height);
	}
	//accessor that returns area
	public double getArea()
	{
		double area = this.width*this.height;
		return(area);
	}
	
	//accessor that returns perimeter
	public double getPerimeter()
	{
		double side1 = this.width*2;
		double side2 = this.height*2;
		
		return(side1+side2);
	}
}

public class prob9_1
{
	public static void main(String[] args) 
	{
		Rectangle rec1 = new Rectangle(4, 40);
		Rectangle rec2 = new Rectangle(3.5, 35.9);
		
		System.out.println("Rectangle 1:");
		System.out.println("\tWidth: "+rec1.getWdith());
		System.out.println("\tHeight: "+rec1.getHeight());
		System.out.println("\tArea: "+rec1.getArea());
		System.out.println("\tPerimeter: "+rec1.getPerimeter());
		
		System.out.println("\nRectangle 2:");
		System.out.println("\tWidth: "+rec2.getWdith());
		System.out.println("\tHeight: "+rec2.getHeight());
		System.out.println("\tArea: "+rec2.getArea());
		System.out.println("\tPerimeter: "+rec2.getPerimeter());

	}
}

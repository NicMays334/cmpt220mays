/**
 * 	@author Nic Mays	
 *	@version problem 9.1
 */

public class Rectangle 
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
	
	//accessor that returns Area of a rectangle LxW
	public double getArea()
	{
		return(this.width*this.height);
	}
	
	//accessor that returns perimeter of a rectangle L+L+W+W
	public double getPerimeter()
	{
		double side1 = this.width*2;
		double side2 = this.height*2;
		
		return(side1+side2);
	}
}

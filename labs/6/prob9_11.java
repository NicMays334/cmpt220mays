/**
 * 	@author Nic Mays	
 *	@version probl3m 9.11
 */

import java.util.Scanner;
class LinearEquation 
{
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	LinearEquation(double a1, double b1, double c1, double d1, double e1, double f1)
	{
		this.a=a1;
		this.b=b1;
		this.c=c1;
		this.d=d1;
		this.e=e1;
		this.f=f1;
	}

	//getter method for a
	public double getA()
	{
		return(this.a);
	}

	//getter method for b
	public double getB()
	{
		return(this.b);
	}

	//getter method for c
	public double getC()
	{
		return(this.c);
	}

	//getter method for d
	public double getD()
	{
		return(this.d);
	}	

	//getter method for e
	public double getE()
	{
		return(this.e);
	}

	//getter method for f
	public double getF()
	{
		return(this.f);
	}
	
	//returns true if the equation is solvable
	public boolean isSolvable()
	{
		double x = this.a*this.d;
		double y = this.b*this.c;
		
		if(x-y==0)
			return false;
		return(true);
	}
	
	//solves and returns for value x
	public double getX()
	{
		if(!this.isSolvable())
			return(0);
		
		double x=0;
		double n1 = this.e*this.d;
		double n2 = this.b*this.f;
		
		double d1 = this.a*this.d;
		double d2 = this.b*this.c;
		
		n1 = n1-n2;
		d1 = d1-d2;
		x = n1/d1;
		
		return(x);
	}
	
	//solves and returns for value y
	public double getY()
	{
		if(!this.isSolvable())
			return(0);
		
		double y = 0;
		double n1 = this.a*this.f;
		double n2 = this.e*this.c;
		
		double d1 = this.a*this.d;
		double d2 = this.b*this.c;
		
		n1 = n1-n2;
		d1 = d1-d2;
		y = n1/d1;
		
		return(y);
	}
}

public class prob9_11 
{

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		LinearEquation eq;
		double[] arr = new double[6];
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		char x = 'a';
		
		//prompts user entry
		for(int i = 0; i<6; i++, x++)
		{
			System.out.print("Enter value for "+x+": ");
			arr[i] = reader.nextInt();
		}
		
		//assignment
		a=arr[0];
		b=arr[1];
		c=arr[2];
		d=arr[3];
		e=arr[4];
		f=arr[5];
		
		eq = new LinearEquation(a, b, c, d, e, f);
		if(eq.isSolvable())
		{
			System.out.println("x = "+eq.getX());
			System.out.println("y = "+eq.getY());
		}
		else
			System.out.print("Equation has no solution");
		reader.close();
	}
}

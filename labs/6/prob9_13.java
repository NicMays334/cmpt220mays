package whatever;
/**
 * 	@author Nic Mays	
 *	@version problem 9.13
 */

import java.util.Scanner;
public class prob9_13
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Location loc;
		double matrix[][];
		int rows;
		int columns;
		
		
		System.out.print("Enter number of Rows: ");
		rows = input.nextInt();
		System.out.print("Enter number of Columns: ");
		columns = input.nextInt();
		matrix = new double[rows][columns];
		
		System.out.println("Enter the array: ");
		for(int i=0; i<matrix.length; i++)
			for(int j=0; j<matrix[0].length; j++)
				matrix[i][j] = input.nextDouble();
		
		loc = Location.locateLargest(matrix);
		System.out.print("The Location of the largest element is "+loc.maxValue);
		System.out.print(" at ("+loc.row+", "+loc.column+")");
		input.close();
	}
}

//Location class
class Location 
{
	int row;
	int column;
	double maxValue;
	
	Location()
	{
		row=0;
		column=0;
		maxValue=0;
	}
	
	Location(int row1, int col1, double maxValue1)
	{
		this.column=col1;
		this.row=row1;
		this.maxValue=maxValue1;
	}
	
	public static Location locateLargest(double[][] a)
	{
		double max = a[0][0];
		int row=0;
		int col=0;
		
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a[0].length; j++)
				if(a[i][j]>max)
				{
					max=a[i][j];
					row=i;
					col=j;
				}
		
		return(new Location(row, col, max));
	}
}

/**
 * 	@author Nic Mays
 *	@version problem 7.10
 */

import java.util.Scanner;
public class prob7_10 {
	/*
	 * Problem 7.10
 Problem 7.11
 Problem 7.14
 Problem 7.19
 Problem 8.1
 Problem 8.5
 Problem 8.7
 Problem 8.10
	 */
	public static int indexOfSmallestElement(double array[])
	{
		int min = 0;
		for(int i=0; i<array.length; i++)
			min = array[min]<=array[i]? min : i;
			
		return( (int) min );
	}
	
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		double array[] = new double[10];
		
		System.out.println("Please enter in 10 double values.");
		for(int i=0; i<array.length; i++)
		{
			System.out.print("Enter value #"+(i+1)+": ");
			reader.nextDouble();
		}
		
		System.out.println("\nIndex of smallest element: "+indexOfSmallestElement(array));
	}
}
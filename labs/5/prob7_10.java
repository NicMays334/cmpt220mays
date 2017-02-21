/**
 * 	@author Nic Mays
 *	@version problem 7.10
 */

import java.util.Scanner;
public class prob7_10 
{	
	public static int indexOfSmallestElement(double array[])
	{
		int min = 0;
		for(int i=0; i<array.length; i++)
			if(array[min]>array[i])
				min=i;
			
		return(min);
	}
	
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		double[] array = new double[10];
		
		System.out.println("Enter 10 numnbers: ");
		for(int i=0; i<array.length; i++)
			array[i]=reader.nextDouble();
		
		System.out.println("The smallest element is at position:"+indexOfSmallestElement(array));
		reader.close();
	}
}
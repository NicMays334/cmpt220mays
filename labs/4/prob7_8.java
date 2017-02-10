/**
 * 	@author Nic Mays	
 *	@version problem 7.8
 */

import java.util.Scanner;
public class prob7_8 
{
	public static int average(int[] array)
	{
		int sum = 0;
		for(int i=0; i<array.length; i++)
			sum+=array[i];
		
		return(sum/array.length);
	}
	
	public static double average(double[] array)
	{
		double sum = 0;
		for(int i=0; i<array.length; i++)
			sum+=array[i];
		
		return(sum/array.length);
	}
	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		double array[] = new double[10];
		System.out.println("Please enter 10 decimal values\n");
			
			for(int i=0; i<array.length; i++)
			{
				System.out.print("Enter decimal value #"+(i+1)+": ");
				array[i]=reader.nextDouble();
			}
			
			System.out.println("Average: "+average(array));
			reader.close();
	}
}
 /**
 * 	@author Nic Mays
 *	@version problem 7.11
 */

import java.util.Scanner;
public class prob7_11 
{
	
	public static double mean(double[] x)
	{
		double sum = 0;
		double n = x.length;
		for(int i=0; i<x.length; i++)
			sum+=x[i];
		
		return (sum/n);
	}
	
	public static double deviation(double[] x)
	{
		double mean = mean(x);
		double summation = 0;
		double stdDev = 0;
		for(int i=0; i<x.length; i++)
			summation+=Math.pow((x[i]-mean), 2);
		stdDev = Math.sqrt(summation/(x.length-1));
		
		return(stdDev);
	}
	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		double array[] = new double[10];
		
		System.out.println("Enter 10 numbers: ");
		for(int i=0; i<array.length; i++)
			array[i]=reader.nextDouble();
		
		System.out.printf("\n%s %.2f\n", "The mean is ", mean(array));
		System.out.printf("%s %.5f", "The standard deviation is ", deviation(array));
	}
}

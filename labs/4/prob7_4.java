/**
 * 	@author Nic Mays	
 *	@version problem 7.4
 */

import java.util.Scanner;
public class prob7_4 
{
	public static double computeAverage(double[] array, int arraySize)
	{
		double sum = 0;
		for(int i=0; i<arraySize; i++)
			sum+=array[i];
		
		return(sum/arraySize);
	}
	
	public static void main(String[] args) 
	{
		
		Scanner reader = new Scanner(System.in);
		double array[] = new double[100];
		double average = 0;
		int arraySize = 0;
		int greaterCount = 0;
		int lesserCount = 0;
		boolean exit = false;
		
		for(int i=0; i<100&&!exit; i++)
		{
			System.out.print("Enter score #"+(i+1)+": ");
			array[i]=reader.nextDouble();
			
			if(array[i]<0)
				exit=true;
				arraySize=i;
		}
		
		average = computeAverage(array, arraySize);
		
		for(int i=0; i<arraySize; i++)
		{
			if(array[i]>=average)
				greaterCount++;
			else if(array[i]<average)
				lesserCount++;
		}
		
		System.out.println("\nResults");
		System.out.println("==========");
		System.out.print("Average:        "+average);
		System.out.println("# of Scores >=: "+greaterCount);
		System.out.println("# of Scores <:  "+lesserCount);
		
		reader.close();
	}
}
/**
 *	@author Nic Mays
 *	@version problem 7.4
 */

import java.util.Scanner;
public class prob7_4 
{
	public static double computeAverage(double[] Array, int usedLength)
	{
		double sum = 0;
		for(int i=0; i<usedLength; i++)
			sum+=Array[i];
		
		System.out.println(sum);
		
		sum = sum/ (float) (usedLength-1);
		return(sum);
	}
	
	public static void main(String[] args) 
	{
		double[] Array = new double[100];
		Scanner reader = new Scanner(System.in);
		boolean exit = false;
		int pivot=0; //size of used array
		double average;
		int greaterCount=0;
		int lesserCount=0;
		
		for(; pivot<100 && !exit; pivot++)
		{
			System.out.print("Enter Score #" + (pivot+1) + ": ");
			Array[pivot]=reader.nextDouble();
			
			if(Array[pivot]<0)
				exit=true;
			
		}
		pivot--;
		average=computeAverage(Array, pivot);
		
		for(int i=0; i<pivot; i++)
		{
			if(Array[i]>=average)
				greaterCount++;
			
			else if(Array[i]<average)
				lesserCount++;
		}
		
			System.out.println("\nResults: ");
			System.out.println("=========================");
			System.out.println("# of Scores: " + (pivot-1));
			System.out.println("Average Score: " + average);
			System.out.println("# of Scores >= Average: " + greaterCount);
			System.out.println("# of Scores < Average: " + lesserCount);
			
			
		}
		
		
	}


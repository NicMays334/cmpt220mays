/**
 * 	@author Nic Mays
 *	@version problem 8.6
 */

import java.util.Scanner;
public class prob8_5 
{
	public static double[][] addMatrix(double[][] a, double[][] b)
	{
		if(a.length!=b.length||a[0].length!=b[0].length)
		{
			System.out.println("invalid dimensions");
			double matrix[][] = new double[0][0];
			return(matrix);
		}
		
		else
		{
			double matrix[][] = new double[a.length][a[0].length];
			for(int i=0; i<matrix.length; i++)
				for(int j=0; j<matrix[0].length; j++)
					matrix[i][j] = a[i][j] + b[i][j];
			
			return(matrix);
		}
	}
	
	public static void printRow(double matrix[][], int row)
	{
		for(int i=0; i<3; i++)
			System.out.print(matrix[row][i]+" ");
	}
	
	public static void main(String[] args) 
	{
		double matrix1[][] = new double[3][3];
		double matrix2[][] = new double[3][3];
		double matrix3[][] = new double[3][3];
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter matrix1: ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				matrix1[i][j]=reader.nextDouble();
			}
		}
		
		System.out.println("Enter matrix2: ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				matrix2[i][j]=reader.nextDouble();
			}
		}
		
		matrix3 = addMatrix(matrix1, matrix2);
		
		System.out.println("The matrices are added as follows: ");
		for(int i=0; i<3; i++)
		{
			printRow(matrix1, i);
			if(i==1)
				System.out.print("+ ");
			else
				System.out.print("  ");
			
			printRow(matrix2, i);
			if(i==1)
				System.out.print("= ");
			else
				System.out.print("  ");
			
			printRow(matrix3, i);
			System.out.println();
		}
	
		reader.close();
	}
}
/**
 * 	@author Nic Mays
 *	@version problem 8.1
 */
import java.util.Scanner;
public class prob8_1 
{
	public static double sumColumn(double[][] m, int columnIndex)
	{
		double sum = 0;
		
		for(int i=0; i<m.length; i++)
			sum+=m[i][columnIndex];
		
		return(sum);
	}
	
	public static void main(String[] args) 
	{
		double matrix[][] = new double[3][4];
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a "+matrix.length+ "-by-"+matrix[0].length+ " matrix row by row: ");
		for(int i=0; i<matrix.length; i++)
		{
			System.out.println("Enter row "+(i+1)+": ");
			
			for(int j=0; j<matrix[0].length; j++)
				matrix[i][j]=reader.nextDouble();
		}

		for(int i=0; i<matrix[0].length; i++)
		{
			System.out.println("Sum of the elements at column "+ i + " is "+ sumColumn(matrix, i));
		}
		reader.close();
	}
}
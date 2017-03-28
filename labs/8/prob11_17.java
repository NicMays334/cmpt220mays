/**
 *	@author Nic Mays
 *	@version problem 11.17
 */

import java.util.Scanner;
public class prob11_17
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int m=1;
		int n=1;
		double product;
		double square;
		boolean smallestSquare=false;
		System.out.print("Enter an integer m: ");
		m=reader.nextInt();
		
		/*This loop checks if the double is an integer. 
		 * A more efficient calculation than checking odd sequence factors*/
		while(!smallestSquare)
		{
			product=m*n;
			square=Math.sqrt(product);
			
			//if(is not an integer)
			if(!(Double.isFinite(square)&&square==Math.floor(square)))
				n++;
			else
				smallestSquare=true;
		}
				
		System.out.println("The smallest number n for m * n to be a perfect square is "+n);
		System.out.println("m * n is "+m*n);
		reader.close();
	}
}

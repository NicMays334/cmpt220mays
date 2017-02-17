/**
 *	@author Nic Mays
 *	@version problem 7.2
 */

import java.util.Scanner;
public class prob7_2 {

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		int x;
		
		for(int i=1; i<=10; i++)
		{
			System.out.print("Enter integer #" + (i) + ": ");
			x=reader.nextInt();
			
			s.append(Integer.toString(x)+" "); //builds string
			// JA: If you uyse a string to reverse the numbers, the numbers themselves 
			// JA: will be reversed
		}
		
		System.out.println("\nReverse Order:"+s.reverse());
		reader.close();
	}

}

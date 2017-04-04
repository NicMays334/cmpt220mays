/**
 * 	@author Nic Mays	
 *	@version
 */

import java.util.Scanner;
public class prob12_3 
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		int[] array = new int[100];
		int index;
		for(int i=0; i<array.length; i++)
		{
			array[i]= (int) (Math.random()*Integer.MAX_VALUE);
		}
		
		System.out.print("Enter an index of the array: ");
		index=reader.nextInt();
		
		//searching for an out of bounds exception
		try
		{
			System.out.println("array["+index+"] = "+array[index]);
		}  //throws an out of bounds message
		catch(ArrayIndexOutOfBoundsException x)
		{
			System.err.print("Out of Bounds");
		}
		reader.close();
	}
}

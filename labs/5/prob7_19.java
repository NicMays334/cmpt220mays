/**
 * 	@author Nic Mays
 *	@version problem 7.14
 */

import java.util.Scanner;
public class prob7_19 
{

	public static boolean isSorted(int[] list)
	{
		int temp=list[0];
		for(int i=1; i<list.length; i++)
		{
			if(list[i]>temp)
				temp = list[i];
			else
				return false;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		int array[]  = new int[5];
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter list: ");
		for(int i=0; i<array.length; i++)
			array[i]=reader.nextInt();
		System.out.print("This list is ");
		if(isSorted(array))
			System.out.println("sorted");
		else
			System.out.println("not sorted");
	}

}

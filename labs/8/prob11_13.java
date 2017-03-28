/**
 * 	@author Nic Mays	
 *	@version problem 11.13
 */

import java.util.ArrayList;
import java.util.Scanner;
public class prob11_13 
{
	//removes all duplicates in an array list
	public static void removeDuplicate(ArrayList<Integer> list)
	{
		int element;
		//sets the element to search for
		for(int i=0; i<list.size()-1; i++)
		{
			element=list.get(i);
			
			//iteratively searches and deletes duplicates
			for(int j=i+1; j<list.size();)
			{
				if(element==list.get(j))
					list.remove(j);
				else
					j++;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter ten integers: ");
		for(int i=1; i<=10; i++)	
			list.add(reader.nextInt());
		
		removeDuplicate(list);
		System.out.print("\nThe distinct integers are:  ");
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i)+" ");
		reader.close();
	}
}

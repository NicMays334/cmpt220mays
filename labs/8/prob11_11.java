/**
 *	@author Nic Mays
 *	@version problem 11.11
 */

import java.util.ArrayList;
import java.util.Scanner;
public class prob11_11 
{
	//Sorts ArrayList of integers implementing insertion sort
	public static void sort(ArrayList<Integer> list)
	{
		int temp=0;
		int j=0;
		for(int i=1; i<=list.size()-1; i++)
		{
			temp = list.get(i);
			for(j=i-1; j>=0&&temp<list.get(j); j--)
				list.set((j+1), list.get(j));
			list.set((j+1), temp);
		}
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner reader = new Scanner(System.in);
		
		for(int i=1; i<=5; i++)
		{
			System.out.print("Enter integer #"+i+": ");
			list.add(reader.nextInt());
		}
		
		sort(list);

		System.out.print("\nSorted List:  ");
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i)+" ");
		reader.close();
	}
}

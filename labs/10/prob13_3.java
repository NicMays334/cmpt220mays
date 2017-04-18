import java.util.*;
public class prob13_3 
{
	//impliments variation of insertion sort
	public static void sort(ArrayList<Number> list) 
	{
		int mindex; //minimum index
		Number sorted; // a minimum
		for (int i=0; i<list.size()-1; i++) 
		{
			sorted = list.get(i);
			mindex = i;
			
			for (int j=i+1; j<list.size(); j++) 
				if (sorted.doubleValue() > list.get(j).doubleValue())
				{
					sorted = list.get(j);
					mindex = j;
				}
			
			//swapping the last case
			if (mindex != i) 
			{
				list.set(mindex, list.get(i));
				list.set(i, sorted);
			} 
		}
	}

	public static void main(String[] args) 
	{
		ArrayList<Number> list = new ArrayList<Number>(); 
		
		//add numbers to list
		list.add(1);
		list.add(8);
		list.add(2.5);
		list.add(111);
		list.add(2.4);
		list.add(45);
		
		System.out.println("Unsorted List: ");
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i)+" ");
		
		//sort it
		sort(list);
		
		System.out.println("\n\nSorted List: ");
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i)+" ");
	}
}
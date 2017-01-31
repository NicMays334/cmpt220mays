/** 
 *	@author Nic Mays 
 *	@version problem 3.5
 */

import java.util.Scanner;
public class prob3_5 
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		String[] days = {"Sunday", "Monday", "Tuesday", 
				"Wednesday", "Thursday", "Friday", "Saturday"};
		short pointer;
		short temp;
		int counter=0;   
		
		
		System.out.print("Enter today's day: ");
		pointer=reader.nextShort();
		temp=pointer; 
		
		System.out.print("Enter the amount of days elapsed since today: ");
		counter=reader.nextInt();
		
		for(int i=0; i<counter; i++)
		{
			pointer++;
			if(pointer==7)
				pointer=0;
		}
		
		System.out.println("Today is "+days[temp]+" and the future day is "+days[pointer]);
		reader.close();
	}
}
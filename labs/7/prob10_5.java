/**
 *	@author Nic Mays
 *	@version problem 10.5
 */

import java.util.Scanner;
import java.util.Stack;
public class prob10_5
{
	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<Integer>();
		Scanner reader = new Scanner(System.in);
		int n;
		int counter = 2;
		
		System.out.print("Enter an integer: ");
		n=reader.nextInt();
		
		//Stores prime factors in a stack
		while(counter<=n)
		{
			if(n%counter==0)
			{
				stack.push(counter);
				n=n/counter;				
			}
			
			else
				counter++;
		}
		
		//prints the stack
		System.out.print("Factors: ");
		while(!stack.empty())
		{
			System.out.print(stack.pop()+" ");
		}
		reader.close();
	}
}

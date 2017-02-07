/**
 * 	@author Nic Mays
 * 	@version problem 5.1
 */

import java.util.Scanner;
public class prob5_1
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int n;
		int posCounter=0;
		int negCounter=0;
		int total=0;
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		do{
			n = reader.nextInt();
			total+=n;
			
			if(n>0)
				posCounter++;
			else if(n<0)
				negCounter++;
				
		}while(n!=0);
		System.out.println("The number of positives is: "+posCounter);
		System.out.println("The number of negatives is: "+negCounter);
		System.out.println("The total is: "+total);
		System.out.println("The average is: "+(float) total/(posCounter+negCounter));
		
		reader.close();
	}
}